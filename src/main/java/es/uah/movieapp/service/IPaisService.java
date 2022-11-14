package es.uah.movieapp.service;

import es.uah.movieapp.model.Pais;

import java.util.List;

public interface IPaisService {
    List<Pais> buscarTodos();
    Pais buscarPaisPorId(Integer idPais);
    Pais buscarPaisPorPais(String pais);
    void guardarPais(Pais pais);
    void actualizarPais(Pais pais);
    void eliminarPais(Integer idPais);
}
