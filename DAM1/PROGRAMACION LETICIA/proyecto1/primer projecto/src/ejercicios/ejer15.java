package ejercicios;

import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esta lloviendo?" +
                "1 SI" +
                "2 NO");
        float Lluvia = sc.nextFloat();
        System.out.println("Tienes tarea?" +
                "1 Si" +
                "2 No");
        float tarea = sc.nextFloat();
        boolean Salida = tarea==Lluvia ? true : false;
        String Mensaje_Salida = Salida ? "Si puedes salir" : "No puedes salir";
        boolean biblioteca1 = tarea==1 ? true : false;
        String mensaje = biblioteca1 ? "Vas a la bibiloteca" +
                "1 Si" +
                "2 No" (float  biblioteca = sc.nextFloat()) : "Entonces te quedas en casa";

    }
}
