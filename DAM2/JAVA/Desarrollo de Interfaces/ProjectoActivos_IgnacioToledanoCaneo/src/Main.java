import model.*;
import services.MenuApp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //persona 1: Cartera Friki
        Persona persona1= new Persona("12457895r", "Nacho", 20, "nacho@mail.com");
        Cartera cartera1= new Cartera(1, "Cartera Friky");
        cartera1.addActivo(new ActivoInversion("1001", "Apple", "Apple", 150, "11-12-25", 5, 3000));
        cartera1.addActivo(new ActivoInversion("1002","Microsoft", "Microsoft", 115, "11-12-25", 4, 3500));
        cartera1.addActivo(new ActivoInversion("1003", "Nvidia", "Nvidia", 178, "11-12-25", 6, 3500));
        persona1.addCartera(cartera1);

        //persona 2: fondos indexados
        Persona persona2= new Persona("18925674s", "Marco", 19, "marco@mail.com");
        Cartera cartera2= new Cartera(2, "Cartera Fondos Indexados");
        double inversion2=30000 / 4.0;
        cartera2.addActivo(new ActivoInversion("1004", "MSCI World","MSCI World", 300, "11-12-25", 2,inversion2));
        cartera2.addActivo(new ActivoInversion("1005", "MSCI Technology", "MSCI Technology", 250, "11-12-25", 3, inversion2));
        cartera2.addActivo(new ActivoInversion("1006", "Vanguard Emerging Markets","Vanguard EM", 400, "11-12-25", 1,inversion2));
        cartera2.addActivo(new ActivoInversion("1007", "Picket Total Value", "Picket TV", 150, "11-12-25",2.5, inversion2));
        persona2.addCartera(cartera2);

        //persona 3: roboCartera
        Persona persona3= new Persona("50621548e", "Pedro", 26, "pedro@mail.com");
        Cartera cartera3 =new Cartera(3, "RoboCartera");
        cartera3.addActivo(new ActivoInversion("1008", "RoboAdvisor Conservador", "RA Conservador", 200, "11-12-25", 1.5, 5000 * 0.15));
        cartera3.addActivo(new ActivoInversion("1008", "RoboAdvisor Moderado", "RA Moderado", 100, "11-12-25", 3, 5000 * 0.85));
        persona3.addCartera(cartera3);

        //Lista general
        List<Persona> personas= new ArrayList<Persona>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);


        //ejecutamus el menu
        MenuApp app = new MenuApp(personas);
        //este try es obligatorio por lo que uso para la pausita
        try {
            app.iniciar();
        }catch (Exception e) {
            System.out.println("ha fallado algo y lo mas probable es que halla sido el Thread.sleep");
        }
    }
}