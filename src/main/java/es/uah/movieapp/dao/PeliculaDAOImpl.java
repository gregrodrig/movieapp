package es.uah.movieapp.dao;

import es.uah.movieapp.model.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Repository
public class PeliculaDAOImpl implements IPeliculaDAO{

    @Autowired
    IPeliculaJPA peliculaJPA;
    @Override
    public Set<Pelicula> buscarTodas() {
        //return new HashSet<Pelicula>(peliculaJPA.findAll());
        return new HashSet<Pelicula>(peliculaJPA.findAll());
    }

    @Override
    public Pelicula buscarPeliculaPorId(Integer idPelicula) {
        Optional<Pelicula> optional = peliculaJPA.findById(idPelicula);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public Set<Pelicula> buscarPeliculaPorTitulo(String titulo) {
        return peliculaJPA.findByTituloContainingIgnoreCase(titulo);
    }

    @Override
    public void guardarPelicula(Pelicula pelicula) {
        peliculaJPA.save(pelicula);
    }

    @Override
    public void eliminarPelicula(Integer idPelicula) {
        peliculaJPA.deleteById(idPelicula);
    }

    @Override
    public void actualizarPelicula(Pelicula pelicula) {
        peliculaJPA.save(pelicula);
    }

    @Override
    public void eliminarPais(Integer idPais, Integer idPelicula) {

    }
}
