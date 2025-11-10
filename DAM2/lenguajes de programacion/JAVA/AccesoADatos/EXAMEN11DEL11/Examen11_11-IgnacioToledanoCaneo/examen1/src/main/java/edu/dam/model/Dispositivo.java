package edu.dam.model;

public class Dispositivo {
    private int id;
    private String nombre;
    private String categoria;
    private Double precio;
    private int stock;

    public Dispositivo(){
        this.id = 0;
        this.nombre = "Default";
        this.categoria = "Default";
        this.precio = 0.0;
        this.stock = 0;
    }

    public Dispositivo(int id, String nombre, String categoria, Double precio, int stock)
    {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public Dispositivo(String nombre, String categoria, Double precio, int stock)
    {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Dispositivo [id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio
                + ", stock=" + stock + "]";
    }

}
