package Apuntes;

import java.util.Scanner;

public class construccionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la prueba que desea hacer: "+
                "\n 1-Tipos de dados a alamacenar"+
                "\n 2-Nombre de la variable "+
                "\n 3-Creacion propia del array");
        int n = sc.nextInt();
        if (n == 1) {
            try {
                System.out.println("\033[H\033[2J]");
                main1();
            }catch (Exception e) {
                System.out.println("\033[H\033[2J"+
                        "\n Error ha introducido un valor invalido");
            }
        }else if (n == 2) {
            try {
                System.out.println("\033[H\033[2J");
                main2();
            }catch (Exception e) {
                System.out.println("\033[H\033[2J"+
                        "\n Error ha introducido un valor invalido");
            }
        }else if (n == 3) {
            try {
                System.out.println("\033[H\033[2J");
                main3();
            }catch (Exception e) {
                System.out.println("\033[H\033[2J"+
                        "\n Error ha introducido un valor invalido");
            }
        }
        sc.close();
    }
    public static void main1() {
        //Tipo de datos a almacenar y tamaño del array
        System.out.println("En esta parte no se aran pruebas. Lee el codigo friki");
        /*
        Las variables de array se pueden declarar de 2 formas
         */
        //forma 1
        int nombreVariable1[];
        //tipo nombreVariable[];

        //forma 2
        int[] nombreVariable2;
        //tipo[] nombreVariable;

        /*
        tipo: representara el tipo de variable que vamos a hacer como por ejemplo:
        String, int, Double.

        nombreVariable: es el Nombre

        []: Es una forma de inticar que esa variable es un array que va a almacenar contenido
         */


    }

    public static void main2() {
        //Nombre de la variable
        /*
        una vez declarada la variable (Hecho en el "1-Tipo de dato...") hay que asignarle una
        longitud (En esta no se podra modificar su longitud una vez hecha)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Que longitud quieres en tu variable?");
        int longitud = sc.nextInt();

        /*
        dentro del segundo int[] colocaremos o la variable que hemos pedido o la longitud
        que queramos ya sea 3 o 5 o lo que se nos pida(esto no se podra cambiar luego)
         */
        int[] nombreVariable1 = new int[longitud];

        System.out.println("La longitud de elementos que has puesto es: \n" +
                nombreVariable1.length);

    }

    public static void main3() {
        //Creacion de arrays propia
        /*
        Podemos crear arrays directamente y su contenido con lo siguiente
         */

        int datos1[] = {2, -5, 0, 99};// Esta tabla tiene como longitud de elementos 4

        //Con lo siguente veremos el contenido de cada posicion
        Scanner sc = new Scanner(System.in);
        System.out.println("que posicion deseas ver de entre 1 y 4");
        int posicion = sc.nextInt();
        /*
        el -1 es importantisimo por que hay que tener en cuenta que empezamos
        desde la posicion 0. En este caso como tenemos 4 posiciones seran la posicion
        de la 0 a la 3(0 . 1 . 2 . 3)
        */
        System.out.println("El valor que estas buscando es: "+datos1[posicion-1]);

        /*
        A parte tambien tenemo otra forma de construir los arrays, que es la sigiente
         */
        /*
        Declaramos el array con por ejemplo 4 posiciones.
        (Estas 4 estaran rellenas por 0 asta que las cambiemos)
         */
        int[] datos2= new int[4];

        //para cambiar la primera posicion y asignarle por ejemplo un 2
        datos2[0]= 2;

        //para cambiar la segunda y asignarle por ejemplo un -9
        datos2[1]= -9;

        //para la tercera asignarle un 999
        datos2[2]= 999;

        //Asi lo podemos hacer con todos
    }
}
