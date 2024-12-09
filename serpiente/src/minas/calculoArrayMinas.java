package minas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class calculoArrayMinas {

    public static void main(String[] args) {
        //invocamos una funcion que nos cula posiciones random de las minas
        int [][] posiRandom;
        posiRandom = arrayNumRamdomsMinas();


        //genero el array con la anchura altura de cada posicon y la cantidad de valores que va a tener cada una de estas
        String[][][] arrayMinas = new String[15][15][11];

        //generar el array con las varaibles que necesito
        for (int i = 0; i <arrayMinas.length; i++){
            for (int j = 0; j < arrayMinas[0].length; j++){
                for (int h = 0;h< arrayMinas[0][0].length; h++){
                    if (h==0) {
                        arrayMinas[i][j][h] = "bom";
                    } else if(h==1){
                        arrayMinas[i][j][h] = "-";
                    } else if(h==2){
                        arrayMinas[i][j][h] = "1";
                    } else if (h==3) {
                        arrayMinas[i][j][h] = "2";
                    } else if (h==4){
                        arrayMinas[i][j][h] = "3";
                    } else if(h==5){
                        arrayMinas[i][j][h] = "4";
                    } else if (h==6) {
                        arrayMinas[i][j][h] = "5";
                    } else if (h==7) {
                        arrayMinas[i][j][h] = "6";
                    } else if (h==8) {
                        arrayMinas[i][j][h] = "7";
                    } else if (h==9) {
                        arrayMinas[i][j][h] = "8";
                    } else if (h==10){
                        arrayMinas[i][j][h] = " ";
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(arrayMinas));
        //hacemos un booleano complejo para las posiciones de las minas


      /*  //creamos una nueva variable que va a tener 3 posibilidades distintas
        int [15][15][3]*/

    }

    public static int[] arrayMinas(int[] arrayMina, int [][] arrayNumRandomsMina ){
        return arrayMina;
    }



    public static int[][] arrayNumRamdomsMinas(){
        int arrayMinasR[][] = new int[2][6];
        for(int i=0; i< arrayMinasR.length;i++){
            for (int j = 0; j < arrayMinasR[0].length; j++) {
                arrayMinasR[i][j] = (int) Math.floor((Math.random()*15)+1);
            }
        }
        //Mostrar los numeros randoms
        System.out.println(Arrays.deepToString(arrayMinasR));


        return arrayMinasR;
    }
}
