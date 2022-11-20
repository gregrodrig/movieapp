package es.uah.movieapp.dao;

import es.uah.movieapp.model.Genero;

import java.util.Set;

public interface IGeneroDAO {
    Set<Genero> buscarTodos();
    Genero buscarGeneroPorId(Integer idGenero);
    void guardarGenero(Genero genero);
    void eliminarGenero(Integer idGenero);
    void actualizarGenero(Genero genero);

    void agregarPelicula(Integer idGenero, Integer idPelicula);
}
