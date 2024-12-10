import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        //creamos el array vector tipo double con 5 elementos
        double[] vector = new double[5];
        Scanner sc = new Scanner(System.in);

        // pedimos al usuario que introduzca los valores del vector
        for (int i = 0; i < vector.length; i++) {
            //hacemos un buleano que cada vez que el usuairio introduce un valor que no es un numero lo pide de nuevo
            boolean valorValido = true;

            while (valorValido) {
                try {
                    double iMas1 = i + 1;
                    System.out.print("Introduce el valor " + iMas1 + ": ");
                    vector[i] = sc.nextDouble();
                    //aqui acaba el bucle y pasa al la siguiente posicion en la variable vector
                    valorValido = false;

                } catch (Exception e) {
                    System.out.println("Valor no válido intente de nuevo.");
                    // Seño segun he leido esto sirve para limpiar el buffer y pasar a la siguiente liena
                    sc.nextLine();
                }
            }
        }

        //imprimo todo el vector introducido por el usuario
        //eso de arriba no se porque cada vez que escribo la palabra todo me lo pone todo en verde de ahi en adelante
        System.out.println("Vector completo:");

        for (int i = 0; i < vector.length; i++) {
            System.out.println(" - "+vector[i]);
        }

        sc.close();
    }
}
