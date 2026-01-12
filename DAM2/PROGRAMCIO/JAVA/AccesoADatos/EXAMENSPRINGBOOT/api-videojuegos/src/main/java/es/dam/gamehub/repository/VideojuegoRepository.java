package es.dam.gamehub.repository;

import es.dam.gamehub.model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Long> {
    // Spring Data JPA genera automáticamente todos los métodos CRUD
}
