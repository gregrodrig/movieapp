package es.uah.movieapp.controller;

import es.uah.movieapp.model.Actor;
import es.uah.movieapp.model.Director;
import es.uah.movieapp.model.Genero;
import es.uah.movieapp.model.Pelicula;
import es.uah.movieapp.service.IActorService;
import es.uah.movieapp.service.IPeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("peliculas")
public class PeliculaController {

    @Autowired
    IPeliculaService peliculaService;

    @Autowired
    IActorService actorService;

    @GetMapping("")
    public Set<Pelicula> buscarTodas(){
        return peliculaService.buscarTodas();
    }
    @GetMapping("/{id}")
    public Pelicula buscarPeliculaPorId(@PathVariable("id") Integer id){
        return peliculaService.buscarPeliculaPorId(id);
    }
    @GetMapping("/titulo/{titulo}")
    public Set<Pelicula> buscarPeliculaPorTitulo(@PathVariable("titulo") String titulo){
        return peliculaService.buscarPeliculaPorTitulo(titulo);
    }
    @GetMapping("/actor/{actor}")
    public Actor buscarPeliculaPorActor(@PathVariable("actor") String actor){
        return peliculaService.buscarPeliculaPorActor(actor);
    }
    @GetMapping("/genero/{genero}")
    public Genero buscarPeliculaPorGenero(@PathVariable("genero") String genero){
        return peliculaService.buscarPeliculaPorGenero(genero);
    }
    @GetMapping("/director/{director}")
    public Director buscarPeliculaPorDirector(@PathVariable("director") String director){
        return peliculaService.buscarPeliculaPorDirector(director);
    }
    @PostMapping("")
    public void guardarPelicula(@RequestBody Pelicula pelicula){
        peliculaService.guardarPelicula(pelicula);
    }
    @PutMapping("")
    public void actualizarPelicula(@RequestBody Pelicula pelicula){
        peliculaService.actualizarPelicula(pelicula);
    }
    @DeleteMapping("/{id}")
    public void eliminarPelicula(@PathVariable("id") Integer id){
        peliculaService.eliminarPelicula(id);
    }
}
