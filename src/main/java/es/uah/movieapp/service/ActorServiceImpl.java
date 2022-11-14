package es.uah.movieapp.service;

import es.uah.movieapp.dao.IActorDAO;
import es.uah.movieapp.dao.IPaisDAO;
import es.uah.movieapp.dao.IPeliculaDAO;
import es.uah.movieapp.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ActorServiceImpl implements IActorService{

    @Autowired
    IActorDAO actorDAO;

    @Override
    public Set<Actor> buscarTodos() {
        return actorDAO.buscarTodos();
    }

    @Override
    public Set<Actor> buscarActorPorIdPais(Integer idPais) {
        return actorDAO.buscarActorPorIdPais(idPais);
    }

    @Override
    public Actor buscarActorPorId(Integer idAutor) {
        return actorDAO.buscarAutorPorId(idAutor);
    }

    @Override
    public void guardarActor(Actor actor) {
        actorDAO.guardarAutor(actor);
    }

    @Override
    public void eliminarActor(Integer idAutor) {
        actorDAO.eliminarAutor(idAutor);
    }

    @Override
    public void actualizarActor(Actor actor) {
        actorDAO.actualizarAutor(actor);
    }
}
