package Clases;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		HashMap<String, Receta[]> rc = new HashMap<>();
		GestionPostres gestion = new GestionPostres(rc);

		Receta receta1 = new Receta("Tarta de manzana", "T001", Arrays.asList("Manzana", "Harina", "Azúcar"));
		Receta receta2 = new Receta("Helado de vainilla", "H001", Arrays.asList("Leche", "Vainilla", "Azúcar"));
		Receta receta3 = new Receta("Galletas de chocolate", "G001",Arrays.asList("Harina", "Chocolate", "Mantequilla"));

		gestion.agregarReceta("Tartas", receta1);
		gestion.agregarReceta("Helados", receta2);
		gestion.agregarReceta("Galletas", receta3);

		System.out.println("Receta buscada: " + gestion.buscarReceta("Tartas", "T001").getNombre());

		System.out.println("Recetas con Harina:");
		List<Receta> recetasConHarina = gestion.filtrarPorIngrediente("Harina");
		for (int i = 0; i < recetasConHarina.size(); i++) {
			System.out.println(recetasConHarina.get(i).getNombre());
		}

		gestion.actualizarReceta("Galletas", "G001", "Galletas de avena", Arrays.asList("Harina", "Avena", "Miel"));
		System.out.println("Recetas después de actualizar Galletas de chocolate a Galletas de avena:");
		for (int i = 0; i < recetasConHarina.size(); i++) {
			System.out.println(recetasConHarina.get(i).getNombre());
		}

		gestion.eliminarReceta("Tartas", "T001");
		System.out.println("Recetas después de eliminar Tarta de manzana:");
		recetasConHarina = gestion.filtrarPorIngrediente("Harina");
		for (int i = 0; i < recetasConHarina.size(); i++) {
			System.out.println(recetasConHarina.get(i).getNombre());
		}
	}
}
