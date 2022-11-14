package es.uah.movieapp.service;

import es.uah.movieapp.dao.IPeliculaDAO;
import es.uah.movieapp.model.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PeliculaServiceImpl implements IPeliculaService{

    @Autowired
    IPeliculaDAO peliculaDAO;

    @Override
    public Set<Pelicula> buscarTodas() {
       return peliculaDAO.buscarTodas();
    }

    @Override
    public Pelicula buscarPeliculaPorId(Integer idPelicula) {
        return peliculaDAO.buscarPeliculaPorId(idPelicula);
    }

    @Override
    public Set<Pelicula> buscarPeliculaPorTitulo(String titulo) {
        return peliculaDAO.buscarPeliculaPorTitulo(titulo);
    }

    @Override
    public void guardarPelicula(Pelicula pelicula) {
        if (peliculaDAO.buscarPeliculaPorId(pelicula.getIdPelicula()) ==null){
            peliculaDAO.guardarPelicula(pelicula);
        }
    }

    @Override
    public void eliminarPelicula(Integer idPelicula) {
        if (peliculaDAO.buscarPeliculaPorId(idPelicula) !=null){
            peliculaDAO.eliminarPelicula(idPelicula);
        }
    }

    @Override
    public void actualizarPelicula(Pelicula pelicula) {
        if (peliculaDAO.buscarPeliculaPorId(pelicula.getIdPelicula()) !=null){
            peliculaDAO.actualizarPelicula(pelicula);
        }
    }
}
