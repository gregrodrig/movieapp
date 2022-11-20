package es.uah.movieapp.service;

import es.uah.movieapp.dao.IUsuarioDAO;
import es.uah.movieapp.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class IUsuarioServiceImpl implements IUsuarioService{

    @Autowired
    IUsuarioDAO usuarioDAO;

    @Override
    public Set<Usuario> buscarTodos() {
        return usuarioDAO.buscarTodos();
    }

    @Override
    public Usuario buscarUsuarioPorId(Integer idUsuario) {
        return usuarioDAO.buscarUsuarioPorId(idUsuario);
    }

    @Override
    public Usuario buscarUsuarioPorNombre(String nombre) {
        return usuarioDAO.buscarUsuarioPorNombre(nombre);
    }

    @Override
    public Usuario buscarUsuarioPorCorreo(String correo) {
        return usuarioDAO.buscarUsuarioPorCorreo(correo);
    }

    @Override
    public Set<Usuario> buscarUsuarioPorRol(Integer idRol) {
        return usuarioDAO.buscarUsuarioPorRol(idRol);
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        usuarioDAO.guardarUsuario(usuario);
    }

    @Override
    public void eliminarUsuario(Integer idUsuario) {
        usuarioDAO.eliminarUsuario(idUsuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuarioDAO.actualizarUsuario(usuario);
    }
}
