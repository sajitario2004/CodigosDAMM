import java.util.Scanner;

public class ejer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el numero");
        int num = sc.nextInt();
        System.out.println("ahora introduce la potencia");
        int potencia = sc.nextInt();

        boolean potenciaTrue = potencia > 0;
        boolean potenciaFalse = potencia < 0;
        boolean potenciaZero = potencia == 0;

        if (potenciaTrue) {
            int resultado = (int) Math.pow(num,potencia);
            System.out.println("El resultado es " + resultado);
        }
        if (potenciaFalse) {
            System.out.println("El exponente es negativo osea que el resultado es " + "1/" + num + "^" + potencia );
        }
        if (potenciaZero) {
            System.out.println("El exponente es 0 por lo tanto el resultado es 1");
        }

    }
}
