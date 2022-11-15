package es.uah.movieapp.dao;

import es.uah.movieapp.model.Actor;
import es.uah.movieapp.model.Director;
import es.uah.movieapp.model.Genero;
import es.uah.movieapp.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface IPeliculaJPA extends JpaRepository<Pelicula, Integer> {
    Set<Pelicula> findByTituloContainingIgnoreCase(String titulo);
    Actor findPeliculaByActorsContainingIgnoreCase(String actor);
    Genero findPeliculaByGeneros(String genero);
    Director findPeliculaByDirectors(String director);
}