import java.io.Serializable;

public class Personaje implements Serializable {
    private String nombre;
    private int nivel;
    private String clase;
    public Personaje(String nombre, int nivel, String clase) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.clase = clase;
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
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    @Override
    public String toString() {
        return "Personaje [Nombre=" + nombre + ", Nivel=" + nivel + ", Clase=" + clase + "]";
    }
}
