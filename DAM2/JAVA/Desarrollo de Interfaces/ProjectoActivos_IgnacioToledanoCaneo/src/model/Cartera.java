package model;

import services.Gestion;

import java.util.ArrayList;
import java.util.List;

// Clase Cartera que contiene Activos
public class Cartera implements Gestion {
    private int id;
    private String nombre;
    private List<ActivoInversion> activos;

    public Cartera(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.activos = new ArrayList<>();
    }

    public List<ActivoInversion> getActivos() {
        return activos;
    }

    public void setActivos(List<ActivoInversion> activos) {
        this.activos = activos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addActivo(ActivoInversion a) {
        activos.add(a);
    }

    public void removeActivo(String ticker) {
        activos.removeIf(a -> a.toString().contains(ticker));
    }

    public double getDineroTotal() {
        return activos.stream().mapToDouble(ActivoInversion::getDineroInvertido).sum();
    }

    @Override
    public String toString() {
        return "Cartera{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", activos=" + activos +
                '}';
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cartera " + nombre + " (ID: " + id + ")");
        System.out.println("Total invertido: " + getDineroTotal());
        for (ActivoInversion a : activos) {
            a.mostrarDetalles();
        }
    }
}
