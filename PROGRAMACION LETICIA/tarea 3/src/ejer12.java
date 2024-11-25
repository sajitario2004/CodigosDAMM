import java.util.Scanner;

public class ejer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un caracte: ");
        String cad = sc.nextLine();
        String caracte = cad.substring(0,1) ;
        System.out.println("Quieres que la piramide apunte:");
        System.out.println("1. arriba");
        System.out.println("2. abajo");
        int orientacion = sc.nextInt();
        if (orientacion == 1) {
            System.out.println("--*--");
            System.out.println("-*" + caracte +"*-");
            System.out.println("*****");
        }

        if (orientacion == 2) {
            System.out.println("*****");
            System.out.println("-*" + caracte +"*-");
            System.out.println("--*--");
        }
    }
}
