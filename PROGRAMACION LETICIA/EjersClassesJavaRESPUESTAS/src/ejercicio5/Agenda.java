package ejercicio5;

import java.util.Arrays;

public class Agenda {

	private Contacto[] listadoContacto = new Contacto[10];
	private int contador = 0;

	public Agenda() {
		super();
	}

	public Agenda(Contacto[] listadoContacto) {
		super();
		this.listadoContacto = listadoContacto;
	}

	public Contacto[] getListadoContacto() {
		return listadoContacto;
	}

	public void setListadoContacto(Contacto[] listadoContacto) {
		this.listadoContacto = listadoContacto;
	}

	@Override
	public String toString() {
		return "Agenda [listadoContacto=" + Arrays.toString(listadoContacto) + "]";
	}

	/**
	 * Añadir un contacto. Buscar un contacto por nombre. Mostrar todos los
	 * contactos.
	 * 
	 */
	public void anadirContacto(Contacto c) {
		if (contador < listadoContacto.length) {
			listadoContacto[contador] = c;
			contador++;

		} else {
			System.out.println("Agenda completa, no se pueden añadir más contactos");
		}

	}

	public void buscarContacto(String nombre) {
		int cont = 0;
		boolean encontrado = false;
		while (!encontrado && cont < listadoContacto.length) {
			if (listadoContacto[cont]!=null && listadoContacto[cont].getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
			}
			cont++;
		}
		if (encontrado) {
			System.out.println("Contacto encontrado " + nombre);
		} else {
			System.out.println("Contacto no encontrado " + nombre);
		}
	}

}
