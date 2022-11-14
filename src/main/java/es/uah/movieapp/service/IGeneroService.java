package es.uah.movieapp.service;

import es.uah.movieapp.model.Genero;

import java.util.Set;

public interface IGeneroService {

    Set<Genero> buscarTodos();
    Set<Genero> buscarGeneroPorId(Integer idGenero);
    void guardarGenero(Genero genero);
    void eliminarGenero(Integer idGenero);
    void actualizarGenero(Genero genero);
}
