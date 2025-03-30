package Interfaces.pruebas.examenpruebas.interfaces;

import Interfaces.pruebas.examenpruebas.clases.Paciente;

public interface GestionHospital {
/**
 * boolean contratarPersonal(String id): Devolverá true si se ha podido contratar y falso en caso contrario. En un hospital no puede haber dos personas con el mismo identificador.
boolean despedirPersonal(String id): Devolverá true si se ha podido eliminar el personal cuyo id es el pasado como parámetro y false en caso contrario.
boolean anadirPaciente(String idPersonal, Paciente p): Añadirá un paciente a la lista. No puede haber en la lista pacientes repetidos.
boolean modificarDireccionCuras(String idCura, String nuevaDireccion): Modifica la dirección de la cura en caso de que exista.

 */
	boolean contratarPersonal(String id,String tipoPersonal);
	boolean despedirPersonal(String id);
	boolean anadirPaciente(String idPersonal, Paciente p);
	boolean modificarDireccionCuras(String idPersonal,String idCura, String nuevaDireccion);
	
}
