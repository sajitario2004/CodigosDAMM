package es.dam.gamehub.apivideojuegos.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "videojuegos")
@Data // Genera Getters, Setters, toString, etc.
@NoArgsConstructor
@AllArgsConstructor
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String genero;

    // Añadido para cumplir con el JSON de ejemplo
    private String desarrolladora;
    
    // Añadido para cumplir con el JSON de ejemplo
    private Integer anioLanzamiento;

    @Column(nullable = false)
    private Double precio;

    @Column(columnDefinition = "boolean default false")
    private Boolean multiplayer = false;
}