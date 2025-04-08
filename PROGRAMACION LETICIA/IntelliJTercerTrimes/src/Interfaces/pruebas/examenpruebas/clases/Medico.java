package Interfaces.pruebas.examenpruebas.clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Medico extends Personal {

	/**
	 * Los médicos tienen un número de pacientes que pueden ver en el día (capacidad
	 * máxima), un salario base y una lista de pacientes. Los pacientes tienen
	 * asociados un nombre,apellidos, dni.
	 * 
	 */

	private final int CAP_PACIENTES = 20;
	private double salario;
	private Set<Paciente> listaPacientes = new HashSet<Paciente>();

	/**
	 * @param identificador
	 */
	public Medico(String identificador) {
		super(identificador);
	}

	/**
	 * Para el caso de los médicos el sueldo extra será: si la lista de pacientes
	 * tiene más de la mitad de la capacidad máxima, se calculará (salarioBase
	 * +20%salarioBase)/número de pacientes Si la lista de pacientes es menor que la
	 * mitad el dinero extra se calculará :(salarioBase -10%salarioBase)/capacidad
	 * máxima
	 * 
	 */
	@Override
	public double calcularSueldoExtraPorDia() {
		double extra=0;
		if(listaPacientes.size()>=CAP_PACIENTES/2) {
			extra=(salario+0.2*salario)/listaPacientes.size();
		}else {
			extra=(salario-0.1*salario)/CAP_PACIENTES;
		}
		return extra;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Set<Paciente> getListaPacientes() {
		return listaPacientes;
	}

	public void setListaPacientes(Set<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}

	@Override
	public int compareTo(Personal o) {
		// TODO Auto-generated method stub
		return this.getIdentificador().compareTo(o.getIdentificador());
	}

	@Override
	public String toString() {
		return "Medico [CAP_PACIENTES=" + CAP_PACIENTES + ", salario=" + salario + ", listaPacientes=" + listaPacientes
				+ "]";
	}

}
