import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        System.out.println("Introduce el numero de veces que quieres que se repita por pantalla: ");
        int veces = sc.nextInt();

        String respuesta = repeticiones(veces,num);
        System.out.println(respuesta);
    }

    private static String repeticiones(int veces, int num) {
        String respuesta = "";
        if (veces < 0 || 0 > num) {
            respuesta = "Uno de los valores es incorrecto";
        }else {
            for (int i = 0; i < veces; i++) {
                respuesta += num + "\n";
            }
        }
        return respuesta;
    }
}
