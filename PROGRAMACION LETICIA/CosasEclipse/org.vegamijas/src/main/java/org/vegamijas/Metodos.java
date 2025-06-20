package org.vegamijas;

import java.util.Arrays;

public class Metodos {
	public static int[] findDigit(int number, int digit) { 
		
		int[] respuesta = new int[0];
		
		if ( number < 0) {
			number *= (-1);
		}
		String nums = Integer.toString(number);
		String dig = Integer.toString(digit);
		
		
		int contAux=0;
		for (int i = 0; i < nums.length(); i++) {
			if(nums.charAt(i) == dig.charAt(0)) {
				respuesta = Arrays.copyOf(respuesta, respuesta.length+1);
				respuesta[contAux] = i;
				contAux++;
			}
		}
		
		
		return respuesta;
	}
	
	public static int sumEvenPositions(int[] array) { 
		int respuesta=0;
		for (int i = 0; i < array.length; i++) {
			if(i%2==0) {
				respuesta += array[i];
			}
		}
		
		return respuesta;
	}

	
	public static String[] splitByLetter(String str, char letter) { 
		String[] respuesta = new String[1];
	
		int contAux = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==letter){
				contAux++;
				respuesta = Arrays.copyOf(respuesta, contAux+1);
				
			}else {
				String aux = respuesta[contAux];
				if (aux == null) {
					aux = "" + str.charAt(i);
				}else {
					aux += str.charAt(i);
				}
				respuesta[contAux] = aux;
			}
		}
		
		
		return respuesta;
	}
	
	public static int[] scalarProduct(String str1, String str2) { 
		int[] respuesta = new int[0];
		
		int sizeStr = 0;
		if (str1.length() < str2.length()) {
			sizeStr = str2.length();
		} else {
			sizeStr = str1.length();
		}
		int sizeStr1 = str1.length();
		int sizeStr2 = str2.length();
		
		int contAux = 0;
		for (int i = 0; i < sizeStr ; i++) {
			
			char chAux1;
			char chAux2;
			if (i>= sizeStr1) {
				String aux1 = " ";
				chAux1 = aux1.charAt(0);
			}else {
				chAux1 = str1.charAt(i);
			}
			
			if (i>= sizeStr2) {
				String aux2 = " ";
				chAux2 = aux2.charAt(0);
			}else {
				chAux2 = str2.charAt(i);
			}
			
			
			respuesta = Arrays.copyOf(respuesta, respuesta.length+1);
			respuesta[contAux] = chAux1 * chAux2;
			contAux++;
			
		}
		
		
		return respuesta;
	}
	

	
	
	public static void main(String[] args) { 
		
		//p1
		System.out.println("aqui esta la primera prueba");
		int nump1 = 32233123;
		int digp1 = 3;
		int[] p1 = findDigit(nump1, digp1);
		System.out.println(Arrays.toString(p1));
		
		
		//p2
		System.out.println("aqui esta la segunda prueba");
		int[] arrayp2 = {1,2,3,5,3,7,9,102,56};
		int p2 = sumEvenPositions(arrayp2);
		System.out.println(p2);
		
		
		//p3
		System.out.println("aqui esta la tercera prueba");
		String strp3 = "ANA,FRANK,PEDRO,LUIS";
		String chp3str = ",";
		char chp3 = chp3str.charAt(0);
		String[] p3 = splitByLetter(strp3, chp3);
		System.out.println(Arrays.toString(p3));
		
		//p4
		System.out.println("aqui esta la cuarta prueba");
		String str1p4 = "abcd";
		String str2p4 = "zyxw";
		int[] p4 = scalarProduct(str1p4, str2p4);
		System.out.println(Arrays.toString(p4));
	}
}
