package es.dam.util;

import es.dam.dao.BibliotecaDAO;
import es.dam.models.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestBusquedas {
    
    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║  TEST DE BÚSQUEDAS Y ESTRATEGIAS DE CARGA     ║");
        System.out.println("╚═══════════════════════════════════════════════╝\n");
        
        SessionFactory factory = null;
        
        try {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Usuario.class)
                    .addAnnotatedClass(Videojuego.class)
                    .addAnnotatedClass(Prestamo.class)
                    .buildSessionFactory();
            
            BibliotecaDAO dao = new BibliotecaDAO(factory);
            
            // ==================== TEST 1: GET ====================
            System.out.println("\n" + "=".repeat(60));
            System.out.println("TEST 1: Búsqueda con get() - Carga inmediata");
            System.out.println("=".repeat(60) + "\n");
            
            dao.buscarUsuarioConGet(1L);
            pausa(1500);
            
            System.out.println("\n" + "-".repeat(60) + "\n");
            
            dao.buscarJuegoConGet(1L);
            pausa(1500);
            
            System.out.println("\n" + "-".repeat(60));
            System.out.println("Buscando ID inexistente con get():");
            System.out.println("-".repeat(60) + "\n");
            
            dao.buscarUsuarioConGet(9999L);
            pausa(2000);
            
            // ==================== TEST 2: LOAD ====================
            System.out.println("\n" + "=".repeat(60));
            System.out.println("TEST 2: Búsqueda con load() - Carga diferida (proxy)");
            System.out.println("=".repeat(60) + "\n");
            
            dao.buscarUsuarioConLoad(1L);
            pausa(2000);
            
            System.out.println("\n" + "-".repeat(60));
            System.out.println("Intentando load() con ID inexistente:");
            System.out.println("-".repeat(60) + "\n");
            
            dao.demostrarLoadConIdInexistente();
            pausa(2000);
            
            // ==================== TEST 3: LAZY LOADING ====================
            System.out.println("\n" + "=".repeat(60));
            System.out.println("TEST 3: Lazy Loading en colecciones");
            System.out.println("=".repeat(60) + "\n");
            
            dao.demostrarLazyLoading(1L);
            pausa(2000);
            
            // ==================== TEST 4: LAZY INITIALIZATION EXCEPTION ====================
            System.out.println("\n" + "=".repeat(60));
            System.out.println("TEST 4: Problema de LazyInitializationException");
            System.out.println("=".repeat(60) + "\n");
            
            dao.demostrarLazyInitializationException(1L);
            pausa(2000);
            
            System.out.println("\n" + "-".repeat(60));
            System.out.println("Solución: Inicializar dentro de la sesión");
            System.out.println("-".repeat(60) + "\n");
            
            dao.solucionLazyInitializationException(1L);
            pausa(2000);
            
            // ==================== TEST 5: COMPARACIÓN DE RENDIMIENTO ====================
            System.out.println("\n" + "=".repeat(60));
            System.out.println("TEST 5: Comparación de rendimiento");
            System.out.println("=".repeat(60));
            
            dao.compararRendimientoGetVsLoad();
            pausa(2000);
            
            // ==================== TEST 6: CASO DE USO REAL ====================
            System.out.println("\n" + "=".repeat(60));
            System.out.println("TEST 6: Caso de uso real - Préstamo optimizado");
            System.out.println("=".repeat(60) + "\n");
            
            Long prestamoId = dao.crearPrestamoOptimizadoConLoad(2L, 2L);
            if (prestamoId != null) {
                System.out.println("ID del nuevo préstamo: " + prestamoId);
            }
            
            // ==================== RESUMEN ====================
            System.out.println("\n" + "=".repeat(60));
            System.out.println("RESUMEN DE CONCEPTOS APRENDIDOS");
            System.out.println("=".repeat(60));
            System.out.println("✅ get() - Carga inmediata, devuelve null si no existe");
            System.out.println("✅ load() - Carga diferida (proxy), lanza excepción si no existe");
            System.out.println("✅ Lazy Loading - Colecciones se cargan solo cuando se acceden");
            System.out.println("✅ LazyInitializationException - Error al acceder fuera de sesión");
            System.out.println("✅ Optimización - load() ahorra consultas en relaciones");
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
        System.out.println("║           TEST COMPLETADO CORRECTAMENTE         ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
    }
    
    /**
        * Método auxiliar para hacer pausas y facilitar la lectura
        */
    private static void pausa(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
