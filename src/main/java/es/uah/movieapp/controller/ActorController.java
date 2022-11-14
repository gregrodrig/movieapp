package es.uah.movieapp.controller;

import es.uah.movieapp.model.Actor;
import es.uah.movieapp.service.IActorService;
import es.uah.movieapp.service.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("actores")
public class ActorController {

    @Autowired
    IActorService actorService;

    @Autowired
    IPaisService paisService;

    @GetMapping("")
    public Set<Actor> buscarTodos(){
        return actorService.buscarTodos();
    }
    @GetMapping("/pais/{id}")
    public Set<Actor> buscarActorPorIdPais(@PathVariable("id") Integer id){
        return actorService.buscarActorPorIdPais(id);
    }
    @GetMapping("/{id}")
    public Actor buscarActorPorId(@PathVariable("id") Integer id){
        return actorService.buscarActorPorId(id);
    }
    @PostMapping("")
    public void guardarActor(@RequestBody Actor actor) {
        var x = actor.getTblpaisIdpaiss();
        actor.setTblpaisIdpaiss(paisService.buscarPaisPorId(x.getIdPais()));
        actorService.guardarActor(actor);
    }
    @PutMapping("")
    public void actualizarActor(@RequestBody Actor actor){
        actorService.actualizarActor(actor);
    }
    @DeleteMapping("/{id}")
    public void eliminarActor(@PathVariable("id") Integer id){
        actorService.eliminarActor(id);
    }
}
