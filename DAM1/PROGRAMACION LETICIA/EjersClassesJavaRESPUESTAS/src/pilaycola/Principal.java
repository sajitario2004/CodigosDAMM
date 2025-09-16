package pilaycola;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Implementación de una pila 3 posiciones
		int[] pila = new int[0];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos elementos quieres en la pila");
		int tam=sc.nextInt();
		for(int i=0;i<tam;i++) {
			System.out.println("Introduce un elemento en la pila");
			int e1 = sc.nextInt();			
			int[] copiaPila = new int[pila.length + 1];
			// La forma correcta de hacerlo es con un bucle, se añade al final de la copia,
			//para crear hueco en la primera posición
			int j = copiaPila.length - 1;
			for (int i1 = pila.length-1; i1 >=0; i1--) {
				copiaPila[j] = pila[i1];
				j--;
			}
			//Se inserta en la primera posición el nuevo elemento
			copiaPila[0] = e1;
			pila = copiaPila;
			System.out.println(Arrays.toString(pila));
		}
		
//		System.out.println("Introduce un elemento en la pila");
//		int e1 = sc.nextInt();
//		pila[0] = e1;
//		System.out.println(Arrays.toString(pila));
//		System.out.println("Introduce el segundo elemento en la pila");
//		int e2 = sc.nextInt();
//		int[] copiaPila = new int[pila.length + 1];
//		
//		// La forma correcta de hacerlo es con un bucle, se añade al final de la copia,
//		//para crear hueco en la primera posición
//		int j = copiaPila.length - 1;
//		for (int i = 0; i < pila.length; i++) {
//			copiaPila[j] = pila[i];
//			j--;
//		}
//		//Se inserta en la primera posición el nuevo elemento
//		copiaPila[0] = e2;
//		pila = copiaPila;
//		System.out.println(Arrays.toString(pila));
	}

}
