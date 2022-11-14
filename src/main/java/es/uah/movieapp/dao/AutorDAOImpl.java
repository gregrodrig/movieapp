package es.uah.movieapp.dao;

import es.uah.movieapp.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Repository
public class AutorDAOImpl implements IActorDAO{

    @Autowired
    IActorJPA actorJPA;


    @Override
    public Set<Actor> buscarTodos() {
        return new HashSet<Actor>(actorJPA.findAll());
    }

    @Override
    public Set<Actor> buscarActorPorIdPais(Integer idPais) {
        return actorJPA.findByTblPaisIdPais(idPais);
    }

    @Override
    public Actor buscarAutorPorId(Integer idAutor) {
        Optional<Actor> optional = actorJPA.findById(idAutor);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public void guardarAutor(Actor actor) {
        actorJPA.save(actor);
    }

    @Override
    public void eliminarAutor(Integer idAutor) {
        actorJPA.deleteById(idAutor);
    }

    @Override
    public void actualizarAutor(Actor actor) {
        actorJPA.save(actor);
    }
}
