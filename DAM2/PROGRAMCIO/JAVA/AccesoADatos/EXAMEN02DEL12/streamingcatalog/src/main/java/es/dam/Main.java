// Main.java - paquete raíz es.dam.streamingcatalog
package es.dam;

import es.dam.model.*;
import es.dam.repository.StreamingDAO;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║      CATALOGO STREAMING - TEST CRUD/HIBERNATE ║");
        System.out.println("╚═══════════════════════════════════════════════╝\n");

        SessionFactory factory = null;
        try {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Estudio.class)
                    .addAnnotatedClass(Pelicula.class)
                    .addAnnotatedClass(Critica.class)
                    .buildSessionFactory();

            StreamingDAO dao = new StreamingDAO(factory);

            // ==================== Crear Estudio ====================
            System.out.println("\n" + "=".repeat(60));
            System.out.println("CREAR: Estudio + Películas");
            System.out.println("=".repeat(60) + "\n");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fundacion = sdf.parse("1995-06-15");
            Long estudioId = dao.crearEstudio("Estudio Omega", fundacion);

            // Crear dos películas asociadas
            Long peli1Id = dao.crearPelicula("Viaje a Andrómeda", 2018, "Ciencia Ficción", estudioId);
            Long peli2Id = dao.crearPelicula("La sombra del tiempo", 2020, "Drama", estudioId);

            Thread.sleep(1200);

            // ==================== Actualizar año de una película ====================
            System.out.println("\n" + "=".repeat(60));
            System.out.println("UPDATE: Actualizar año de 'Viaje a Andrómeda' a 2021");
            System.out.println("=".repeat(60) + "\n");

            dao.actualizarAnioPelicula(peli1Id, 2021);

            Thread.sleep(1000);

            // ==================== Consulta avanzada ====================
            System.out.println("\n" + "=".repeat(60));
            System.out.println("CONSULTA: Películas posteriores a 2019");
            System.out.println("=".repeat(60) + "\n");

            List<Pelicula> recientes = dao.findByAnioMayorQue(2019);
            for (Pelicula p : recientes) {
                System.out.println(" - " + p);
            }

            Thread.sleep(1000);

            // ==================== Eliminar Estudio y observar cascada ====================
            System.out.println("\n" + "=".repeat(60));
            System.out.println("DELETE: Eliminar Estudio y comprobar efecto en Películas/Criticas");
            System.out.println("=".repeat(60) + "\n");

            // Añadimos una crítica a la peli2 para ver el efecto cascade
            dao.crearCritica("Ana", 8, "Emotiva y bien rodada", peli2Id);
            dao.crearCritica("Luis", 7, "Buen guion", peli2Id);

            System.out.println("\nAntes de eliminar estudio:");
            dao.findEstudio(estudioId); // mostrará el estudio (pero colecciones lazy)

            System.out.println("\nEliminando estudio...");
            dao.eliminarEstudio(estudioId);

            System.out.println("\nIntentando buscar las películas que pertenecían al estudio:");
            dao.findPelicula(peli1Id);
            dao.findPelicula(peli2Id);

            // ==================== Resumen ====================
            System.out.println("\n" + "=".repeat(60));
            System.out.println("RESUMEN DE ACCIONES REALIZADAS");
            System.out.println("=".repeat(60));
            System.out.println("✅ Estudio creado y dos películas asociadas");
            System.out.println("✅ Actualizado año de una película");
            System.out.println("✅ Consulta JPQL realizada");
            System.out.println("✅ Eliminación con Cascade comprobada");
            System.out.println("=".repeat(60));

        } catch (Exception e) {
            System.err.println("\n❌ ERROR CRÍTICO: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (factory != null) {
                factory.close();
                System.out.println("\n✅ SessionFactory cerrada correctamente");
            }
        }

        System.out.println("\n╔═══════════════════════════════════════════════╗");
        System.out.println("║           PROYECTO 'catalogo-streaming'        ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
    }
}
