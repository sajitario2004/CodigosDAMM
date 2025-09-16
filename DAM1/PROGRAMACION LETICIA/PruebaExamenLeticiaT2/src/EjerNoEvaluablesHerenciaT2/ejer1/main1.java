package EjerNoEvaluablesHerenciaT2.ejer1;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {

        Bicicleta bici1 = new Bicicleta();

        Coche coche1 = new Coche("Si", "toyota" ,35);

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Que accion desea realizar?: " +
                    "1. Anda con la bicicleta\n" +
                    "2. Haz el caballito con la bicicleta\n" +
                    "3. Anda con el coche\n" +
                    "4. Quema rueda con el coche\n" +
                    "5. Ver kilometraje de la bicicleta\n" +
                    "6. Ver kilometraje del coche\n" +
                    "7. Ver kilometraje total\n" +
                    "8. Salir\n");
            int pregunta = sc.nextInt();

        }

    }
}
