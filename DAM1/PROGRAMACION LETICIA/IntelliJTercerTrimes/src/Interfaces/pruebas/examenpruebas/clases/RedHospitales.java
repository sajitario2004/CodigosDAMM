package Interfaces.pruebas.examenpruebas.clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RedHospitales {
	Map<String, Hospital> mapaRed = new HashMap<String, Hospital>();
	/**
	 * boolean cambiarPersonal(String idPersonal,String antiguoHospital,String
	 * nuevoHospital): Cambiará al personal identificado por idPersonal de un
	 * hospital a otro. 
	 * 
	 */
	public boolean cambiarPersonal(String idPersonal,String antiguoHospital,String nuevoHospital,String tipoPersonal) {
		boolean containsKey = mapaRed.containsKey(antiguoHospital);
		boolean cambio=false;
		if(containsKey) {
			boolean despedirPersonal = mapaRed.get(antiguoHospital).despedirPersonal(idPersonal);
			if(despedirPersonal) {
			if(mapaRed.get(nuevoHospital)	!=null) {
				cambio=	mapaRed.get(nuevoHospital).contratarPersonal(idPersonal, tipoPersonal);
			}
			}
			}
		return cambio;
		
	}
	/**
	 * boolean cerrarHospital(String idCerrar,String
	 * idNuevoHospital):Creará un nuevo hospital con el id pasado como parámetro,
	 * agregará el personal del hospital a cerrar y eliminará del mapa el hospital
	 * cerrado
	 */
	public boolean cerrarHospital(String idCerrar,String idNuevoHospital) {
		boolean cerrado=false;
		boolean containsKey = mapaRed.containsKey(idCerrar);
		
		if(containsKey) {
			Set<Personal> listaPersonal = mapaRed.get(idCerrar).getListaPersonal();
			boolean keyNueva = mapaRed.containsKey(idNuevoHospital);
			if(keyNueva) {
			if(mapaRed.get(idNuevoHospital).getListaPersonal()	!=null) {
				mapaRed.get(idNuevoHospital).getListaPersonal().addAll(listaPersonal);
			}
			}
			}
		return cerrado;
	}
	public List<Hospital> listarHospitalPorNombre(){
		List<Hospital> lista=new ArrayList<Hospital>();
		Collection<Hospital> values = mapaRed.values();
		lista.addAll(values);
		Collections.sort(lista);
		
		return lista;
		
	}
	public Map<String, Hospital> getMapaRed() {
		return mapaRed;
	}
	public void setMapaRed(Map<String, Hospital> mapaRed) {
		this.mapaRed = mapaRed;
	}
	@Override
	public String toString() {
		return "RedHospitales [mapaRed=" + mapaRed + "]";
	}
	
}
