import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        String respuesta = calculoIntermedio(num1,num2);
        System.out.println(respuesta);
    }

    public static String calculoIntermedio(int num1, int num2) {
        String respuesta = "";
        if (0 > num2 || 0 > num1) {
            respuesta = "El primer o el segundo valor no es numero no es valido";
        }else {
            int cantidad = num1 - num2;
            if (cantidad < 0) {
                cantidad = cantidad * -1;
            }
            cantidad -= 2;
            if (cantidad < 0) {
                respuesta = "Son numero demasiado proximos,\nno hay numeros entre medio";

            } else {
                int menor = Math.min(num1, num2);
                int mayor = Math.max(num1, num2);
                for (int i = ++menor; i < mayor; i++) {
                    respuesta += i + " ";
                }

            }
        }
        return respuesta;
    }
}
