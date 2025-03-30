package Interfaces.pruebas.examenpruebas.clases;

import java.util.HashSet;
import java.util.Set;

public class Enfermero extends Personal {

	/***
	 * Los enfermeros tienen un número de curas que pueden hacer en el día
	 * (capacidad máxima) y una colección de visitas a domicilio para hacer las
	 * curas. Las visitas tienen asociadas un nombre, apellido, dirección y
	 * teléfono.También tienen un código de visita único en el listado.
	 */
	private final int CURAS_MAX = 5;
	Set<Visita> listaVisitas = new HashSet<Visita>();

	/**
	 * @param identificador
	 */
	public Enfermero(String identificador) {
		super(identificador);
	}

	/**
	 * Para el caso de los enfermeros el sueldo extra será si la lista está completa
	 * 50*capacidad máxima, si la lista no está completa no obtendrá el sueldo
	 * extra.
	 * 
	 */
	@Override
	public double calcularSueldoExtraPorDia() {
		double extra=0;
		if(listaVisitas.size()==CURAS_MAX) {
			extra=50*CURAS_MAX;
		}
		return extra;
	}

	public Set<Visita> getListaVisitas() {
		return listaVisitas;
	}

	public void setListaVisitas(Set<Visita> listaVisitas) {
		this.listaVisitas = listaVisitas;
	}
	@Override
	public int compareTo(Personal o) {
		// TODO Auto-generated method stub
		return this.getIdentificador().compareTo(o.getIdentificador());
	}

	@Override
	public String toString() {
		return "Enfermero [CURAS_MAX=" + CURAS_MAX + ", listaVisitas=" + listaVisitas + "]";
	}
}
