package Colecciones.pruebas.ejerprueba1.v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<Persona>();
		Persona p = new Persona(23, 2000, "90982343F", "Luis", false, false);
		Persona p1 = new Persona(24, 1300, "60982343F", "ana", false, false);
		Persona p2 = new Persona(25, 1500, "80982343F", "Juan", false, false);
		System.out.println("Persona añadida:" + listaPersonas.add(p));
		System.out.println("Persona añadida:" + listaPersonas.add(p1));
		System.out.println("Persona añadida:" + listaPersonas.add(p2));
		System.out.println(listaPersonas.toString());
		// Uso iterator
		Iterator<Persona> it = listaPersonas.iterator();
		boolean encontrado = false;
		
		while (it.hasNext() && !encontrado) {
			Persona pit = it.next(); // listaPersonas[i]
			if (pit.getSaldo() == 1300) {
				pit.setSaldo(2000);
				encontrado = true;
				it.remove();

			}
			
		}
		
	}

}
