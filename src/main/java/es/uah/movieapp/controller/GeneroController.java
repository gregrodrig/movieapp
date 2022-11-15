package es.uah.movieapp.controller;

import es.uah.movieapp.model.Genero;
import es.uah.movieapp.service.IGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("generos")
public class GeneroController {

    @Autowired
    IGeneroService generoService;

    @GetMapping("")
    public Set<Genero> buscarTodos(){
        return generoService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Set<Genero> buscarGeneroPorId(@PathVariable("id") Integer id){
        return generoService.buscarGeneroPorId(id);
    }
    @PostMapping("")
    public void guardarGenero(@RequestBody Genero genero){
        generoService.guardarGenero(genero);
    }
    @PutMapping("")
    public void actualizarGenero(@RequestBody Genero genero){
        generoService.actualizarGenero(genero);
    }
    @DeleteMapping("/{id}")
    public void eliminarGenero(@PathVariable("id") Integer id){
        generoService.eliminarGenero(id);
    }
    @GetMapping("/pelicula/agregar/{idGenero}/{idPelicula}")
    public void agregarPelicula(@PathVariable("idGenero") Integer idGenero, @PathVariable("idPelicula") Integer idPelicula){
        generoService.agregarPelicula(idGenero, idPelicula);
    }
}
