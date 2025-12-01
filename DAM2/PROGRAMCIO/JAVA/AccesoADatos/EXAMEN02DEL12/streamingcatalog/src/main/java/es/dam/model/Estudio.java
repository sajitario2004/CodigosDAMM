// Paquete: es.dam.streamingcatalog.model
package es.dam.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Entidad Estudio
 */
@Entity
@Table(name = "estudios")
public class Estudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nombre;

    @Column
    @Temporal(TemporalType.DATE)
    private Date fundacion;

    // relacion Uno a Muchos: Estudio -> Pelicula
    @OneToMany(mappedBy = "estudio",
               cascade = CascadeType.ALL,
               orphanRemoval = true,
               fetch = FetchType.LAZY)
    private List<Pelicula> peliculas = new ArrayList<>();

    public Estudio() {}

    public Estudio(String nombre, Date fundacion) {
        this.nombre = nombre;
        this.fundacion = fundacion;
    }

    // Helpers para mantener la relación bidireccional
    public void addPelicula(Pelicula p) {
        peliculas.add(p);
        p.setEstudio(this);
    }

    public void removePelicula(Pelicula p) {
        peliculas.remove(p);
        p.setEstudio(null);
    }

    // guetters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Date getFundacion() { return fundacion; }
    public void setFundacion(Date fundacion) { this.fundacion = fundacion; }

    public List<Pelicula> getPeliculas() { return peliculas; }
    public void setPeliculas(List<Pelicula> peliculas) { this.peliculas = peliculas; }

    @Override
    public String toString() {
        return "Estudio{id=" + id + ", nombre='" + nombre + "', fundacion=" + fundacion + "}";
    }
}
