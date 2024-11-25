package ejercicios;

public class ejer1 {
    public static void main(String[] args) {
        //asignamos a cada variable su correspondiente tipo de variable.
        // utilizo float para no complicarme y que no de errores de ningun tipo decimal
        float x = 144;
        float y = 999;
        int suma;
        int resta;
        float multiplicacion;
        float division;

        //asignamos las ecuaciones que vamos a hacer
        suma = (int) (x + y);
        resta = (int) (x - y);
        multiplicacion = (float) (x * y);
        division = (float) (x / y);

        //respondemos al usuario los resultados con println
        System.out.println("el resultado de la suma es "+suma);
        System.out.println("el resultado de la resta es "+resta);
        System.out.println("el resultado de la multiplicacion es "+multiplicacion);
        System.out.println("el resultado de la division es "+division);
    }
}
