package hola;

import java.security.DomainCombiner;
import java.util.Arrays;
import java.util.Scanner;

public class UtilText {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige una opcion");
		System.out.println("opcion 1 ejer 1");
		System.out.println("opcion 2 ejer 2");
		System.out.println("opcion 3 ejer 3");
		System.out.println("opcion 4 ejer 4");
		int condicion = sc.nextInt();
		if (condicion == 1) {
			
		} else if (condicion == 2) {
			
		} else if (condicion == 3) {
			System.out.println("Que frase quieres contar donde estan su espacios");
			String pregunta = sc.nextLine();
			
			Thread.sleep(500);
			
			int[] fSpaces = findSpaces(pregunta);
			System.out.println("aqui tiene es array con tu respuesta " + Arrays.toString(fSpaces));
		} else if (condicion == 4) {
			
		} else {
			System.out.println("Sexo");
		}
			
		
	}
	
	//public static int 
	
	
	public static int[] findSpaces(String str) {
		int[] respuesta = new int[1];
		int cont = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if(ch1 == 32 ) {
				respuesta[cont] = i;
				cont++;
				respuesta = agrandar(respuesta);
			}
			
		}
		respuesta = Arrays.copyOf(respuesta, respuesta.length-1);
		
		return respuesta;
	}
	
	
	
	public static int[] agrandar(int[] numeros) {
		int[] respuesta = Arrays.copyOf(numeros, numeros.length +1);
		
		return respuesta;
		
	}
	
}
