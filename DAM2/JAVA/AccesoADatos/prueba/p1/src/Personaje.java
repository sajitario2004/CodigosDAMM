import com.google.gson.Gson;

public class Personaje{
    private String nombre;
    private int puntos;
    private int edad;
    
    
    public Personaje(String nombre, int puntos, int edad) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.edad = edad;
    }
    public static void main(String[] args) {
        Gson hola = new Gson();
        System.out.println("cantimplora");
    }

    
}