package ejercicios.actividad1;




public class Principal {

	public static void main(String[] args) {
		Cifrado c = new Cifrado("abcdef ... vwxyz", 3);
		Cifrado c1 = new Cifrado("Hola mundo", 5);
		System.out.println(c.cesar());
		System.out.println(c1.cesar());
	}
}
