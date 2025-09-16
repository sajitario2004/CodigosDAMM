import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] terna = new int[3];
        String[] letras = {"x", "y", "z"};
        for (int i = 0; i < terna.length; i++) {
            System.out.println("Ingrese " + letras[i] + ":");
            terna[i] = scanner.nextInt();
        }
        calcularTerna(terna);
        scanner.close();
    }
    public static void calcularTerna(int[] terna) {
        boolean esCorrect = Math.pow(terna[2], 2) == Math.pow(terna[0], 2) + Math.pow(terna[1], 2) ;
        System.out.println("El valor de la terna es: " + terna[0] + ", " + terna[1] + ", " + terna[2]+"\n");
        if (esCorrect) {
            System.out.println("La terna es correcta. Es la siguiente " +
                    terna[0] + "^2 + " + terna[1] + "^2 = " + terna[2] + "^2 ");
        }else {
            System.out.println("La terna no es correcta.");
        }
    }
}
