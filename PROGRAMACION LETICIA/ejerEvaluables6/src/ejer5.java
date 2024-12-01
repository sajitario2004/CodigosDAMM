
import java.util.Arrays;
import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[0];
        String pregunta = "(Cuando introduzca numero negativos el sistema parara)\nEl tamaño del array es "+
                t.length
                +"\nIntroduzca el numero ";
        int num=0;
        //hago un bucle infinito asta que el usuario introduzca un numero negativo entonces hago un break
        for (int i=0;num==num;i++) {
            System.out.print(pregunta);
            num = sc.nextInt();
            if (num > 0){
                t = biblioFun.tamanoExtra1(t,num);
                System.out.println(Arrays.toString(t));
            }else if(num<0){
                break;
            }
        }
        System.out.println("Ahora decide como se van a organizar los elementos del array para su suma\n"+
                "Por ejemplo que quieres de 3 en 3 o de 4 en 4");
        int organizador= sc.nextInt();
        boolean comproOrgan = organizador <= t.length;
        if (comproOrgan) {
            int[] resultados = biblioFun.suma(t, organizador);
            System.out.println("Resultados de las sumas: " + Arrays.toString(resultados));
        } else {
            System.out.println("La suma no puede superar la cantidad de números que tiene el array");
        }

        System.out.println("Array original: " + Arrays.toString(t));
        sc.close();
    }




}
