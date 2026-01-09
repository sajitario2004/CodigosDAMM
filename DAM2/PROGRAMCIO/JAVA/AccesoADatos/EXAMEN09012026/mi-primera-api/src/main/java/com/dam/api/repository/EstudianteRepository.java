package com.dam.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dam.api.model.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    // JpaRepository ya proporciona: save(), findAll(), findById(), delete(), etc.
}
