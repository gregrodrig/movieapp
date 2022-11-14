package es.uah.movieapp.dao;

import es.uah.movieapp.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaisJPA extends JpaRepository<Pais, Integer> {
    Pais findByPais(String pais);
}