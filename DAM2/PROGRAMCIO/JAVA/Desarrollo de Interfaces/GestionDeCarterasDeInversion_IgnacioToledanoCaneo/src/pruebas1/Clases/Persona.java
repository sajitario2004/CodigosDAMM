package pruebas1.Clases;

import java.util.ArrayList;

public class Persona {
    private String dni;
    private String nombre;
    private int edad;
    private String email;
    private ArrayList<Cartera> cateras;

    public Persona(String dni, String nombre, int edad, String email, ArrayList<Cartera> cateras) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.cateras = cateras;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Cartera> getCateras() {
        return cateras;
    }

    public void setCateras(ArrayList<Cartera> cateras) {
        this.cateras = cateras;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", cateras=" + cateras +
                '}';
    }
}
