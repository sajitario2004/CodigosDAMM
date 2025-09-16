package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Rectangulo r = new Rectangulo();
		r.setAltura(10);
		r.setBase(20);
		r.mostrarResultados();
		Rectangulo r1 = new Rectangulo(30, 50);
		r1.mostrarResultados();
	}

}
