package com.dam.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dam.api.model.Estudiante;
import com.dam.api.service.EstudianteService;
import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    // GET: Obtener todos los estudiantes
    @GetMapping
    public ResponseEntity<List<Estudiante>> obtenerTodos() {
        return ResponseEntity.ok(service.obtenerTodos());
    }

    // GET: Obtener estudiante por ID
    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> obtenerPorId(@PathVariable Long id) {
        Estudiante est = service.obtenerPorId(id);
        if (est != null) {
            return ResponseEntity.ok(est);
        }
        return ResponseEntity.notFound().build();
    }

    // POST: Crear nuevo estudiante
    @PostMapping
    public ResponseEntity<Estudiante> crear(@RequestBody Estudiante estudiante) {
        return ResponseEntity.status(201).body(service.crearEstudiante(estudiante));
    }

    // PUT: Actualizar estudiante
    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> actualizar(@PathVariable Long id, @RequestBody Estudiante datos) {
        Estudiante actualizado = service.actualizarEstudiante(id, datos);
        if (actualizado != null) {
            return ResponseEntity.ok(actualizado);
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE: Eliminar estudiante
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (service.eliminarEstudiante(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}