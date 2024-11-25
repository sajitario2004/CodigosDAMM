package Apuntes;
import java.util.Scanner;

public class referencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la prueba que desea hacer: "+
                "\n 1-Referencia que almacena la variable t"+
                "\n 2-declaraciones en de varios array de una sola vez "+
                "\n 3-Acceso a la misma tabla reservada desde distintas variables"+
                "\n 4-(null) y su uso ");
        int n = sc.nextInt();
        if (n == 1) {
            try {
                System.out.println("");
                main1();
            }catch (Exception e) {
                System.out.println(""+
                        "\n Error ha introducido un valor invalido");
            }
        }else if (n == 2) {
            try {
                System.out.println("");
                main2();
            }catch (Exception e) {
                System.out.println(""+
                        "\n Error ha introducido un valor invalido");
            }
        }else if (n == 3) {
            try {
                System.out.println("");
                main3();
            }catch (Exception e) {
                System.out.println(""+
                        "\n Error ha introducido un valor invalido");
            }
        }else if (n == 4) {
            try {
                System.out.println("");
                main4();
            }catch (Exception e) {
                System.out.println(""+
                        "\n Error ha introducido un valor invalido");
            }
        }
        sc.close();
    }
    public static void main1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el numero de funciones que tiene el array");
        int n = sc.nextInt();
        int t[] = new int[n];
        /*
        Si ejecutamos las siguientes instrucciones nos devolvera la referencia que almacena
        la referencia almacenada en t en este caso nos devolvera lo que el alla convertido
        de int a cadena de texto es normal que aparezca algo raro como [I@5e9f23b4
         */
        System.out.println(t);

    }
    public static void main2() {
        /*
        Podemos crear varios arrays de una para luego asignarles su cantidad de celdas
        correspondiente y que decidamos mas tarde
         */
        int a[], b[], c[];

        //ahora podemos asignar a cada uno de estos arrays una longitud
        b = new int[4]; //Indicamos que b almacene 4 espacios en memoria
        c = new int[3]; //Ahora c almacenara 3 espacios en memoria
        // new = int[3]; resumiendo esto nos sirve para seleccionar uno o varios espacio en memoria
        System.out.println("b tiene un total de " + b.length + " almacenados en memoria");
        System.out.println("b tiene un total de " + c.length + " almacenados en memoria");
    }
    public static void main3() {
        //Es posible acceder a el mismo espacio reservado en memoria por un array desde otro array
        /*
        Esto se hace de la siguiente manera
         */

        int d[], e[]; //variables
        d = new int[4];// Construimos un espacio en memoria para d de 4 valores
        e = d;// ahora d y e apuntan al mismo intervalo en memoria

        //ahora podemos asignar por ejemplo a el espacio 1 de d el numero 95
        d[1] = 95;
        //Y asignamos a e en el el espacio 0=82 y al espacio 3= -5
        e[0]= 82;
        e[3]= -5;

        //ahora si imprimimos todo el array de e mirad lo que ocurre
        for (int i = 0; i != e.length; i++) {
            /*
            ponemos e[i] para que muestre lo que hay en la posicion de i que seria de 0 a 3
            el 3 es la cantidad de celdas que tenemos (4) y le restamos uno para que valla ce 0 a 3
             */
            System.out.print(e[i] + " - ");
        }
        System.out.println("");
        // Y si imprimieramos el de d
        for (int i = 0; i != d.length; i++) {
            System.out.print(d[i] + " - ");
        }

        /*
        Si te fijas las dos imprimen lo mismo por que las dos variables
        apuntan al mismo array en memoria
         */


    }

    public static void main4() {
        /*
        En el unico caso en el que podemos modificar las celdas que tiene una variable es
        declarandola como null para eliminarla en memoria
         */
        //por ejemplo declararemos 2 variables que apunten al mismo espacio
        int t1[], t2[];
        t1 = new int[4];
        t2 = t1;
        /*
        con esto hemos declarado que tanto t1 como t2 tienen el mismo espacio en memoria
        tambien le asignaremos valores ahora a los 4 espacios que tiene
         */
        t1[0] = 1;
        t2[1] = 3;
        t1[2] = 4;
        t2[3] = -5;
        /*
        Ahora aunque anulermos t1, t2 seguira apuntando al mismo array en memoria
         */
        t1 = null;

        //ahora para comprobar que no nos hemos cargado los valores imprimiremos todos los espacios
        for (int i = 0; i != t2.length; i++) {
            System.out.print(t2[i] + " - ");
        }

        System.out.println("");//Salto de linea

        try {
            for (int i = 0; i < t1.length; i++) {
                System.out.print(t1[i] + " ; ");
            }
        }catch (Exception e) {
            System.out.println("Si da error sale esto");
        }
    }
}
