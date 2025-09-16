package Prueba1;

import java.io.*;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = null;
		BufferedWriter bw2 = null;
		BufferedWriter bw3 = null;
		BufferedReader br = null;
		try {
			Scanner sc = new Scanner(System.in);
			bw= new BufferedWriter(new FileWriter("pr1.txt", true));
			bw2 = new BufferedWriter(new FileWriter("pr2.txt", true));
			bw3 = new BufferedWriter(new FileWriter("pr3.txt", true));
			br = new BufferedReader(new FileReader("pr3.txt"));
			while(true) {
				System.out.println("Escriba un numero para la primera lista");
				int num = sc.nextInt();
				if (num!=-1) {
					bw.write(num+" ");
				}else {
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			bw.close();
			bw2.close();
			bw3.close();
			br.close();
		}
	}
   
}
