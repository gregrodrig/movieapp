package es.uah.movieappEureka.daoEureka;

import es.uah.movieappEureka.modelEureka.Actor;
import es.uah.movieappEureka.modelEureka.Director;
import es.uah.movieappEureka.modelEureka.Genero;
import es.uah.movieappEureka.modelEureka.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

public interface IPeliculaJPA extends JpaRepository<Pelicula, Integer> {
    Set<Pelicula> findByTituloContainingIgnoreCase(String titulo);

    Set<Actor> findPeliculasByActorsContainingIgnoreCase(String actor);

    Set<Genero> findPeliculasByGenerosContainingIgnoreCase(String generos);

    Set<Director> findByDirectorsContainingIgnoreCase(String director);

    @Modifying
    @Transactional
    @Query(value = "" +
            "select * from movierater.pelicula pe inner join movierater.pais pa ON pa.idPais = pe.tblPais_idPais\n" +
            "left join movierater.pelicula_has_genero pg ON pg.tblPelicula_idPelicula = pe.idPelicula\n" +
            "left join movierater.genero ge On ge.idGenero = pg.tblGenero_idGenero\n" +
            "left join movierater.pelicula_has_director pd ON pd.tblPelicula_idPelicula = pe.idPelicula\n" +
            "left join movierater.director di on di.idDirector = pd.tblDirector_idDirector\n" +
            "left join movierater.pelicula_has_actor pac ON pac.tblPelicula_idPelicula = pe.idPelicula\n" +
            "left join movierater.actor ac ON ac.idActor = pac.tblActor_idActor\n" +
            "where ge.genero like concat('%', ?1, '%')\n" +
            "    or di.nombre like concat('%', ?1, '%')\n" +
            "    or ac.nombre like concat('%', ?1, '%')\n" +
            "    or ac.apellidos like concat('%', ?1, '%')\n" +
            "    or pe.titulo like concat('%', ?1, '%')", nativeQuery = true
    )
    Set<Pelicula> perliculasPorTodo(String search);

}