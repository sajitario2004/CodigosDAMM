import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime solo la hora: ");
        int hora1 = sc.nextInt();
        System.out.println("Dime ahora los minutos: ");
        int minutos1 = sc.nextInt();
        if (minutos1 < 60) {
            if (hora1 < 24) {
                int MediaNoche = 24 * 3600;
                int minutosResultado = MediaNoche - (minutos1 * 60 + (hora1 * 3600));
                System.out.println("Faltan " + minutosResultado + " minutos para la medianoche.");
            }else {
                System.out.println("Los minutos o la hora an sido mal introducidos.");
            }
        } else {
            System.out.println("Los minutos o la hora an sido mal introducidos.");
        }
    }
}
