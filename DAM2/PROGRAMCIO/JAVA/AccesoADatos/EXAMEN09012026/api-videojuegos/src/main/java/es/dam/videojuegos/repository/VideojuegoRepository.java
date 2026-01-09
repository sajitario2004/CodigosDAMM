package es.dam.videojuegos.repository;

import es.dam.videojuegos.model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Long> {
    // Spring Data JPA genera automáticamente todos los métodos CRUD
}