package Interfaces.pruebas.examenpruebas.ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		Traduccion t1=new Traduccion("house", "ingles");
		Traduccion t2=new Traduccion("car", "ingles");
		Traduccion t3=new Traduccion("dog", "ingles");
		Traduccion t1f=new Traduccion("maison", "frances");
		Traduccion t2f=new Traduccion("voiture", "frances");
		Traduccion t3f=new Traduccion("chien", "frances");
		Traduccion t1i=new Traduccion("auto", "italiano");
		Traduccion t2i=new Traduccion("casa", "italiano");
		Traduccion t3i=new Traduccion("cane", "italiano");
		Map<String,List<Traduccion>> mapa=new HashMap<String,List<Traduccion>>();
		List<Traduccion> listaCasa=new ArrayList<Traduccion>();
		listaCasa.add(t1);
		listaCasa.add(t1f);
		listaCasa.add(t2i);
		mapa.put("casa", listaCasa);
		List<Traduccion> listaCoche=new ArrayList<Traduccion>();
		listaCoche.add(t2);
		listaCoche.add(t2f);
		listaCoche.add(t1i);
		mapa.put("coche", listaCoche);
		List<Traduccion> listaPerro=new ArrayList<Traduccion>();
		listaPerro.add(t3);
		listaPerro.add(t3f);
		listaPerro.add(t3i);
		mapa.put("perro", listaPerro);
		
		Map<String, List<Palabra>> mapaResultado= crearDiccionario(mapa);
		System.out.println(mapaResultado);

	}

	private static Map<String, List<Palabra>> crearDiccionario(Map<String, List<Traduccion>> mapa) {
		Map<String, List<Palabra>> resultado=new HashMap<String, List<Palabra>>();
		List<Palabra> palabrasIngles=new ArrayList<Palabra>();
		List<Palabra> palabrasFrances=new ArrayList<Palabra>();
		List<Palabra> palabrasItaliano=new ArrayList<Palabra>();
		resultado.put("ingles", palabrasIngles);
		resultado.put("frances", palabrasFrances);
		resultado.put("italiano", palabrasItaliano);
		
		Set<String> keySet = mapa.keySet();
		Iterator<String> iter =keySet.iterator();
		while(iter.hasNext()) {
			String next = iter.next();
			List<Traduccion> list = mapa.get(next);
			Iterator<Traduccion> iterT=list.iterator();
			while(iterT.hasNext()) {
				Traduccion t=	iterT.next();
				if(t.getIdioma().equals("ingles")) {
					Palabra p = new Palabra(next, t.getPalabra());
					palabrasIngles.add(p);
				}
				if(t.getIdioma().equals("frances")) {
					Palabra p = new Palabra(next, t.getPalabra());
					palabrasFrances.add(p);
				}
				if(t.getIdioma().equals("italiano")) {
					Palabra p = new Palabra(next, t.getPalabra());
					palabrasItaliano.add(p);
				}
			}
		}
		
		return resultado;
	}

}
