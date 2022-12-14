package es.uah.movieapp.dao;

import es.uah.movieapp.model.Actor;
import es.uah.movieapp.model.Director;
import es.uah.movieapp.model.Genero;
import es.uah.movieapp.model.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Repository
public class PeliculaDAOImpl implements IPeliculaDAO{

    @Autowired
    IPeliculaJPA peliculaJPA;


    @Override
    public Set<Pelicula> buscarTodas() {
        return new HashSet<Pelicula>(peliculaJPA.findAll());
    }

    @Override
    public Pelicula buscarPeliculaPorId(Integer idPelicula) {
        Optional<Pelicula> optional = peliculaJPA.findById(idPelicula);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public Set<Pelicula> buscarPeliculaPorTitulo(String titulo) {
        return peliculaJPA.findByTituloContainingIgnoreCase(titulo);
    }

    @Override
    public Set<Pelicula> findPeliculaByGenerosContainsIgnoreCaseOrDirectorsContainingIgnoreCaseOrActorsContainingIgnoreCaseOrTituloContainsIgnoreCase(String search){
        return peliculaJPA.findPeliculaByGenerosContainsIgnoreCaseOrDirectorsContainingIgnoreCaseOrActorsContainingIgnoreCaseOrTituloContainsIgnoreCase(search);
    }
    /*@Override
    public Director buscarPeliculaPorDirector(String director){
        return peliculaJPA.findPeliculaByDirectorsContainingIgnoreCase(director);
    }*/
/*
    @Override
    public Actor buscarPeliculaPorActor(String actor) {
        return peliculaJPA.findPeliculaByActorsContainingIgnoreCase(actor);
    }

    @Override
    public Genero buscarPeliculaPorGenero(String genero) {
        return peliculaJPA.findPeliculaByGeneros(genero);
    }

    @Override
    public Director buscarPeliculaPorDirector(String director) {

        return peliculaJPA.findPeliculaByDirectors(director);
    }

    @Override
    public Set<Pelicula> findPeliculaByActorsContainingIgnoreCaseOrDirectorsContainingIgnoreCaseOrGenerosContainingIgnoreCaseOrTituloContainingIgnoreCase(String actor, String director, String genero, String titulo) {
        return peliculaJPA.findPeliculaByActorsContainingIgnoreCaseOrDirectorsContainingIgnoreCaseOrGenerosContainingIgnoreCaseOrTituloContainingIgnoreCase(actor, director, genero, titulo);
    }
*/
    @Override
    public void guardarPelicula(Pelicula pelicula) {
        peliculaJPA.save(pelicula);
    }

    @Override
    public void eliminarPelicula(Integer idPelicula) {
        peliculaJPA.deleteById(idPelicula);
    }

    @Override
    public void actualizarPelicula(Pelicula pelicula) {
        peliculaJPA.save(pelicula);
    }

    @Override
    public void eliminarPais(Integer idPais, Integer idPelicula) {

    }
}
