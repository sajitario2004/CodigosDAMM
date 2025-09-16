import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero es par");
            if (num % 5 == 0) {
                System.out.println("El numero es divisible entre 5");
            } else {
                System.out.println("Pero no es divisible entre 5");
            }
        } else {
            System.out.println("El numero es impar");
            if (num % 5 == 0) {
                System.out.println("Pero el numero es divisible entre 5");
            } else {
                System.out.println("Y tampoco es divisible entre 5");
            }
        }
    }
}
