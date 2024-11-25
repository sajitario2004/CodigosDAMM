import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los 8 numeros de su dni");
        int dniNum = sc.nextInt();
        if (dniNum > 99999999 && dniNum < 10000000) {

            System.out.println("Error");
        }else {
            String dniStr = "TRWAGMYFPDXBNJZSQVHLCKE";
            int indice = dniNum % 23;
            char letra = dniStr.charAt(indice);
            System.out.println("Su dni es: " + dniNum + letra);
        }
    }
}
