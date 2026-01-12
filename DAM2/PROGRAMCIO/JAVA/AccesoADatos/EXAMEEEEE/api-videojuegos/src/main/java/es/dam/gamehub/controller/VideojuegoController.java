package es.dam.gamehub.controller;

import es.dam.gamehub.model.Videojuego;
import es.dam.gamehub.service.VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videojuegos")
public class VideojuegoController {

    @Autowired
    private VideojuegoService videojuegoService;

    // 1. GET - Obtener todos
    @GetMapping
    public ResponseEntity<List<Videojuego>> getAllVideojuegos() {
        return ResponseEntity.ok(videojuegoService.findAll());
    }

    // 2. GET - Obtener por ID
    @GetMapping("/{id}")
    public ResponseEntity<Videojuego> getVideojuegoById(@PathVariable Long id) {
        return videojuegoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // 3. POST - Crear nuevo
    @PostMapping
    public ResponseEntity<Videojuego> createVideojuego(@RequestBody Videojuego videojuego) {
        Videojuego nuevoVideojuego = videojuegoService.save(videojuego);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoVideojuego);
    }

    // 4. PUT - Actualizar existente
    @PutMapping("/{id}")
    public ResponseEntity<Videojuego> updateVideojuego(@PathVariable Long id, @RequestBody Videojuego videojuego) {
        return videojuegoService.update(id, videojuego)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // 5. DELETE - Eliminar por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideojuego(@PathVariable Long id) {
        if (videojuegoService.deleteById(id)) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}