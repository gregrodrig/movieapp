package es.uah.movieapp.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Rol {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idRol")
    private Integer idRol;
    @Basic
    @Column(name = "nombreRol")
    private String nombreRol;

    @OneToMany(mappedBy = "rolByTblRolIdRol")
    private Set<Usuario> usuarios = new LinkedHashSet<>();

    public Rol() {
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rol rol = (Rol) o;
        return Objects.equals(idRol, rol.idRol) && Objects.equals(nombreRol, rol.nombreRol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRol, nombreRol);
    }
}
