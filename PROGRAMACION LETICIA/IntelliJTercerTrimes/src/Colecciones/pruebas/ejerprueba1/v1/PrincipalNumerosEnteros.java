package Colecciones.pruebas.ejerprueba1.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalNumerosEnteros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número enteros mayores o igual a 0");
		int num = sc.nextInt();
		List<Integer> listaNumeros = new ArrayList<Integer>();
		while (num >= 0) {
			listaNumeros.add(num);
			System.out.println("Introduce número enteros mayores o igual a 0");
			num = sc.nextInt();

		}
		System.out.println("Lista de números:" + listaNumeros.toString());

	}

}
