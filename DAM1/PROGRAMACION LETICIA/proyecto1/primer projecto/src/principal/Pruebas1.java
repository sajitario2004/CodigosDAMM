package principal;

import java.util.Scanner;

public class Pruebas1 {
    public static void main(String[] args) {
        // Pruebas 2
        //Creamos la variable numDecimal y le asignamos un numero ya sea decimal (tipo double) o entero (tipo int)
        double numDecimal=(54654);
        //luego de creado lo anterior ya tendremos la variable impresa en pantalla con el texto que queramos
        System.out.println("hola"+numDecimal);

        //
        Scanner sc=new Scanner(System.in);
        //le pedimos la edad con la variable de recogida de numeros enteros nextInt
        System.out.println("dime tu edad");
        int edad=sc.nextInt();

        // Le pedimos su nombre con el comando next
        System.out.println("dime tu nombre");
        String nombre=sc.next();

        //Le pedimos su cantidad de dinero con decimales con la variable nextDouble
        System.out.println("dime tu dinero");
        double dinero=sc.nextDouble();

        //Mostramos todo el resultado de lo anterior con las variables y un comando de println
        System.out.println("dime tu "+nombre+"tu dinero es "+dinero+"tu edad es "+edad+"Tu novia se llama ");
        
    }
}
