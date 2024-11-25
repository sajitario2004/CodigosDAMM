import java.util.Arrays;
import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su Array");
        int lengthTabla = sc.nextInt();

        int[] tabla = new int[lengthTabla];


        for (int i = 0; i < lengthTabla; i++) {
            System.out.println("Ingrese el valor de la posicion " + i );
            tabla[i] = sc.nextInt();
        }

        System.out.println("Ingrese la clave de busqueda");
        int clave = sc.nextInt();
        int[] resultado= buscarTodos(tabla,clave);

        System.out.println("En las posiciones en las que esta la clave es "+Arrays.toString(resultado));
    }
    public static int[] buscarTodos(int[] t, int clave) {
        // Contar cuántas veces aparece la clave en la tabla
        int contador = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                contador++;
            }
        }

        // Si no se encuentra la clave, devolver una tabla vacía
        if (contador == 0) {
            return new int[0];
        }

        // Crear una tabla para almacenar los índices
        int[] indices = new int[contador];
        int posicion = 0;

        // Llenar la tabla con los índices donde se encuentra la clave
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                indices[posicion] = i ;
                posicion++;
            }
        }

        return indices;
    }
}
