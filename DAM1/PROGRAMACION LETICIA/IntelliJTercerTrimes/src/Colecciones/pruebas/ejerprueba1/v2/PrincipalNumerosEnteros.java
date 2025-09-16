package Colecciones.pruebas.ejerprueba1.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PrincipalNumerosEnteros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número enteros mayores o igual a 0");
		int num = sc.nextInt();
		List<Integer> listaNumeros = new ArrayList<Integer>();


		boolean salir = false;
		while (num >= 0 && !salir) {
			listaNumeros.add(num);
			System.out.println("Introduce número enteros mayores o igual a 0. Si pones -1 sales");
			num = sc.nextInt();

		}

		List<Integer> listaMultiplo5 = listaMulti5(listaNumeros) ;

		List<Integer> listaSin5Y2 = listaNO5Y2(listaNumeros) ;


		System.out.println("Lista de todos números:" + listaNumeros.toString());
		System.out.println("Lista de números multiplos de 5:" + listaMultiplo5.toString());
		System.out.println("Lista de números que no son multiplos de 5 y 2:" + listaSin5Y2.toString());
	}

	private static List<Integer> listaMulti5 (List<Integer> listaNum){
		List<Integer> listaResultado = new ArrayList<Integer>();
		Iterator<Integer> it = listaNum.iterator();
		while(it.hasNext()){
			int num = it.next();
			if(num%5 == 0){
				listaResultado.add(num);
			}
		}
		return listaResultado;
	}

	private static List<Integer> listaNO5Y2 (List<Integer> listaNum){
		List<Integer> listaResultado = new ArrayList<Integer>();
		Iterator<Integer> it = listaNum.iterator();
		while(it.hasNext()){
			int num = it.next();
			if(num%5 == 0 && num%2 == 0){
				listaResultado.add(num);
			}
		}
		return listaResultado;
	}

}
