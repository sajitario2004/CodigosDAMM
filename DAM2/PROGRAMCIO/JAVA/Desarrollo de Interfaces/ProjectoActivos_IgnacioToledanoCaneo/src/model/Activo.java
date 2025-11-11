package model;

import services.Gestion;

// Clase base: Activo genérico
public class Activo implements Gestion {
    protected String nombre;
    protected double precioUltimo;
    protected String fechaUltimoPrecio;

    public Activo(String nombre, double precioUltimo, String fechaUltimoPrecio) {
        this.nombre = nombre;
        this.precioUltimo = precioUltimo;
        this.fechaUltimoPrecio = fechaUltimoPrecio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUltimo() {
        return precioUltimo;
    }

    //este lo modifico para que tambien sea obligatorio si se actualiza el precio que se actualize la fecha en la que se puso el precio
    public void setPrecioUltimo(double precioUltimo, String fecha) {
        this.precioUltimo = precioUltimo;

        this.fechaUltimoPrecio = fecha;
    }

    public String getFechaUltimoPrecio() {
        return fechaUltimoPrecio;
    }

    public void setFechaUltimoPrecio(String fechaUltimoPrecio) {
        this.fechaUltimoPrecio = fechaUltimoPrecio;
    }



    @Override
    public void mostrarDetalles() {
        System.out.println("Activo: " + nombre +
                " | Último precio: " + precioUltimo +
                " | Fecha: " + fechaUltimoPrecio);
    }

    @Override
    public String toString() {
        return nombre + " y su precio ultimo es " + precioUltimo + "€, la fecha es " + fechaUltimoPrecio + ")";

    }
}