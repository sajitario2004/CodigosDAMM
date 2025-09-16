import java.util.Scanner;

public class ejer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        int num2 = num1;
        if (num1 < 0) {
            num1 = (num1) * (-1);
            num2 = (num2) * (-1);
        }
        if (num1 == num2 % 10) {
            int num3 = num1;
            System.out.println("La ultima cifra es: " + num3);
        }
        if (num1 == (num2 % 100) && num1 > 9) {
            int num3 = (num1 - num1 % 10) / 10;
            System.out.println("El ultima cifra es: " + num3);
        }
        if (num1 == (num2 % 1000) && num1 > 99){
            int num3 = (num1 - (num1 % 10 + num1 % 100)) / 100 +1 ;
            System.out.println("El ultima cifra es: " + num3);
        }
        if (num1 == num2 % 10000 && num1 > 999 ) {
            int num3 = (num1 - (num1 % 10 + num1 % 100 + num1 % 1000)) / 1000 +1 ;
            System.out.println("El ultima cifra es: " + num3);
        }
        if (num1 == num2 % 100000 && num1 > 9999) {
            int num3 = (num1 - (num1 % 10 + num1 % 100 + num1 % 1000 + num1 % 10000)) / 10000 +1 ;
            System.out.println("El ultima cifra es: " + num3);
        }
        if (num1 > num2 % 100000 && num1 > 9999) {
            System.out.println("El numero contiene demasiadas cifras");
        }
    }

}
