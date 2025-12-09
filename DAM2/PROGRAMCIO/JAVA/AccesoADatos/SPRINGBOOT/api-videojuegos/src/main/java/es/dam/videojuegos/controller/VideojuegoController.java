package es.dam.videojuegos.controller;

import es.dam.videojuegos.model.Videojuego;
import es.dam.videojuegos.repository.VideojuegoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videojuegos")
public class VideojuegoController {

    private final VideojuegoRepository repo;

    public VideojuegoController(VideojuegoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Videojuego> findAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Videojuego findById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }
}