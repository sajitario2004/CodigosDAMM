import java.util.Scanner;

public class ejer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las coordenadas del centro de la primera circunferencia (x1, y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Introduce el radio de la primera circunferencia (r1): ");
        int r1 = sc.nextInt();

        System.out.print("Introduce las coordenadas del centro de la segunda circunferencia (x2, y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Introduce el radio de la segunda circunferencia (r2): ");
        int r2 = sc.nextInt();

        double distancia = Math.sqrt((Math.pow(x2,2) - Math.pow(x1,2)) + ((Math.pow(y2,2) - Math.pow(y1,2))));


        if (distancia > r1 + r2) {
            System.out.println("Las circunferencias son exteriores.");
        }

        if (distancia == r1 + r2) {
                    System.out.println("Las circunferencias son tangentes exteriores.");
        }

        if (distancia < Math.abs(r1 - r2)) {
            if (distancia == 0) {
                        System.out.println("Las circunferencias son concéntricas.");
            } else {
                System.out.println("Las circunferencias son interiores.");
                    }
        }

        if (distancia == Math.abs(r1 - r2)) {
            System.out.println("Las circunferencias son tangentes interiores.");
        } else {
            System.out.println("Las circunferencias son secantes.");
        }
    }
}
