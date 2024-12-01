import java.util.Arrays;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        String[][] mapa = new String[10][10];
        Scanner sc = new Scanner(System.in);

        //Hago el mapa en blanco
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mapa[i][j] = "  *   ";
            }
        }
        //hago una funcion para dibujar los caminos del mapa para que se vea mas bonito
        mapa = dibujarMapa(mapa);
        //creo las ubicaciones en el mapa
        mapa[5][0]=" CASA ";
        mapa[5][4]="Lugar1";
        mapa[9][7]="Lugar2";
        mapa[3][8]="Lugar3";
        //Hago una variable lugar actual para siempre mostrarle al usuario en que ubicacion esta
        String lugarActual = mapa[5][0];
        while (true) {
            int respuesta;
            //le pregunto al usuario que haccion quiere hacer
            System.out.println("Actualmente estas en "+lugarActual);
            System.out.println("Que opcion desea realizar?:\n" +
                    "1 = viajar\n" +
                    "2 = mostrar mapa\n" +
                    "3 = cerrar");
            int opcion = sc.nextInt();
            //ahora le pregunto a que destino quiere viajar
            if (opcion == 1) {
                System.out.println("Ahora hacia donde te quieres mover\n"+
                        "1 lugar1\n"+
                        "2 lugar2\n"+
                        "3 lugar3\n"+
                        "4 Casa");
                int opcion2 = sc.nextInt();
                //una vez lo pregunto envio a una funcion el lugar actual para que compruebe si se puede viajar
                if (opcion2 == 1) {
                    respuesta = lugar1Mapa(lugarActual);
                    if (respuesta==1) {
                        System.out.println("Se puede viajar a lugar1 desde tu posicion");
                        lugarActual = mapa[5][4];
                    }else if (respuesta==2) {
                        System.out.println("ya estas en lugar1");
                    }
                } else if (opcion2 == 2) {
                    respuesta = lugar2Mapa( lugarActual);
                    if (respuesta==1) {
                        System.out.println("Ya estas en lugar2");

                    } else if (respuesta==2) {
                        System.out.println("Se puede viajar a lugar2 desde tu posicion");
                        lugarActual = mapa[9][7];
                    } else if (respuesta==3) {
                        System.out.println("Se puede viajar a lugar2 desde tu posicion pero hay que pasar por lugar 1");
                        lugarActual = mapa[9][7];
                    }
                } else if (opcion2 == 3) {
                    System.out.println("No se puede viajar a esa ubicacion");
                } else if (opcion2 == 4) {
                    respuesta = casaMapa(lugarActual);
                    if (respuesta==1) {
                        System.out.println("Ya estas en casa");

                    } else if (respuesta==2) {
                        System.out.println("Se puede viajar a casa desde tu posicion");
                        lugarActual = mapa[5][0];
                    } else if (respuesta==3) {
                        System.out.println("Se puede viajar a casa desde tu posicion pero hay que pasar por lugar1");
                        lugarActual = mapa[5][0];
                    }
                }
                //muestro mapa
            } else if (opcion == 2) {
                mostrarMapa(mapa);
                //finalizo el programa
            }else if (opcion == 3) {
                break;
            }
        }
        System.out.println("El juego ha acabado");
    }

    //imprimo todas las filas con i y le voy sumando uno a esta para que muestre liene por lienea como los juegos antiguos
    private static void mostrarMapa(String[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            System.out.println(Arrays.toString(mapa[i]));
        }
    }

    //dibujo los caminos por el mapa entre los lugares del mapa
    private static String[][] dibujarMapa(String[][] mapa) {

        for (int i = 1; i < 4; i++) {
            mapa[5][i]="----- ";
        }
        for (int i = 6; i < 9; i++) {
            mapa[i][4]="----- ";
        }
        for (int i = 4; i < 7; i++) {
            mapa[9][i]="----- ";
        }
        return mapa;
    }

    //Caso de eleccion de ir a casa dependiendo de tu posicion actual
    private static int casaMapa(String lugarActual) {
        if (lugarActual.equals(" CASA ")) {
            return 1;
        }else if (lugarActual.equals("Lugar1")) {
            return  2;
        }else if (lugarActual.equals("Lugar2")) {
            return  3;
        }
        return 0;
    }
    //Caso de eleccion de ir a lugar1 dependiendo de tu posicion actual
    private static int lugar1Mapa(String lugarActual) {
        if (lugarActual.equals(" CASA ")||lugarActual.equals("Lugar2")) {
            return 1;
        }else if (lugarActual.equals("Lugar1")) {
            return  2;
        }
        return 1;
    }

    //Caso de eleccion de ir a lugar 2 dependiendo de tu posicion actual
    private static int lugar2Mapa(String lugarActual) {
        if (lugarActual.equals("Lugar2")) {
            return 1;
        }else if (lugarActual.equals("Lugar1")) {
            return  2;
        }else if (lugarActual.equals(" CASA ")) {
            return  3;
        }
        return 2;
    }


}

