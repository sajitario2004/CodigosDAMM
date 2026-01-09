package es.dam.gamehub.apivideojuegos.repository;

import es.dam.gamehub.apivideojuegos.model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideojuegoRepository extends JpaRepository<Videojuego, Long> {
    // JpaRepository ya incluye findAll, findById, save, deleteById
}