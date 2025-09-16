package Interfaces.pruebas.examenpruebas.interfaces;

import java.util.Comparator;

import Interfaces.pruebas.examenpruebas.clases.Medico;

public class ComparadorSalarioMedico implements Comparator<Medico>{

	@Override
	public int compare(Medico o1, Medico o2) {
		// TODO Auto-generated method stub
		return (int) ((o1.getSalario()-o2.getSalario())*-1);
	}

}
