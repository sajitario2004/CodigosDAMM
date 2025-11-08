import java.io.*;
import java.util.Scanner;
// Asegúrate de tener la librería Gson en tu proyecto



// Clase Personaje (debes implementar los atributos, constructor y toString)
class Personaje implements Serializable{
    // TODO: Atributos privados
    private String nombre;
    private int nivel;
    private int puntos;


    
    // TODO: Constructor
    
    public Personaje(String nombre, int nivel, int puntos) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntos = puntos;
    }


    

    public String toString() {
        return "Personaje [Nombre=...]"; // Implementar para mostrar bien los datos
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}

