import java.util.Arrays;
import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //preguntamos el tamaño del array al usuario
        System.out.println("Ingrese el tamaño de su Array");
        int lengthTabla = sc.nextInt();

        int[] tabla = new int[lengthTabla];


        for (int i = 0; i < lengthTabla; i++) {
            System.out.println("Ingrese el valor de la posicion " + i );
            tabla[i] = sc.nextInt();
        }

        System.out.println("Ingrese la clave de busqueda");
        int clave = sc.nextInt();
        int[] resultado= biblioFun.buscarTodos(tabla,clave);

        System.out.println("En las posiciones en las que esta la clave es "+Arrays.toString(resultado));
    }

}
