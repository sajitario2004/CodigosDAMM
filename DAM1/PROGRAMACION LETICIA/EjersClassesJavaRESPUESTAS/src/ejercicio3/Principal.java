package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona("Juan", 10);
		Persona p1 = new Persona("Ana", 20);
		Coche c = new Coche();
		if (p.esMayorEdad()) {
			c.setMarca("Opel");
			c.setModelo("Corsa");
			c.setPropietario(p);
		} else {
			System.out.println("No se puede asignar un coche por ser menor de edad");
		}
		System.out.println(c);
		Coche c1 = new Coche();
		if (p1.esMayorEdad()) {
			c1.setMarca("Renault");
			c1.setModelo("Kaptur");
			c1.setPropietario(p1);
		}else {
			System.out.println("No se puede asignar un coche por ser menor de edad");
		}
		System.out.println(c1);

	}

}
