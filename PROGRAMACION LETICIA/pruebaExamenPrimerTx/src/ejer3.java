import java.util.Arrays;
import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mesas = new int[10];
        int comensales;
        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = (int)(Math.random()*5+0);
        }
        while (!comprobComensales(mesas)) {
            System.out.println(Arrays.toString(mesas));
            System.out.println("Cuantos comensales sois?");
            comensales = sc.nextInt();
            if (comprobSePuedeAnadir(mesas, comensales)) {
                mesas = anadirComensales(mesas, comensales);
            }else{
                System.out.println("No se puede anadir en el comensal");
            }
        }
        System.out.println("restaurante lleno ");
    }

    public static boolean comprobSePuedeAnadir(int[] mesas, int comensales){
        int contador = 0;
        if (comensales > 4){
            return false;
        }else {
            for (int i = 0; i < mesas.length; i++) {
                boolean comprob = 4 < mesas[i] + comensales;
               /* System.out.println(mesas[i] + comensales);*/
                if (comprob){
                    contador++;
                }
            }
        }
        if (contador == 10 ) {
            return false;
        }else {
            return true;
        }
    }

    public static int[] anadirComensales(int[] mesas, int comensales) {
        int[] comensalesAnadidos = new int[mesas.length];
        int contadorMesas = 0;
        comensalesAnadidos = Arrays.copyOf(mesas, comensalesAnadidos.length);
        while (true) {
            if (4 >= mesas[contadorMesas] + comensales) {
                comensalesAnadidos[contadorMesas] = mesas[contadorMesas] + comensales;
                break;
            }
            contadorMesas++;
        }

        return comensalesAnadidos;
    }

    public static boolean comprobComensales(int[] mesasConComensales){
        int contador = 0;
        for (int i = 0; i < mesasConComensales.length; i++) {
            if (mesasConComensales[i] == 4) {
                contador++;
            }
        }
        if (contador == mesasConComensales.length) {
            return true;
        }else {
            return false;
        }
    }
}
