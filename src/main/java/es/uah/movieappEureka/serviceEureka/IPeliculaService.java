package es.uah.movieappEureka.serviceEureka;
import es.uah.movieappEureka.modelEureka.Actor;
import es.uah.movieappEureka.modelEureka.Director;
import es.uah.movieappEureka.modelEureka.Genero;
import es.uah.movieappEureka.modelEureka.Pelicula;

import java.util.Set;

public interface IPeliculaService {
    Set<Pelicula> buscarTodas();
    Pelicula buscarPeliculaPorId(Integer idPelicula);
    Set<Pelicula> buscarPeliculaPorTitulo(String titulo);
    Set<Pelicula> findPeliculaByGenerosContainsIgnoreCaseOrDirectorsContainingIgnoreCaseOrActorsContainingIgnoreCaseOrTituloContainsIgnoreCase(String search);
    Set<Genero> buscarPeliculaPorGenero(String generos);
    Set<Actor> buscarPeliculaPorActor(String actor);
    Set<Director> buscarPeliculaPorDirector(String director);

  /*  Director buscarPeliculaPorDirector(String director);
    Director buscarPeliculaPorDirector(String director);
    Set<Pelicula>  findPeliculaByActorsContainingIgnoreCaseOrDirectorsContainingIgnoreCaseOrGenerosContainingIgnoreCaseOrTituloContainingIgnoreCase(String actor, String director, String genero, String titulo);
   */
    void guardarPelicula(Pelicula pelicula);
    void eliminarPelicula(Integer idPelicula);
    void actualizarPelicula(Pelicula pelicula);
}
