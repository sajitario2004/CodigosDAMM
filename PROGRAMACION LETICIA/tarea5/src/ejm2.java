import java.util.Scanner;

public class ejm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 1 para saber si el area del cilindro y 2 para su volumen");
        int select = sc.nextInt();
        System.out.println("Introduce el radio del cilindro");
        int radio = sc.nextInt();
        System.out.println("Introduce la altura del cilindro");
        int altura = sc.nextInt();
        float resultado = calcularAreaOvolumen(select,radio,altura);
        if (select == 1){
            System.out.println("El resultado del area del cilindro es "+resultado);
        }else if (select == 2){
            System.out.println("El resultado del volumen es "+resultado);
        }else {
            System.out.println("ha introducido mal el valor de selecion");
        }

    }
    public static float calcularAreaOvolumen(int select, int radio, int altura){
        float resultado = 0;
        if(select == 1){
            resultado = (float) (2*Math.PI * radio * (radio + altura));

        }else if(select == 2){
            resultado = (float) (Math.PI * Math.pow(radio,2)* altura);

        }

        return resultado;
    }
}
