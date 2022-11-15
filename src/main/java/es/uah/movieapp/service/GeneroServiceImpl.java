package es.uah.movieapp.service;

import es.uah.movieapp.dao.IGeneroDAO;
import es.uah.movieapp.model.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class GeneroServiceImpl implements IGeneroService{

    @Autowired
    IGeneroDAO generoDAO;

    @Override
    public Set<Genero> buscarTodos() {
        return generoDAO.buscarTodos();
    }

    @Override
    public Set<Genero> buscarGeneroPorId(Integer idGenero) {
        return generoDAO.buscarGeneroPorId(idGenero);
    }

    @Override
    public void guardarGenero(Genero genero) {
        generoDAO.guardarGenero(genero);
    }

    @Override
    public void eliminarGenero(Integer idGenero) {
        generoDAO.eliminarGenero(idGenero);
    }

    @Override
    public void actualizarGenero(Genero genero) {
        generoDAO.actualizarGenero(genero);
    }

    @Override
    public void agregarPelicula(Integer idGenero, Integer idPelicula) {
        generoDAO.agregarPelicula(idGenero, idPelicula);
    }
}
