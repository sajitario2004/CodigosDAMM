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

            // crear Estudio 
            System.out.println("\n" + "=================================");
            System.out.println("CREAR: Estudio + Peliculas");
            System.out.println("=================================" + "\n");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            Date fundacion = sdf.parse("1995-06-15");
            Long estudioId = dao.crearEstudio(
                "Estudio Sajitario", 
                fundacion
            );

            // Crear dos películas asociadas
            Long peli1Id = dao.crearPelicula(
                "Viaje a Androomeda", 
                2018, 
                "Ciencia Ficcion", 
                estudioId
            );
            Long peli2Id = dao.crearPelicula(
                "La historia de Santana", 
                2025, 
                "Drama", 
                estudioId
            );

            Thread.sleep(2000);

            // actualizar año lanzamienot
            System.out.println("\n" + "=================================");
            System.out.println("UPDATE:Actualizar año de 'Viaje a Andromeda' a 2021");
            System.out.println("=================================" + "\n");

            dao.actualizarAnioPelicula(peli1Id, 2021);

            Thread.sleep(2000);

            // Consulta avanzada
            System.out.println("\n" + "=================================");
            System.out.println("CONSULTA: Peliculas posteriores a 2019");
            System.out.println("=================================" + "\n");

            List<Pelicula> recientes = dao.findByAnioMayorQue(2019);
            for (Pelicula p : recientes) {
                System.out.println(" - " + p);
            }

            Thread.sleep(2000);

            // =================== Eliminar Estudio y observar cascada ====================
            System.out.println("\n" + "=================================");
            System.out.println("DELETE: Eliminar Estudio y comprobar efecto en Películas/Criticas");
            System.out.println("=================================" + "\n");

            // Añadimos una crítica a la peli2 para ver el efecto cascade
            dao.crearCritica("Ana", 8, "Emotiva y bien rodada", peli2Id);
            dao.crearCritica("Luis", 7, "Buen guion", peli2Id);

            System.out.println("\nAntes de eliminar estudio:");
            dao.findEstudio(estudioId); // mostrará el estudio (pero colecciones lazy)

            System.out.println("\nEliminando estudio...");
            dao.eliminarEstudio(estudioId);

            System.out.println("\nIntentando buscar las peliculas que pertenecían al estudio:");
            dao.findPelicula(peli1Id);
            dao.findPelicula(peli2Id);

            // ==================== Resumen =================
            System.out.println("\n" + "=================================");
            System.out.println("RESUMEN");
            System.out.println("=================================");
            System.out.println("✅ Estudio creado y dos peliculas asociadas");
            System.out.println("✅ Actualizado año de una pelicula");
            System.out.println("✅ Consulta JPQL realizada");
            System.out.println("✅ Eliminación con Cascade comprobada");
            System.out.println("=================================");

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
