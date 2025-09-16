import java.util.Arrays;
import java.util.Objects;
public class objetosPastel {

    //esto solo es accesible desde las clase objetosPastel
    //hambito publico
    public String nombre;

    //hambito de erencia la clase
    protected int calorias;

    //habito paquete
    double peso;

    //habito privado, solo puede ser accedido desde la clase o sus clases hijas
    private String[] ingredientes;
    private double precio;




    //constructor
    public objetosPastel(String nombre, int calorias, double peso, String[] ingredientes, double precio) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.peso = peso;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "objetosPastel{" +
                "nombre='" + nombre + '\'' +
                ", calorias=" + calorias +
                ", peso=" + peso +
                ", ingredientes=" + Arrays.toString(ingredientes) +
                ", precio=" + precio +
                '}';
    }
}
