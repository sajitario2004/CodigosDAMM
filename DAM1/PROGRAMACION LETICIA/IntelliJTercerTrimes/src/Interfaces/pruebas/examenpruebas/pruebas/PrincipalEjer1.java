package Interfaces.pruebas.examenpruebas.pruebas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Interfaces.pruebas.examenpruebas.clases.Enfermero;
import Interfaces.pruebas.examenpruebas.clases.Hospital;
import Interfaces.pruebas.examenpruebas.clases.Medico;
import Interfaces.pruebas.examenpruebas.clases.Paciente;
import Interfaces.pruebas.examenpruebas.clases.Personal;
import Interfaces.pruebas.examenpruebas.clases.RedHospitales;
import Interfaces.pruebas.examenpruebas.clases.Visita;

public class PrincipalEjer1 {

	public static void main(String[] args) {
		Paciente p = new Paciente("Luis", "Gracia Perez", "75643982A");
		Paciente p2 = new Paciente("Ana", "Montoya Albarracion", "65688982Z");
		Paciente p3 = new Paciente("Pedro", "Casas Morilla", "65564398L");
		Visita v = new Visita("Ana", "Montoya Albarracion", "plaza Sol sn", 666578432,"V4");
		Visita v2 = new Visita("Luis", "Gracia Perez", "calle real 3", 666554332,"V5");
		Visita v3 = new Visita("Pedro", "Casas Morilla", "calle melancolia", 663378432,"V6");
		Medico m = new Medico("3BGT");
		Set<Paciente> listaP1 = new HashSet<Paciente>();
		listaP1.add(p);
		listaP1.add(p2);
		listaP1.add(p3);
		m.setListaPacientes(listaP1);
		Enfermero e = new Enfermero("E1");
		Set<Visita> listaV1 = new HashSet<Visita>();
		listaV1.add(v);
		listaV1.add(v2);
		listaV1.add(v3);
		e.setListaVisitas(listaV1);
		Paciente p4 = new Paciente("Jose", "Gracia Perez", "95643982A");
		Paciente p5 = new Paciente("Pepe", "Montoya Albarracion", "34688982Z");
		Paciente p6 = new Paciente("Mario", "Casas Morilla", "85564398L");
		Visita v4 = new Visita("Antonio", "Montoya Albarracion", "plaza Sol sn", 626578432,"V1");
		Visita v5 = new Visita("Luisa", "Gracia Perez", "calle real 3", 646554332,"V2");
		Visita v6 = new Visita("Paloma", "Casas Morilla", "calle melancolia", 693378432,"V3");
		Medico m2 = new Medico("2BGT");
		Set<Paciente> listaP2 = new HashSet<Paciente>();
		listaP2.add(p4);
		listaP2.add(p5);
		listaP2.add(p6);
		m2.setListaPacientes(listaP2);
		Enfermero e2 = new Enfermero("E2");
		Set<Visita> listaV2 = new HashSet<Visita>();
		listaV2.add(v4);
		listaV2.add(v5);
		listaV2.add(v6);
		e2.setListaVisitas(listaV2);
		Set<Personal> personal1 = new HashSet<Personal>();
		personal1.add(m2);
		personal1.add(e);
		Set<Personal> personal2 = new HashSet<Personal>();
		personal2.add(m);
		personal2.add(e2);
		Hospital h = new Hospital("H1", "Universitario San Cecilio", personal1);
		Hospital h2 = new Hospital("H2", "Puerta de Hierro", personal2);
		RedHospitales rh = new RedHospitales();
		Map<String, Hospital> mapa = new HashMap<String, Hospital>();
		mapa.put(h.getId(), h);
		mapa.put(h2.getId(), h2);
		rh.setMapaRed(mapa);
		// Pruebas
		Paciente p7 = new Paciente("Lucia", "Perez Morilla", "95564398L");
		System.out.println("Se ha podido añadir:" + h.anadirPaciente(m2.getIdentificador(), p7));
		System.out.println("Lista de pacientes:" + m2.getListaPacientes());
		System.out.println("Se ha podido añadir:" + h.anadirPaciente(m2.getIdentificador(), p7));
		System.out.println("Contratar personal:");
		System.out.println("Se ha podido contratar:" + h2.contratarPersonal("E4", "enfermero"));
		System.out.println("Se ha podido despedir"+ h2.despedirPersonal("E7"));  
		System.out.println("Se ha podido modificar la direccion:"+h.modificarDireccionCuras("E1", "V6", "calle nueva"));
		System.out.println("Se ha podido cambiar de hospital:"+rh.cambiarPersonal(e2.getIdentificador(), h2.getId(), h.getId(), "enfermero"));
		List<Hospital> listarHospitalPorNombre = rh.listarHospitalPorNombre();
		System.out.println("Lista hospitales:"+listarHospitalPorNombre);
		rh.cerrarHospital(h.getId(), h2.getId());
		System.out.println(h2.getListaPersonal());

	}

}
