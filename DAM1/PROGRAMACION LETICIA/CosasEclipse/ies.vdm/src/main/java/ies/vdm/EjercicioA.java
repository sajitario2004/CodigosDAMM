package ies.vdm;

import java.util.Scanner;

public class EjercicioA {
	public static String main(double nota1, double nota2, String apto) {
		String respuesta;
		
		double media = (nota1 + nota2) / 2;

		if (media >= 5) {
			respuesta = ("Estas aprobado con una media de: " + media);
		} else {

        	if (apto.equals("apto")) {
            respuesta = "Estas aprobado con un 5.";
        	} else if(apto.equals("no apto")){
            respuesta = "Estas suspendido con una media de: " + media;
        	} else {
        	respuesta = "No ha introducido nada por lo tanto no es apto";
        	}
		}
		return respuesta;
	}
}
