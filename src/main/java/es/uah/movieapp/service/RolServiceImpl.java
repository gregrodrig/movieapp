package es.uah.movieapp.service;

import es.uah.movieapp.dao.IRolDAO;
import es.uah.movieapp.model.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RolServiceImpl implements IRolService{

    @Autowired
    IRolDAO rolDAO;

    @Override
    public Set<Rol> buscarTodos() {
        return rolDAO.buscarTodos();
    }

    @Override
    public Rol buscarRolPorNombre(String nombre) {
        return rolDAO.buscarRolPorNombre(nombre);
    }

    @Override
    public Rol buscarRolPorId(Integer idRol) {
        return rolDAO.buscarRolPorId(idRol);
    }

    @Override
    public void agregarRol(Rol rol) {
        rolDAO.agregarRol(rol);
    }

    @Override
    public void eliminarRol(Integer idRol) {
        rolDAO.eliminarRol(idRol);
    }

    @Override
    public void actualizarRol(Rol rol) {
        rolDAO.actualizarRol(rol);
    }
}
