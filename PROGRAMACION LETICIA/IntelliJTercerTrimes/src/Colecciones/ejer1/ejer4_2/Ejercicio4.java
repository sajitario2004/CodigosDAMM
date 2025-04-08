package Colecciones.ejer1.ejer4_2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		/**
		 * Implementa el control de acceso al área restringida de un programa. Se debe
		 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
		 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
		 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
		 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los
		 * nombres de usuario con sus correspondientes contraseñas deben estar
		 * almacenados en una estructura de la clase HashMap.
		 */
		HashMap<String, String> mapa = new HashMap<String, String>();
		mapa.put("Juan", "1234");
		mapa.put("Ana", "abc43");
		mapa.put("Lucia", "contraseña");
		mapa.put("Claudia", "abcd");
		mapa.put("Antonio", "1b3d");
		int cont = 0;
		boolean acertada = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.next();
		// Compruebo que el nombre existe en el mapa
		if (mapa.containsKey(nombre)) {
			while (cont < 3 && !acertada) {
				System.out.println("Dame la contraseña");
				String contrasenia = sc.next();
				if (mapa.get(nombre).equals(contrasenia)) {
					acertada = true;
					System.out.println("Tiene acceso");
				}else {
					System.out.println("Prueba otra vez");
				}
				cont++;
			}
			if (!acertada) {
				System.out.println("Lo siento, no tiene acceso al área restringida");
			}
		} else {
			System.out.println("El usuario no existe en el mapa");
		}

	}
}
