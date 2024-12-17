import java.util.Scanner;
public class ejercicioBucleMultipli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numero = scanner.nextInt();
        System.out.println("Los múltiplos de " + numero + " son:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero * i);
        }
    }
}
