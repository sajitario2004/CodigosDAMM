import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println(n1 + ", " + n2 + ", " + n3);
            }
            if (n3 > n2) {
                System.out.println(n1 + ", " + n3 + ", " + n2);
            }
        }
        if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println(n2 + ", " + n1 + ", " + n3);
            }
            if (n3 > n1) {
                System.out.println(n2 + ", " + n3 + ", " + n1);
            }
        }
        if (n3 > n2 && n3 > n1) {
            if (n2 > n1) {
                System.out.println(n3 + ", " + n2 + ", " + n1);
            }
            if (n1 > n2) {
                System.out.println(n3 + ", " + n1 + ", " + n2);
            }
        }
    }
}
