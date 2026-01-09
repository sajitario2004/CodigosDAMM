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

    // GET - Listar todos
    @GetMapping
    public List<Videojuego> findAll() {
        return repo.findAll();
    }

    // GET - Buscar por ID
    @GetMapping("/{id}")
    public Videojuego findById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    // POST - Crear
    @PostMapping
    public Videojuego create(@RequestBody Videojuego videojuego) {
        return repo.save(videojuego);
    }

    // PUT - Actualizar
    @PutMapping("/{id}")
    public Videojuego update(@PathVariable Long id, @RequestBody Videojuego videojuego) {
        if (repo.existsById(id)) {
            videojuego.setId(id);
            return repo.save(videojuego);
        }
        return null;
    }

    // DELETE - Eliminar
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}