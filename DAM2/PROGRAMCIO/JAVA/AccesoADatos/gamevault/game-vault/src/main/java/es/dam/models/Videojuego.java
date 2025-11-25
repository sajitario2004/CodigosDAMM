package es.dam.models;

import jakarta.persistence.*; // ¿Está bien? ¿Qué paquete usarías aquí?
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "videojuegos")
public class Videojuego {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 200)
    private String titulo;
    
    @Column(length = 100)
    private String plataforma;
    
    @Column(length = 50)
    private String genero;
    
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    
    private Double precio;
    
    @Column(name = "anio_lanzamiento")
    private Integer anioLanzamiento;
    
    private Integer stock;
    
    @OneToMany(mappedBy = "videojuego", fetch = FetchType.LAZY)
    private List<Prestamo> prestamos = new ArrayList<>();
    
    public Videojuego() {}
    
    public Videojuego(String titulo, String plataforma, Double precio) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.precio = precio;
        this.stock = 10;
    }
    
    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { 
        this.plataforma = plataforma; 
    }
    
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { 
        this.descripcion = descripcion; 
    }
    
    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }
    
    public Integer getAnioLanzamiento() { return anioLanzamiento; }
    public void setAnioLanzamiento(Integer anioLanzamiento) { 
        this.anioLanzamiento = anioLanzamiento; 
    }
    
    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }
    
    public List<Prestamo> getPrestamos() { return prestamos; }
    public void setPrestamos(List<Prestamo> prestamos) { 
        this.prestamos = prestamos; 
    }
    
    @Override
    public String toString() {
        return "Videojuego{id=" + id + ", titulo='" + titulo + 
               "', plataforma='" + plataforma + "', stock=" + stock + "}";
    }
}
