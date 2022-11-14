package es.uah.movieapp.service;

import es.uah.movieapp.model.Pelicula;

import java.util.List;
import java.util.Set;

public interface IPeliculaService {
    Set<Pelicula> buscarTodas();
    Pelicula buscarPeliculaPorId(Integer idPelicula);
    Set<Pelicula> buscarPeliculaPorTitulo(String titulo);
    void guardarPelicula(Pelicula pelicula);
    void eliminarPelicula(Integer idPelicula);
    void actualizarPelicula(Pelicula pelicula);
}
