package puto;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class camelCaseConverter {
	//convertir una frase a camel case
	// frase antes: tejero maricon
	// frase despues: tejeroMaricon
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca una frase");
		String respuesta = camelCase1(sc.nextLine());
		System.out.println("La frase es: " + respuesta);
	}
	
	
	public static String camelCase1(String frase) {
		String respuesta = "";
		int contAux = 0;
		for (int i = 0; i < frase.length(); i++) {
			char ch1 = frase.charAt(i);
			if(ch1==32) {
				contAux =1;
			}
			if (contAux ==1 && ch1!=32) {
				if(ch1>= 65 && ch1<=90) {
					respuesta += ch1;
				}else {
					respuesta+=(char)(ch1-32);
				}
				contAux=0;
			}else if(ch1 != 32){
				respuesta+=ch1;
			}
		}
		return respuesta;
	}
	
}
