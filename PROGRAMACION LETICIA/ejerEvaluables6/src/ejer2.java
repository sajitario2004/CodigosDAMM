import java.util.Arrays;

public class ejer2 {
    public static void main(String[] args) {
        String pregunta = "Cuanto cobra el trabajador numero ";
        int trabajadores[] = new int[2];
        int finArray = 0;
        int contador = 0;

        while (finArray != -1) {
            boolean comprob = trabajadores[trabajadores.length - 1] != - 1;
            if (comprob) {
                contador++;
                trabajadores = biblioFun.arrayInfinitoConpregunta(pregunta, trabajadores, contador);
            } else {
                finArray = -1;
            }
        }

        Arrays.sort(trabajadores);
        trabajadores = biblioFun.restarIzquierdo(trabajadores);

        System.out.println("Todos los sueldos introducidos ordenados de forma decreciente\n"+
                Arrays.toString(trabajadores));
        System.out.println("El sueldo maximos de los trabajadores es: "+
                trabajadores[trabajadores.length - 1]);
        System.out.println("El sueldo mas queño en la empresa es: "+trabajadores[0]);

        int media = 0;

        for (int i = 0; i < trabajadores.length; i++) {
            media += trabajadores[i];

        }
        media /= (trabajadores.length -1);

        System.out.println("El media de lo que cobran los trabajadores es es: "+media);
    }



}
