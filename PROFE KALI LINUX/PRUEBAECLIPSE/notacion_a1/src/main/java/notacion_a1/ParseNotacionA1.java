package notacion_a1;

import java.util.Iterator;
import java.util.Scanner;

public class ParseNotacionA1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime una posicion de celda en ecksel");
		
		String prueba = sc.next();
		int[] resultado = parseResponsive(prueba);
		
		System.out.println(resultado[0] + " " + resultado[1]);
	}
	
	public static int[] parseResponsive(String info) {
		int part1=0;
		int part2=0;

		// PARTE DE LETRAS
		
		String pr1 = "";
		for (int i = 0; i < info.length(); i++) {
			char ch1 = info.charAt(i);
			if (ch1 >= 97 && ch1 <= 122) {
				ch1 -= 32;
			}
			if(ch1 >= 65 && ch1 <= 90) {
				pr1 += ch1;
			};
		}
		
		String aux1 = "";
		for (int i = pr1.length(); i > 0; i--) {;
			aux1 += pr1.charAt(i-1);
		}
		
		pr1 = aux1;
		
		int cont = 0 ;
		for (int i = 0; i < pr1.length(); i++) {
			int numAux1=pr1.charAt(i);
			numAux1 -= 64;
			if (cont == 0) {
				part1 += numAux1;
			}else {
				part1 += numAux1 * Math.pow(26,cont);
			}
			cont++;
			
			
		}
//		System.out.println(pr1);
//		System.out.println(part1+"\n");
		
		String pr2 = "";
		for (int i = 0; i < info.length(); i++) {
			char ch2 = info.charAt(i);
			int chIntAux= ch2;
			if (chIntAux >= 48 && chIntAux <=57) {
				pr2 += ch2;
			}
			
		}
//		System.out.println(pr2);
		
		part2 = Integer.parseInt(pr2);
		
		int[] result = {part1, part2};

		
		return result;
	}
}
