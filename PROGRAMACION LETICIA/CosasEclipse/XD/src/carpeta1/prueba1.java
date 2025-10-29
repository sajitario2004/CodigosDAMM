package carpeta1;

import java.util.Scanner;

public class prueba1 {
	public static void main(String[] args) {
		String hola = "fock";
		String adios = " psoe";
		
		String respuesta = prueba(hola, adios);
		String respuesta2 = prueba("felicidades ", " Juan Antonio");
		
		System.out.println(respuesta);
		System.out.println(respuesta2);
		
	}
	
	
	public static String prueba(String a, String b) {
		String respuesta =  a + b;
		// respuesta = respuesta + "hola";
		respuesta += " hola ";
		respuesta += " adios ";
		
		return respuesta;
	}
}
