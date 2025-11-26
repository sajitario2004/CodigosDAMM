package es.dam.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prestamos")
public class Prestamo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "fecha_prestamo", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPrestamo;
    
    @Column(name = "fecha_devolucion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDevolucion;
    
    private Boolean devuelto;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "videojuego_id", nullable = false)
    private Videojuego videojuego;
    
    public Prestamo() {}
    
    public Prestamo(Usuario usuario, Videojuego videojuego) {
        this.usuario = usuario;
        this.videojuego = videojuego;
        this.fechaPrestamo = new Date();
        this.devuelto = false;
    }
    
    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Date getFechaPrestamo() { return fechaPrestamo; }
    public void setFechaPrestamo(Date fechaPrestamo) { 
        this.fechaPrestamo = fechaPrestamo; 
    }
    
    public Date getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(Date fechaDevolucion) { 
        this.fechaDevolucion = fechaDevolucion; 
    }
    
    public Boolean getDevuelto() { return devuelto; }
    public void setDevuelto(Boolean devuelto) { this.devuelto = devuelto; }
    
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    
    public Videojuego getVideojuego() { return videojuego; }
    public void setVideojuego(Videojuego videojuego) { 
        this.videojuego = videojuego; 
    }
    
    @Override
    public String toString() {
        return "Prestamo{id=" + id + ", fechaPrestamo=" + fechaPrestamo + 
               ", devuelto=" + devuelto + "}";
    }
}