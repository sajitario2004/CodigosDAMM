package ejercicio5;

public class Principal {

	public static void main(String[] args) {
		Contacto c = new Contacto("Pepe", 789990);
		Contacto c1 = new Contacto("Maria", 232323230);
		Contacto c2 = new Contacto("Juan", 65122220);
		Agenda ag = new Agenda();
		ag.anadirContacto(c);
		ag.anadirContacto(c1);
		ag.anadirContacto(c2);
		System.out.println(ag);
		ag.buscarContacto("Pepe");
		ag.buscarContacto("Ana");

	}

}
