import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class biblioFun {
    /*
    Esta funcion hace un nuevo array, luego te imprime una pregunta y
    te pregunte un valor nuevo para introducir al array nuevo que sera el antiguo
    mas 1 de espacio con el dato nuevo dentro de esta ultima posicion
     */

    //Esta funcion la tengo para que cuando quiera preguntar al usuario y agrandar un array y darle el valor que introduzca el usurio
    public static int[] arrayInfinitoConpregunta(String pregunta, int[] infinito1, int contador){
        Scanner sc = new Scanner(System.in);
        int infinito[] = new int[contador];
        infinito = Arrays.copyOf(infinito1, contador);
        System.out.println("\n"+pregunta + contador);
        int trabajadorSLG = sc.nextInt();
        infinito[infinito.length - 1] = trabajadorSLG;
        sc.close();
        return infinito;

    }

    //Esta no la utilice al final y es para quitar el ultimo digito por si el usuario introduce -1
    public static int[] quitarUltimo(int[]numNormal){
        int[] numRestado=new int[numNormal.length-2];
        numRestado = Arrays.copyOf(numNormal, numRestado.length-2);
        return numRestado;
    }

    //Esta funcion es simple es para quirar el primer valor de la izquierda,lo hago copiando desde la posicion 1 hacia delante(me salto la 0)
    public static int[] restarIzquierdo(int[] restar){
        int [] restar2 = new int[restar.length - 2];
        restar2= Arrays.copyOfRange(restar, 1, restar.length-1);
        return restar2;
    }
    //esta es parecida a la primera pero modificada de manera que solo nos devolvera el
    public static int[] tamanoExtra1(int[] array, int nuevoElemento) {
        int[] anadido = Arrays.copyOf(array, array.length + 1);
        anadido[array.length] = nuevoElemento;
        return anadido;
    }

    //Esta es la funcion que nos pide para sumar con intervalos si el usuario quiere sumar de 3 en 3 o de 4 en 4
    public static int[] suma(int[] t, int numElementos) {
        int[] resultados = new int[t.length - numElementos + 1];
        for (int i = 0; i <= t.length - numElementos; i++) {
            int suma = 0;
            for (int j = 0; j < numElementos; j++) {
                suma += t[i + j];
            }
            resultados[i] = suma;
        }
        return resultados;
    }

    //Esta es vastante mas larga de comentar asi que la comentares por partes
    public static int[] buscarTodos(int[] t, int clave) {
        // Contar cuantas veces aparece la clave en la tabla
        int contador = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                contador++;
            }
        }

        // Si no se encuentra la clave, devolver una tabla vacia
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

        //Devolvemos todas las posiciones donde se encuentra la clave
        return indices;
    }
}
