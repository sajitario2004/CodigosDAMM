import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Genera un número entre 1 y 100
        int N = (int) (Math.random() * 100) + 1;
        int[] vector = new int[N];

        //Rellena el vector con números aleatorios entre 1 y 10
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10) + 1;
        }


        int posicion = 0;

        while (true) {
            try {
                System.out.print("Introduce la posición a mostrar (negativo para salir): ");
                posicion = sc.nextInt();

                if (posicion < 0) {
                    break;
                }

                //comprueba si la posición está dentro del rango del array
                if (posicion >= N) {
                    System.out.println("Error: Posición fuera de rango. El vector tiene " + N + " elementos.");
                } else {
                    System.out.println("Valor en la posición " + posicion + ": " + vector[posicion]);
                }

            } catch (Exception e) {
                System.out.println("Error: Entrada no válida.");
                //Este lo utilize en el ejer3 y ahi viene explicado
                //pero bueno este hace que se limpie el buffer del scaner
                sc.nextLine();
            }
        }

        sc.close();
    }
}
