package es.uah.movieapp.dao;

import es.uah.movieapp.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRolJPA extends JpaRepository<Rol, Integer> {
    Rol findByNombreRolContainingIgnoreCase(String nombre);
    Rol findRolByIdRol(Integer idRol);

}