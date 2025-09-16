package Colecciones.ejer1NoEvaluables.ejer1;

import java.util.*;


public class principal {
    public static void main(String[] args) {
        int random =(int) (Math.random()*11)+10;
        System.out.println(random);

        List<Integer> listaNumeros = new ArrayList<Integer>();
        int contador = 0;
        while(contador<random){
            int random2 = (int) (Math.random()*100)+1;
            listaNumeros.add(random2);
            contador++;
        }
        System.out.println(listaNumeros);

        int media=0;
        int suma=0;
        int maximo=0;
        int minimo=0;
        Iterator<Integer> it = listaNumeros.iterator();
        while(it.hasNext()){
            int num = it.next();
            if (num>maximo){
                maximo = num;
            }
            if (num<minimo){
                minimo = num;
            }
            suma += num;
        }
        media = suma/random;

        System.out.println("la media sera "+media);
        System.out.println("la suma de todos los numeros es " + suma);
        System.out.println("la maximo de numeros es " + maximo);
        System.out.println("la minimo de numeros es " + minimo);
    }
}
