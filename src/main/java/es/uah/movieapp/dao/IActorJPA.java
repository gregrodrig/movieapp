package es.uah.movieapp.dao;

import es.uah.movieapp.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface IActorJPA extends JpaRepository<Actor, Integer> {
    Set<Actor> findByTblPaisIdPais(Integer idPais);
    Actor findActorByNombreContainingIgnoreCase(String nombre);

}