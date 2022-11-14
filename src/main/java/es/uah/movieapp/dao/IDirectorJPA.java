package es.uah.movieapp.dao;

import es.uah.movieapp.model.Director;
import es.uah.movieapp.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface IDirectorJPA extends JpaRepository<Director, Integer> {
    Director findByNombreContainingIgnoreCase(String nombre);
}