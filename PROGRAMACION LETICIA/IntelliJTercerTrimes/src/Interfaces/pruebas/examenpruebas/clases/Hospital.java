package Interfaces.pruebas.examenpruebas.clases;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Interfaces.pruebas.examenpruebas.interfaces.GestionHospital;

public class Hospital implements GestionHospital ,Comparable<Hospital> {
	/**
	 * identificador, nombreHospital y una colección de Personal.
	 * 
	 */
	private String id;
	private String nombreHospital;
	private Set<Personal> listaPersonal = new HashSet<Personal>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombreHospital() {
		return nombreHospital;
	}

	public void setNombreHospital(String nombreHospital) {
		this.nombreHospital = nombreHospital;
	}

	public Set<Personal> getListaPersonal() {
		return listaPersonal;
	}

	public void setListaPersonal(Set<Personal> listaPersonal) {
		this.listaPersonal = listaPersonal;
	}

	/**
	 * @param id
	 * @param nombreHospital
	 * @param listaPersonal
	 */
	public Hospital(String id, String nombreHospital, Set<Personal> listaPersonal) {
		super();
		this.id = id;
		this.nombreHospital = nombreHospital;
		this.listaPersonal = listaPersonal;
	}

	/**
	 * boolean contratarPersonal(String id): Devolverá true si se ha podido
	 * contratar y falso en caso contrario. En un hospital no puede haber dos
	 * personas con el mismo identificador. boolean despedirPersonal(String id):
	 * Devolverá true si se ha podido eliminar el personal cuyo id es el pasado como
	 * parámetro y false en caso contrario. boolean anadirPaciente(String
	 * idPersonal, Paciente p): Añadirá un paciente a la lista. No puede haber en la
	 * lista pacientes repetidos. boolean modificarDireccionCuras(String idCura,
	 * String nuevaDireccion): Modifica la dirección de la cura en caso de que
	 * exista.
	 * 
	 */
	@Override
	public boolean contratarPersonal(String id, String tipoPersonal) {
		// TODO Auto-generated method stub
		if (tipoPersonal.equals("medico")) {
			return listaPersonal.add(new Medico(id));
		} else {
			return listaPersonal.add(new Enfermero(id));
		}
	}

	@Override
	public boolean despedirPersonal(String id) {
		// TODO Auto-generated method stub
		boolean found=false;
		Iterator<Personal> iter=listaPersonal.iterator();
		while(iter.hasNext() && !found) {
			Personal p=iter.next();
			if(p.getIdentificador().equals(id)) {
				iter.remove();
				found=true;
			}
		}
		return found;
	}

	@Override
	public boolean anadirPaciente(String idPersonal, Paciente p) {
		// TODO Auto-generated method stub
		boolean found=false;
		Iterator<Personal> iter=listaPersonal.iterator();
		while(iter.hasNext() && !found) {
			Personal per=iter.next();
			if(per.getIdentificador().equals(idPersonal)) {
				if(per instanceof Medico) {
				found=	((Medico) per).getListaPacientes().add(p);
				}
			
			}
		}
		return found;
	}

	@Override
	public boolean modificarDireccionCuras(String idPersonal,String idCura, String nuevaDireccion) {
		// TODO Auto-generated method stub
				boolean found=false;
				Iterator<Personal> iter=listaPersonal.iterator();
				while(iter.hasNext() && !found) {
					Personal per=iter.next();
					if(per.getIdentificador().equals(idPersonal)) {
						if(per instanceof Enfermero) {
						Set<Visita> listV=	((Enfermero) per).getListaVisitas();
						Iterator<Visita> iterator = listV.iterator();
						while(iterator.hasNext()) {
							Visita v=iterator.next();
							if(v.getIdVisita().equals(idCura)) {
								v.setDireccion(nuevaDireccion);
								found=true;
							}
						}
						}
					
					}
				}
				return found;
	}

	@Override
	public int compareTo(Hospital arg0) {
		// TODO Auto-generated method stub
		return this.nombreHospital.compareTo(arg0.getNombreHospital());
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", nombreHospital=" + nombreHospital + ", listaPersonal=" + listaPersonal + "]";
	}

}
