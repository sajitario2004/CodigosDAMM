package es.dam.model;

import jakarta.persistence.*;


@Entity
@Table(name = "criticas")
public class Critica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 120)
    private String autor;

    private Integer puntuacion;

    @Column(columnDefinition = "TEXT")
    private String comentario;

    // Relacion Muchos a Uno: Critica -> Pelicula
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;

    public Critica() {}

    public Critica(String autor, Integer puntuacion, String comentario) {
        this.autor = autor;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }

    // guetters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public Integer getPuntuacion() { return puntuacion; }
    public void setPuntuacion(Integer puntuacion) { this.puntuacion = puntuacion; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }

    public Pelicula getPelicula() { return pelicula; }
    public void setPelicula(Pelicula pelicula) { this.pelicula = pelicula; }

    @Override
    public String toString() {
        return "Critica{id=" + id + ", autor='" + autor + "', puntuacion=" + puntuacion + "}";
    }
}
