package ies.vdm;		

public class EjercicioE {
	public static String Main(int num){
		String respuesta = "";
		int cont11=1;
		int cont12=1;
		int cont21=1;
		int cont3=0;
		if(num < 3) {
			respuesta = "La piramide tiene que ser mayor que 3";
		} else {
			for (int i = 0; i < num; i++) {
				
				for (int j = num; j > cont11; j--) {
					respuesta += " ";
				}
				for (int j = 0; j < cont12; j++) {
					respuesta += "*";
				}
				
				cont11++;
				cont12++;
				
				
				
				if (cont3%2==0) {
					respuesta+="****";
				}else {
					respuesta+="    ";
				}
				cont3++;
				
				if (cont21<=num) {
					for (int j = 0;  j<cont21; j++) {
					respuesta += "*";
					}
					cont21++;
				}
				respuesta+="\n";
			}
		}
		
		
		return respuesta;
		
	}
	
	public static void main(String[] args) {
		String respuesta = Main(35);
		
		System.out.println(respuesta);
	}
}
