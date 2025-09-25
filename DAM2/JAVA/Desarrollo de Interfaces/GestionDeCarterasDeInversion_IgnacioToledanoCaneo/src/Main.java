import Clases.Activo;
import Clases.Cartera;
import Clases.InversionActivos;
import Clases.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Parte de añadir ddatos de los usuarios
        //Creacion activos
        Activo apple = new Activo(150, "apple", "11-12-25");
        Activo microsoft = new Activo(115, "Microsoft", "11-12-25");
        Activo nvidia = new Activo(178, "Nvidia", "11-12-25");

        Activo msciWorld = new Activo(300, "MSCI World", "11-12-25");
        Activo msciTecnology = new Activo(250, "MSCI Tecnology", "11-12-25");
        Activo vanguardEmergingMarkets = new Activo(400, "Vanguard Emerging Markets", "11-12-25");
        Activo picketTotalValue = new Activo(150, "Picket Total Value", "11-12-25");

        Activo roboAdConservador = new Activo(200, "Robo Advisor Conservador", "11-12-25");
        Activo roboAdModerado = new Activo(100, "Robo Advisor Moderado", "11-12-25");

        // dinero invertido por el primer usuario  1000 repartido entre 3 acciones
        InversionActivos inversion1 = new InversionActivos(1, "inversion en "+apple.getNombre(), apple, 300);
        InversionActivos inversion2 = new InversionActivos(2, "inversion en "+microsoft.getNombre(), microsoft, 200);
        InversionActivos inversion3 = new InversionActivos(3, "inversion en "+nvidia.getNombre(), nvidia, 500);

        //dinero invertido por el segundo usuario 30000 repartido en 3 acciones
        InversionActivos inversion4 = new InversionActivos(4, "inversion en "+msciWorld.getNombre(), msciWorld, 30000/4);
        InversionActivos inversion5 = new InversionActivos(5, "inversion en "+msciTecnology.getNombre(), msciTecnology, 30000/4);
        InversionActivos inversion6 = new InversionActivos(6, "inversion en "+vanguardEmergingMarkets.getNombre(), vanguardEmergingMarkets, 30000/4);
        InversionActivos inversion7 = new InversionActivos(7, "inversion en "+picketTotalValue.getNombre(), picketTotalValue, 30000/4);

        //dinero invertido por el tercer usuario 5000
        InversionActivos inversion8 = new InversionActivos(8, "inversion en "+roboAdConservador.getNombre(), roboAdConservador, (int) ( ((float)5000)*0.15));
        InversionActivos inversion9 = new InversionActivos(8, "inversion en "+roboAdModerado.getNombre(), roboAdModerado, (int) ( ((float)5000)*0.85));

        //lista de inversion de usuario 1
        ArrayList<InversionActivos> inversionFriki = new ArrayList<InversionActivos>();
        inversionFriki.add(inversion1);
        inversionFriki.add(inversion2);
        inversionFriki.add(inversion3);

        //lista de inversion de usuario 2
        ArrayList<InversionActivos> carteraFondosIndexados = new ArrayList<>();
        carteraFondosIndexados.add(inversion4);
        carteraFondosIndexados.add(inversion5);
        carteraFondosIndexados.add(inversion6);
        carteraFondosIndexados.add(inversion7);

        //lista de inversion de usuario3
        ArrayList<InversionActivos> roboAdvisor = new ArrayList<>();
        roboAdvisor.add(inversion8);
        roboAdvisor.add(inversion9);

        //cartera 1 de usuario 1
        Cartera carteraFriki = new Cartera(inversionFriki, "Cartera Friki", 1001 , 0);
        ArrayList<Cartera> carterasP1 = new ArrayList<>();
        carterasP1.add(carteraFriki);

        //cartera 1 de usuario 2
        Cartera fondosIndexados = new Cartera(carteraFondosIndexados, "Cartera Fondos Indexados", 1002, 0);
        ArrayList<Cartera> carterasP2 = new ArrayList<>();
        carterasP2.add(fondosIndexados);

        //cartera 1 de usaurio 3
        Cartera roboAdvisorCartera = new Cartera(roboAdvisor, "Cartera Robo Advisor", 1003, 0);
        ArrayList<Cartera> carterasP3 = new ArrayList<>();
        carterasP3.add(roboAdvisorCartera);

        //Personas
        Persona persona1 = new Persona("77451526s", "Nacho", 20, "nacho@gmail.com", carterasP1);
        Persona persona2 = new Persona("88954751g" , "marco", 19, "marco@gmail.com", carterasP2);
        Persona persona3 = new Persona("45152739d", "Pedro", 26, "pedro@gmail.com", carterasP3);

        // parte de variables que alludaran en el menu
        Scanner sc = new Scanner(System.in);

        //lista de activos actuales
        ArrayList<Activo> activos = new ArrayList<>();
        activos.add(apple);
        activos.add(microsoft);
        activos.add(nvidia);
        activos.add(msciWorld);
        activos.add(msciTecnology);
        activos.add(vanguardEmergingMarkets);
        activos.add(picketTotalValue);
        activos.add(roboAdConservador);
        activos.add(roboAdModerado);

        // lista de personas
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        //Interfaz
        System.out.println("Vienbenido a la aplicacion SAJITARIUSBANK \n");
        while (true) {
            System.out.println("¿Que accion desea realizar?\n" +
                    "1 - ver de alguna accion\n" +
                    "2 - consultar carteras\n" +
                    "3 - actualizar informacion de algun activo (hace falta permisos especiales)\n");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Cual de esta acciones quieres mirar");
                    int contAux1 = 1;
                    for (Activo activoAUX: activos){

                        String activoStr = contAux1 + " " + activoAUX.getNombre();
                        System.out.println(activoStr);
                        contAux1++;
                    }
                    int seleccion1 = sc.nextInt();
                    System.out.println(activos.get(seleccion1-1));

                    break;
                case 2:
                    System.out.println("Introduzca su dni para acceder a su cartera");

                    break;
                case 3:

                    break;
            }

            System.out.println("\n escriba lo que sea para continuar...\n");
            String inutil = sc.next() + " ";


        }
    }
}