package es.uah.movieapp.service;

import es.uah.movieapp.model.Actor;

import java.util.Set;

public interface IActorService {
    Set<Actor> buscarTodos();
    Set<Actor> buscarActorPorIdPais(Integer idPais);
    Actor buscarActorPorId(Integer idAutor);
    void guardarActor(Actor actor);
    void eliminarActor(Integer idAutor);
    void actualizarActor(Actor actor);
    void agregarPelicula(Integer idActor, Integer idPelicula);
}
