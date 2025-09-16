package Colecciones.ejer1.ejer5;

public class Prueba {
    int hola;
    String nombre;
    String apellidos;

    public Prueba(int hola, String nombre, String apellidos) {
        this.hola = hola;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getHola() {
        return hola;
    }

    public void setHola(int hola) {
        this.hola = hola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "hola=" + hola +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
