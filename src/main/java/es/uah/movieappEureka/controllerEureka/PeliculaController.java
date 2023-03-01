package es.uah.movieappEureka.controllerEureka;
import es.uah.movieappEureka.modelEureka.Actor;
import es.uah.movieappEureka.modelEureka.Director;
import es.uah.movieappEureka.modelEureka.Genero;
import es.uah.movieappEureka.modelEureka.Pelicula;
import es.uah.movieappEureka.serviceEureka.IActorService;
import es.uah.movieappEureka.serviceEureka.IPeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("peliculas")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class PeliculaController {
    @Autowired
    IPeliculaService peliculaService;

    @Autowired
    IActorService actorService;

    @GetMapping("")
    public Set<Pelicula> buscarTodas(){
        return peliculaService.buscarTodas();
    }

   /* @GetMapping("/buscar/{actor}/{director}/{genero}/{titulo}")
    public Set<Pelicula> findPeliculaByActorsContainingIgnoreCaseOrDirectorsContainingIgnoreCaseOrGenerosContainingIgnoreCaseOrTituloContainingIgnoreCase(@PathVariable("actor") String actor, @PathVariable("director") String director, @PathVariable("genero") String genero, @PathVariable("titulo") String titulo ){
        return peliculaService.findPeliculaByActorsContainingIgnoreCaseOrDirectorsContainingIgnoreCaseOrGenerosContainingIgnoreCaseOrTituloContainingIgnoreCase(actor, director, genero, titulo);
    }*/

    @GetMapping("/{id}")
    public Pelicula buscarPeliculaPorId(@PathVariable("id") Integer id){
        return peliculaService.buscarPeliculaPorId(id);
    }

    @GetMapping("/titulo/{titulo}")
    public Set<Pelicula> buscarPeliculaPorTitulo(@PathVariable("titulo") String titulo){
        return peliculaService.buscarPeliculaPorTitulo(titulo);
    }

    @GetMapping("/buscar/{search}")
    public Set<Pelicula> peliculasPorTodo(@PathVariable("search") String search) {
        return peliculaService.peliculasPorTodo(search);
    }

    @GetMapping("/generos/{generos}")
    public Set<Genero> buscarPeliculaPorGenero(@PathVariable("generos") String generos){
        return peliculaService.buscarPeliculaPorGenero(generos);
    }

    @GetMapping("/actor/{actor}")
    public Set<Actor> buscarPeliculaPorActor(@PathVariable("actor") String actor){
        return peliculaService.buscarPeliculaPorActor(actor);
    }

    @GetMapping("/director/{director}")
    public Set<Director> buscarPeliculaPorDirector(@PathVariable("director") String director){
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
