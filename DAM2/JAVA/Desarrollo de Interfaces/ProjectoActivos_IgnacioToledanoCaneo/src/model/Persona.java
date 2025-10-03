package model;


import services.Gestion;

import java.util.ArrayList;
import java.util.List;

public class Persona implements Gestion {
    private String dni;
    private String nombre;
    private int edad;
    private String email;
    private List<Cartera> carteras;

    public Persona(String dni, String nombre, int edad, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.carteras = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cartera> getCarteras() {
        return carteras;
    }

    public void setCarteras(List<Cartera> carteras) {
        this.carteras = carteras;
    }

    public void addCartera(Cartera cartera) {
        carteras.add(cartera);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", carteras=" + carteras +
                '}';
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Persona: " + nombre + ", con DNI:" + dni + ")");

        for (Cartera carteraAux : carteras) {
            carteraAux.mostrarDetalles();

        }

    }
}

