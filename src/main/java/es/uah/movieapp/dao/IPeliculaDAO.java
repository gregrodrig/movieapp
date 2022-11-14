package es.uah.movieapp.dao;

import es.uah.movieapp.model.Actor;
import es.uah.movieapp.model.Director;
import es.uah.movieapp.model.Genero;
import es.uah.movieapp.model.Pelicula;

import java.util.List;
import java.util.Set;

public interface IPeliculaDAO {
    Set<Pelicula> buscarTodas();
    Pelicula buscarPeliculaPorId(Integer idPelicula);
    Set<Pelicula> buscarPeliculaPorTitulo(String titulo);
    Actor buscarPeliculaPorActor(String actor);
    Genero buscarPeliculaPorGenero(String genero);
    Director buscarPeliculaPorDirector(String director);
    void guardarPelicula(Pelicula pelicula);
    void eliminarPelicula(Integer idPelicula);
    void actualizarPelicula(Pelicula pelicula);
    void eliminarPais(Integer idPais, Integer idPelicula);
}
