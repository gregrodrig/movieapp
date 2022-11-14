package es.uah.movieapp.dao;

import es.uah.movieapp.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface IGeneroJPA extends JpaRepository<Genero, Integer> {
    Set<Genero> findByIdGenero(Integer idGenero);
}