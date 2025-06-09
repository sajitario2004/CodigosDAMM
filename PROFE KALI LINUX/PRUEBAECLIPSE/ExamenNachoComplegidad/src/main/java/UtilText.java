import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class UtilText {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Necesito que escriba el string para su calculo de permutacion de datos: ");
		//findPermutationsOfONE(sc.next());
		
		System.out.println("Digame una frase para contar donde estan los espacios");
		int[] fSpaces = findSpaces(sc.nextLine());
		System.out.println("aqui tienes las posiciones donde estan los espacios");
		System.out.println(Arrays.toString(fSpaces));
		
		
		System.out.println("\n");
		int[] p1 = {1,2,3,4,5,6};
		int[] p2 = {5,5,6,7,8,9};
		int[] fComons = findCommons(p1, p2);
		System.out.println(fComons.toString());
		
	}
	
	//no funciona
	public static int findPermutationsOfONE(String str) {
		String almacenador1 = "";
		String almacenador2 = "";
		boolean comprob;
		boolean salir = true;
		int contChar1 = 0;
		int contChar2 = 1;
		while(salir) {
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j <= contChar1; j++) {
					char ch1 = str.charAt(contChar1);
					almacenador1 += ch1;
				}
				
				for (int j = 0; j <= contChar1; j++) {
					char ch1;
					if (contChar1 == 0) {
						ch1 = str.charAt(contChar2);
					}else {
						if (str.length() <= (j+contChar1)) {
							ch1 = str.charAt(j+contChar1);
						}else {
							break;
						}
					}
					almacenador2 += ch1;
					
				}
				
				contChar1++;
				
				
			}
			
			contChar2 = contChar1*2;
			
			
		}
		
		
		
		return 0;
	}
	
	
	public static int[] findSpaces(String str) {
		
		ArrayList<Integer> rp = new ArrayList();
		
		int[] respuesta = new int[1];
		int cont = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch1 == 32 ) {
				respuesta[cont] = i;
				cont++;
				
			}
			
		}
		return respuesta;
	}
	
	public static int[] redimensionarArray (int[] ar) {
		int[] resultado;
		resultado = Arrays.copyOf(ar, ar.length+1);
		
		return resultado;
	}	
	
	
	public static int[] findCommons(int[] arr1, int[] arr2) {
		int[] resultado = new int[1];
		int cont = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					for (int h = 0; h < resultado.length; h++) {
						if (resultado[h] != arr2[j]) {
						resultado[cont] = arr1[i];
						cont++;
						resultado = redimensionarArray(resultado);
						}
					}
				}
			}
		}
		return resultado;
	}
	

	
	

}

