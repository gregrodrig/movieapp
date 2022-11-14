package es.uah.movieapp.dao;

import es.uah.movieapp.model.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class GeneroDAOImpl implements IGeneroDAO{

    @Autowired
    IGeneroJPA generoJPA;

    @Override
    public Set<Genero> buscarTodos() {
        return new HashSet<Genero>(generoJPA.findAll());
    }

    @Override
    public Set<Genero> buscarGeneroPorId(Integer idGenero) {
        return generoJPA.findByIdGenero(idGenero);
    }

    @Override
    public void guardarGenero(Genero genero) {
        generoJPA.save(genero);
    }

    @Override
    public void eliminarGenero(Integer idGenero) {
        generoJPA.deleteById(idGenero);
    }

    @Override
    public void actualizarGenero(Genero genero) {
        generoJPA.save(genero);
    }
}
