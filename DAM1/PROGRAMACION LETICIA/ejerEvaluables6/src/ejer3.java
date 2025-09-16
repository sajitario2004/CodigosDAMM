import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int contador = 0;
        //hago una variable de dos dimensiones para que la primera dimension sea el tirmestre y la segunda los alumnos
        int[][] alumnos = new int[3][5];
        //para no tener que hacer un for por cada trimestre hice un string que luego usare para un solo for
        String[] curso = {"primer", "segundo", "tercer"};
        int variableModificable;
        int acomuladorNotasTotal = 0;
        float acomuladorNotasPrimero = 0;
        float acomuladorNotasSegundo = 0;
        float acomuladorNotasTercero = 0;
        //Seño hago un try por que vi las excepciones por si el usuario introduce valores no entero u otras cosas
        try {
            System.out.println(alumnos[0].length);
            //este prime for se encargara del trimestre j = dimension trimestre
            for (int j = 0; j < alumnos.length; j++) {
                //este segundo de almacenar los datos de los alumnos en cada trimestre y la varible i del for sera el alumno
                for (int i = 0; i < alumnos[0].length; i++) {
                    contador++;
                    //con el array string de antes segun la posicion de j imprimira un trimestre u otro
                    System.out.println("Dime las notas del "+curso[j]+" trimestre del alumno numero " + contador);
                    variableModificable = sc.nextInt();
                    //esto lo hice por si el usuario introduce mal algun dato que lo tenga que volver a introducir
                    boolean comprobNota = variableModificable < 0 || variableModificable > 10;
                    if (comprobNota) {
                        System.out.println("Ha intoducido mal los datos del alumno vuelva a repetirmelos");
                        i--;
                        contador--;
                    } else if(j==0){
                        System.out.println("Ha introducido bien los datos\n");
                        //utilizando j del trimestre y por la posicion que vallamos de i he ido almacenandola en la misma variable
                        alumnos[j][i] = variableModificable;
                        acomuladorNotasTotal += variableModificable;
                    } else if(j==1){
                        System.out.println("Ha introducido bien los datos\n");
                        alumnos[j][i] = variableModificable;
                        acomuladorNotasTotal += variableModificable;
                    } else if(j==2){
                        System.out.println("Ha introducido bien los datos\n");
                        alumnos[j][i] = variableModificable;
                        acomuladorNotasTotal += variableModificable;
                    }
                }
                contador= 0;
            }
            //esto lo hice para hacer una media del curso de todos los alumnos juntos
            acomuladorNotasTotal /= 15;
            //cada uno de los siguiente for calcula la nota media de cada trimestre de toda la clase
            for (int i = 0; i < alumnos[0].length; i++) {
                acomuladorNotasPrimero += alumnos[0][i];
            }
            acomuladorNotasPrimero /= 5;
            for (int i = 0; i < alumnos[1].length; i++) {
                acomuladorNotasSegundo += alumnos[1][i];
            }
            acomuladorNotasSegundo /= 5;
            for (int i = 0; i < alumnos[1].length; i++) {
                acomuladorNotasTercero += alumnos[2][i];
            }
            acomuladorNotasTercero /= 5;

            // esto me quedo un poco largo y lo podria haber hecho mas corto pero para aprobechar el array curso hice el for
            for (int i = 0; i < alumnos.length; i++) {
                if(i==0){
                    System.out.println("la nota media del "+curso[i]+"trimestre es:"+acomuladorNotasPrimero);
                } else if(i==1){
                    System.out.println("la nota media del "+curso[i]+"trimestre es:"+acomuladorNotasSegundo);
                } else if(i==2){
                    System.out.println("la nota media del "+curso[i]+"trimestre es:"+acomuladorNotasTercero);
                }
            }
            System.out.println("La nota media de todo el curso de la clase es; "+acomuladorNotasTotal);
            //para que el usuario pueda preguntar cuantas veces quiera hice un bucle infinito asta que el usuario introduzca un valor mal
            while(true) {
                System.out.println("Sobre que alumno quiere saber su nota(escriba algun numero de ningun alumno para finalizar)");
                int alumnoEspecifico = sc.nextInt();
                if (alumnoEspecifico > 5 || alumnoEspecifico < 0) {
                    break;
                }
                //lo paso a float para que haga una media correcta y no redondeada
                float notaAlumnoEspecifico = ((float) (alumnos[0][alumnoEspecifico-1] + alumnos[1][alumnoEspecifico-1] + alumnos[2][alumnoEspecifico-1])) / 3;
                System.out.println("la nota media del alumno es; "+notaAlumnoEspecifico);
            }
            System.out.println("El programa va a finalizar");

        }catch (Exception e) {
            System.out.println("ha habido un error por que ha introducido datos erroneos como letras\n"+
                    "o caracteres que no son numeros enteros");
        }
    }
}

