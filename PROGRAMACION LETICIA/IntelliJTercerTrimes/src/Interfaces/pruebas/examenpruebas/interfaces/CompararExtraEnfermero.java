package Interfaces.pruebas.examenpruebas.interfaces;

import java.util.Comparator;

import Interfaces.pruebas.examenpruebas.clases.Enfermero;

public class CompararExtraEnfermero implements Comparator<Enfermero>{

	@Override
	public int compare(Enfermero o1, Enfermero o2) {
		// TODO Auto-generated method stub
		return (int) (o1.calcularSueldoExtraPorDia()-o2.calcularSueldoExtraPorDia());
	}

}
