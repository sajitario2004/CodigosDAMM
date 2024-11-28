import java.util.Arrays;
import java.util.Scanner;

public class ejerPrueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ahora procedere a preguntarte cual es el dorsal de cada niño.");
        int ninos[];
        ninos = new int[1];
        String preguntaNinos = "Cual es el dorsal de este niño?";
        int fnArrNinos = 0;
        int contadorNin = 0;
        while (fnArrNinos != -1) {
            boolean comprobNn = ninos[ninos.length - 1] != - 1;
            if (comprobNn) {
                contadorNin++;
                ninos = arrayInfi1(preguntaNinos, ninos, contadorNin);
            } else {
                fnArrNinos = -1;
            }
        }
        System.out.println("Ahora procedere a preguntarte el dorsal de aquellos que hallan dado positivo en el test antidoping");
        int doping[];
        doping = new int[1];
        String preguntaDoping = "Cual es el dorsal de esta persona?";
        int fnArrDop = 0;
        int contadorDop = 0;
        while (fnArrDop != -1) {
            boolean comprobDop = doping[doping.length - 1] != - 1;
            if (comprobDop) {
                contadorDop++;
                doping = arrayInfi1(preguntaDoping, doping, contadorDop);
            } else {
                fnArrDop = -1;
            }
        }
        System.out.println("Ahora procedere a preguntarte el dorsal de aquellos que no hallan pagado la carrera");
        int noPagado[];
        noPagado = new int[1];
        String noPagadoStr = "Cual es el dorsal de esta persona?";
        int fnArrNP = 0;
        int contadorNP = 0;
        while (fnArrNP != -1) {
            boolean comprobNP = noPagado[noPagado.length - 1] != - 1;
            if (comprobNP) {
                contadorNP++;
                noPagado = arrayInfi1(noPagadoStr, noPagado, contadorNP);
            } else {
                fnArrNP = -1;
            }
        }
        System.out.println("Ahora procedere a preguntarte el dorsal de aquellas personas que no cumplan nada de lo anterior");
        int normal[];
        normal = new int[1];
        String normalStr = "Cual es el dorsal de esta persona?";
        int fnArrNormal = 0;
        int contadorNormal = 0;
        while (fnArrNormal != -1) {
            boolean comprobNormal = normal[normal.length - 1] != - 1;
            if (comprobNormal) {
                contadorNormal++;
                normal = arrayInfi1(normalStr, normal, contadorNormal);
            } else {
                fnArrNormal = -1;
            }
        }
        //System.out.println(Arrays.toString(normal));
        int todosCorredores[];
        todosCorredores = new int[(ninos.length-2)+(doping.length-2)+(noPagado.length-2)+(normal.length-2)];
        todosCorredores= Arrays.copyOfRange(ninos, 0, ninos.length-1);
        System.out.println(Arrays.toString(todosCorredores)+" "+ todosCorredores.length);

        todosCorredores = sumaArrays(todosCorredores,doping);
        todosCorredores = sumaArrays(todosCorredores,noPagado);
        todosCorredores = sumaArrays(todosCorredores,normal);

        System.out.println("Estos son todos los dorsales que hay ahora mismo"+Arrays.toString(todosCorredores)+
                "ahora se procedera con la carrera");

        //seño aqui tenia pensado un array del mismo tamaño que el que los junta a todos y hacer un math.random de todosCorredores.length
        //Luego tambien tenia pensado segun la posicion con otra funcion comprobara en cual de los antiguos array esta y hacer los cambios de puesto en funcion a cual de los anteriores datos a cumplimentado
    }
    public static int[] arrayInfi1(String pregunta, int[] infin, int contador){
        Scanner sc = new Scanner(System.in);
        int infin1[] = new int[contador];
        infin1 = Arrays.copyOf(infin, contador);

        System.out.println("\n"+pregunta);

        int numeroINT = sc.nextInt();
        infin1[infin1.length - 1] = numeroINT;
        return infin1;
    }
    public static int[] sumaArrays(int[] array1, int[] array2){
        // Crear un nuevo array para almacenar el resultado
        int tamanoArray = array1.length + array2.length - 1;
        int[] resultArray = new int[tamanoArray];

        // Copiar el primer array completo al resultado
        System.arraycopy(array1, 0, resultArray, 0, array1.length);

        // Copiar el segundo array, excluyendo el último elemento
        System.arraycopy(array2, 0, resultArray, array1.length, array2.length - 1);

        return resultArray;
    }
}
