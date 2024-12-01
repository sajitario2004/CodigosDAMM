import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class biblioFun {
    /*
    Esta funcion hace un nuevo array, luego te imprime una pregunta y
    te pregunte un valor nuevo para introducir al array nuevo que sera el antiguo
    mas 1 de espacio con el dato nuevo dentro de esta ultima posicion
     */
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

    public static int[] quitarUltimo(int[]numNormal){
        int[] numRestado=new int[numNormal.length-2];
        numRestado = Arrays.copyOf(numNormal, numRestado.length-2);
        return numRestado;
    }

    public static int[] restarIzquierdo(int[] restar){
        int [] restar2 = new int[restar.length - 2];
        restar2= Arrays.copyOfRange(restar, 1, restar.length-1);
        return restar2;
    }

    public static int[] tamanoExtra1(int[] array, int nuevoElemento) {
        int[] anadido = Arrays.copyOf(array, array.length + 1);
        anadido[array.length] = nuevoElemento;
        return anadido;
    }
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
}
