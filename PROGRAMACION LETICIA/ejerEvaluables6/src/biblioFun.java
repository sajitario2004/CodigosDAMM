import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class biblioFun {
    public static int[] arrayInfinito(String pregunta, int[] infinito1, int contador){
        Scanner sc = new Scanner(System.in);
        int infinito[] = new int[contador];
        infinito = Arrays.copyOf(infinito1, contador);
        System.out.println("\n"+pregunta + contador);
        int trabajadorSLG = sc.nextInt();
        infinito[infinito.length - 1] = trabajadorSLG;
        return infinito;
    }

    public static int[] restarIzquierdo(int[] restar){
        int [] restar2 = new int[restar.length - 2];
        restar2= Arrays.copyOfRange(restar, 1, restar.length-1);
        return restar2;
    }
}
