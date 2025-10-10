
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import jdk.jfr.Percentage;

public class PersonajeGjon {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1 serialización: ");
        Personaje personaje1 = new Personaje("manolo", 33, 911);
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("personaje.json"))){
            
        } catch (Exception e) {
        }
    }


}
