// Paquete: es.dam.streamingcatalog.model
package es.dam.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Entidad Pelicula
 */
@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 250)
    private String titulo;

    @Column(name = "anio_lanzamiento")
    private Integer anioLanzamiento;

    @Column(length = 100)
    private String genero;

    // Relacion Muchos a Uno: Pelicula -> Estudio
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudio_id")
    private Estudio estudio;

    // Relacion Uno a Muchos: Pelicula -> Critica
    @OneToMany(mappedBy = "pelicula",
               cascade = CascadeType.ALL,
               orphanRemoval = true,
               fetch = FetchType.LAZY)
    private List<Critica> criticas = new ArrayList<>();

    public Pelicula() {
        
    }

    public Pelicula(String titulo, Integer anioLanzamiento, String genero) {
        this.titulo = titulo;
        this.anioLanzamiento = anioLanzamiento;
        this.genero = genero;
    }

    // Helpers
    public void addCritica(Critica c) {
        criticas.add(c);
        c.setPelicula(this);
    }

    public void removeCritica(Critica c) {
        criticas.remove(c);
        c.setPelicula(null);
    }

    // getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Integer getAnioLanzamiento() { return anioLanzamiento; }
    public void setAnioLanzamiento(Integer anioLanzamiento) { this.anioLanzamiento = anioLanzamiento; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public Estudio getEstudio() { return estudio; }
    public void setEstudio(Estudio estudio) { this.estudio = estudio; }

    public List<Critica> getCriticas() { return criticas; }
    public void setCriticas(List<Critica> criticas) { this.criticas = criticas; }

    @Override
    public String toString() {
        return "Pelicula{id=" + id + ", titulo='" + titulo + "', anio=" + anioLanzamiento + ", genero='" + genero + "'}";
    }
}
