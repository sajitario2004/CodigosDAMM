package com.dam.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dam.api.model.Estudiante;
import com.dam.api.repository.EstudianteRepository;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository repository;

    public List<Estudiante> obtenerTodos() {
        return repository.findAll();
    }

    public Estudiante obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Estudiante crearEstudiante(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    public Estudiante actualizarEstudiante(Long id, Estudiante datos) {
        Estudiante estudiante = obtenerPorId(id);

        if (estudiante != null) {
            estudiante.setNombre(datos.getNombre());
            estudiante.setEmail(datos.getEmail());
            estudiante.setEdad(datos.getEdad());
            estudiante.setCarrera(datos.getCarrera());

            return repository.save(estudiante);
        }

        return null;
    }

    public boolean eliminarEstudiante(Long id) {

        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }

}