import java.util.Scanner;

public class ejer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia de la semana: ");
        String dia = sc.next();
        System.out.println("Ingrese la hora que es: ");
        int hora = sc.nextInt();
        System.out.println("Ingrese la minuto que es: ");
        int minuto = sc.nextInt();

        int lunes = 0;
        int martes = 24*60;
        int miercoles = 48*60;
        int jueves = 72*60;
        int viernes =96*60;
        int FinSemana = (96+15) * 60;

        boolean diaTrue = hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves") || dia.equals("viernes");

        if (diaTrue) {
            if (dia.equals("lunes")) {
                int conteoTotal = (lunes + (hora * 60) + minuto) - FinSemana;
                conteoTotal = conteoTotal * (-1);
                System.out.println(conteoTotal + " minutos");
            }
            if (dia.equals("martes")) {
                int conteoTotal = (martes + (hora * 60) + minuto) - FinSemana;
                conteoTotal = conteoTotal * (-1);
                System.out.println(conteoTotal + " minutos");
            }
            if (dia.equals("miercoles")) {
                int conteoTotal = (miercoles + (hora * 60) + minuto) - FinSemana;
                conteoTotal = conteoTotal * (-1);
                System.out.println(conteoTotal + " minutos");

            }
            if (dia.equals("jueves")) {
                int conteoTotal = (jueves + (hora * 60) + minuto) - FinSemana;
                conteoTotal = conteoTotal * (-1);
                System.out.println(conteoTotal + " minutos");
            }
            if (dia.equals("viernes")) {
                if (hora < 15) {
                int conteoTotal = (viernes + (hora * 60) + minuto) - FinSemana;
                conteoTotal = conteoTotal * (-1);
                System.out.println(conteoTotal + " minutos");
                } else {
                    System.out.println("Ya estas en el fin de semana");
                }
            }
        }else {
            System.out.println("Uno de los datos introducidos es incorrecto");
        }
    }
}
