package es.dam.dao;

import es.dam.models.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.Date;

public class BibliotecaDAO {
    
    private SessionFactory sessionFactory;
    
    public BibliotecaDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    // ==================== CREATE ====================
    
    /**
     * Crea un nuevo usuario en la base de datos
     */
    public Long crearUsuario(String nombre, String email) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Long id = null;
        
        try {
            tx = session.beginTransaction();
            
            Usuario usuario = new Usuario(nombre, email);
            // id = (Long) session.save(usuario); // Alternativa con save() deprecada
            session.persist(usuario);
            id = usuario.getId();

            tx.commit();
            
            System.out.println("✅ Usuario creado: " + usuario);
            
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error al crear usuario: " + e.getMessage());
        } finally {
            session.close();
        }
        
        return id;
    }
    
    /**
     * Crea un nuevo videojuego en la base de datos
     */
    public Long crearVideojuego(String titulo, String plataforma, 
                                Double precio, String genero, Integer anio) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Long id = null;
        
        try {
            tx = session.beginTransaction();
            
            Videojuego juego = new Videojuego(titulo, plataforma, precio);
            juego.setGenero(genero);
            juego.setAnioLanzamiento(anio);
            juego.setDescripcion("Descripción del juego: " + titulo);

            // id = (Long) session.save(juego); // Alternativa con save() deprecada
            session.persist(juego);
            id = juego.getId();
            
            tx.commit();
            System.out.println("✅ Videojuego creado: " + juego);
            
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error al crear videojuego: " + e.getMessage());
        } finally {
            session.close();
        }
        
        return id;
    }
    
    /**
     * Crea un nuevo préstamo (relaciona usuario con videojuego)
     */
    public Long crearPrestamo(Long usuarioId, Long juegoId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Long id = null;
        
        try {
            tx = session.beginTransaction();
            
            // Obtener usuario y juego existentes
            Usuario usuario = session.get(Usuario.class, usuarioId);
            Videojuego juego = session.get(Videojuego.class, juegoId);
            
            if (usuario == null || juego == null) {
                System.out.println("❌ Usuario o juego no encontrado");
                return null;
            }
            
            if (juego.getStock() <= 0) {
                System.out.println("❌ No hay stock disponible para: " + juego.getTitulo());
                return null;
            }
            
            // Crear el préstamo
            Prestamo prestamo = new Prestamo(usuario, juego);
            // id = (Long) session.save(prestamo); // Alternativa con save() deprecada
            session.persist(prestamo);
            id = prestamo.getId();
            
            // Reducir el stock del juego
            juego.setStock(juego.getStock() - 1);
            
            tx.commit();
            System.out.println("✅ Préstamo creado correctamente:");
            System.out.println("   Usuario: " + usuario.getNombre());
            System.out.println("   Juego: " + juego.getTitulo());
            System.out.println("   Stock restante: " + juego.getStock());
            
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error al crear préstamo: " + e.getMessage());
        } finally {
            session.close();
        }
        
        return id;
    }
    
    // ==================== UPDATE ====================
    
    /**
     * Actualiza el email de un usuario
     */
    public boolean actualizarEmailUsuario(Long usuarioId, String nuevoEmail) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        boolean exito = false;
        
        try {
            tx = session.beginTransaction();
            
            Usuario usuario = session.get(Usuario.class, usuarioId);
            
            if (usuario != null) {
                String emailAnterior = usuario.getEmail();
                usuario.setEmail(nuevoEmail);
                
                // No necesitamos session.update() - dirty checking lo detecta
                
                tx.commit();
                System.out.println("✅ Email actualizado:");
                System.out.println("   Anterior: " + emailAnterior);
                System.out.println("   Nuevo: " + nuevoEmail);
                exito = true;
            } else {
                System.out.println("❌ Usuario no encontrado con ID: " + usuarioId);
            }
            
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error al actualizar email: " + e.getMessage());
        } finally {
            session.close();
        }
        
        return exito;
    }
    
    /**
     * Actualiza el precio de un videojuego (aplicar oferta)
     */
    public boolean aplicarOferta(Long juegoId, Double nuevoPrecio) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        boolean exito = false;
        
        try {
            tx = session.beginTransaction();
            
            Videojuego juego = session.get(Videojuego.class, juegoId);
            
            if (juego != null) {
                Double precioAnterior = juego.getPrecio();
                juego.setPrecio(nuevoPrecio);
                
                Double descuento = ((precioAnterior - nuevoPrecio) / precioAnterior) * 100;
                
                tx.commit();
                System.out.println("💰 Oferta aplicada en: " + juego.getTitulo());
                System.out.println("   Precio anterior: " + precioAnterior + "€");
                System.out.println("   Precio nuevo: " + nuevoPrecio + "€");
                System.out.println("   Descuento: " + String.format("%.0f", descuento) + "%");
                exito = true;
            } else {
                System.out.println("❌ Videojuego no encontrado con ID: " + juegoId);
            }
            
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error al aplicar oferta: " + e.getMessage());
        } finally {
            session.close();
        }
        
        return exito;
    }
    
    /**
     * Registra la devolución de un préstamo
     */
    public boolean registrarDevolucion(Long prestamoId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        boolean exito = false;
        
        try {
            tx = session.beginTransaction();
            
            Prestamo prestamo = session.get(Prestamo.class, prestamoId);
            
            if (prestamo != null) {
                if (prestamo.getDevuelto()) {
                    System.out.println("⚠️ Este préstamo ya fue devuelto anteriormente");
                    return false;
                }
                
                prestamo.setDevuelto(true);
                prestamo.setFechaDevolucion(new Date());
                
                // Incrementar el stock del juego
                Videojuego juego = prestamo.getVideojuego();
                juego.setStock(juego.getStock() + 1);
                
                tx.commit();
                System.out.println("✅ Devolución registrada");
                System.out.println("   Juego devuelto: " + juego.getTitulo());
                System.out.println("   Stock actualizado: " + juego.getStock());
                exito = true;
            } else {
                System.out.println("❌ Préstamo no encontrado con ID: " + prestamoId);
            }
            
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error al registrar devolución: " + e.getMessage());
        } finally {
            session.close();
        }
        
        return exito;
    }
    
    // ==================== DELETE ====================
    
    /**
     * Elimina un usuario de la base de datos
     */
    public boolean eliminarUsuario(Long usuarioId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        boolean exito = false;
        
        try {
            tx = session.beginTransaction();
            
            Usuario usuario = session.get(Usuario.class, usuarioId);
            
            if (usuario != null) {
                // Verificar si tiene préstamos activos
                if (!usuario.getPrestamos().isEmpty()) {
                    long prestamosActivos = usuario.getPrestamos().stream()
                            .filter(p -> !p.getDevuelto())
                            .count();
                    
                    if (prestamosActivos > 0) {
                        System.out.println("❌ No se puede eliminar: el usuario tiene " + 
                                         prestamosActivos + " préstamos activos");
                        return false;
                    }
                }
                
                String nombre = usuario.getNombre();
                // session.delete(usuario); // Funciona pero deprecada, usar remove()
                session.remove(usuario);
                
                tx.commit();
                System.out.println("🗑️ Usuario eliminado: " + nombre);
                exito = true;
            } else {
                System.out.println("❌ Usuario no encontrado con ID: " + usuarioId);
            }
            
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error al eliminar usuario: " + e.getMessage());
        } finally {
            session.close();
        }
        
        return exito;
    }
    
    /**
     * Elimina un videojuego de la base de datos
     */
    public boolean eliminarVideojuego(Long juegoId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        boolean exito = false;
        
        try {
            tx = session.beginTransaction();
            
            Videojuego juego = session.get(Videojuego.class, juegoId);
            
            if (juego != null) {
                // Verificar si tiene préstamos activos
                if (!juego.getPrestamos().isEmpty()) {
                    long prestamosActivos = juego.getPrestamos().stream()
                            .filter(p -> !p.getDevuelto())
                            .count();
                    
                    if (prestamosActivos > 0) {
                        System.out.println("❌ No se puede eliminar: el juego tiene " + 
                                         prestamosActivos + " préstamos activos");
                        return false;
                    }
                }
                
                String titulo = juego.getTitulo();
                // session.delete(juego); // Funciona pero deprecada, usar remove()
                session.remove(juego);
                
                tx.commit();
                System.out.println("🗑️ Videojuego eliminado: " + titulo);
                exito = true;
            } else {
                System.out.println("❌ Videojuego no encontrado con ID: " + juegoId);
            }
            
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error al eliminar videojuego: " + e.getMessage());
        } finally {
            session.close();
        }
        
        return exito;
    }
    
    /**
     * Elimina un préstamo de la base de datos
     */
    public boolean eliminarPrestamo(Long prestamoId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        boolean exito = false;
        
        try {
            tx = session.beginTransaction();
            
            Prestamo prestamo = session.get(Prestamo.class, prestamoId);
            
            if (prestamo != null) {
                // session.delete(prestamo); // Funciona pero deprecada, usar remove()
                session.remove(prestamo);
                
                tx.commit();
                System.out.println("🗑️ Préstamo eliminado con ID: " + prestamoId);
                exito = true;
            } else {
                System.out.println("❌ Préstamo no encontrado con ID: " + prestamoId);
            }
            
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error al eliminar préstamo: " + e.getMessage());
        } finally {
            session.close();
        }
        
        return exito;
    }

     // ==================== BÚSQUEDAS CON GET ====================
    
    /**
     * Buscar usuario usando get() - Carga inmediata
     */
    public Usuario buscarUsuarioConGet(Long id) {
        Session session = sessionFactory.openSession();
        Usuario usuario = null;
        
        try {
            System.out.println("🔍 Buscando usuario con get()...");
            System.out.println("    → Ejecutará SQL INMEDIATAMENTE");
            
            usuario = session.get(Usuario.class, id);
            
            if (usuario != null) {
                System.out.println("✅ Usuario encontrado: " + usuario.getNombre());
                System.out.println("   Tipo de objeto: " + usuario.getClass().getName());
            } else {
                System.out.println("❌ Usuario no encontrado (devuelve null)");
            }
            
        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
        } finally {
            session.close();
        }
        
        return usuario;
    }
    
    /**
     * Buscar videojuego usando get()
     */
    public Videojuego buscarJuegoConGet(Long id) {
        Session session = sessionFactory.openSession();
        Videojuego juego = null;
        
        try {
            System.out.println("🔍 Buscando videojuego con get()...");
            
            juego = session.get(Videojuego.class, id);
            
            if (juego != null) {
                System.out.println("✅ Juego encontrado: " + juego.getTitulo());
                System.out.println("   Precio: " + juego.getPrecio() + "€");
                System.out.println("   Stock: " + juego.getStock() + " unidades");
            } else {
                System.out.println("❌ Juego no encontrado");
            }
            
        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
        } finally {
            session.close();
        }
        
        return juego;
    }
    
    // ==================== BÚSQUEDAS CON LOAD ====================
    
    /**
     * Buscar usuario usando load() - Carga diferida (lazy)
     */
    public Usuario buscarUsuarioConLoad(Long id) {
        Session session = sessionFactory.openSession();
        Usuario usuario = null;
        
        try {
            System.out.println("🔍 Buscando usuario con load()...");
            System.out.println("   → NO ejecutará SQL todavía (devuelve proxy)");
            
            usuario = session.load(Usuario.class, id);
            
            System.out.println("✅ Proxy obtenido");
            System.out.println("   Tipo de objeto: " + usuario.getClass().getName());
            System.out.println("   (Observa que NO es Usuario, es un proxy)");
            
            System.out.println("\n   Accediendo a una propiedad...");
            String nombre = usuario.getNombre(); // AQUÍ se ejecuta el SQL
            System.out.println("   → AHORA sí se ejecutó la consulta SQL");
            System.out.println("✅ Nombre obtenido: " + nombre);
            
        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
        
        return usuario;
    }
    
    /**
     * Demostrar que load() lanza excepción si no existe
     */
    public void demostrarLoadConIdInexistente() {
        Session session = sessionFactory.openSession();
        
        try {
            System.out.println("🔍 Intentando load() con ID que NO existe (9999)...");
            
            // load está deprecado en Hibernate 6, aunque debe funcionar; busca su alternativa
            Usuario usuario = session.load(Usuario.class, 9999L); 
            System.out.println("   Proxy creado (aún no sabe que no existe)");
            
            System.out.println("   Intentando acceder al nombre...");
            String nombre = usuario.getNombre(); // BOOM! Excepción
            System.out.println("   Nombre: " + nombre);
            
        } catch (Exception e) {
            System.err.println("💥 EXCEPCIÓN capturada (como esperábamos):");
            System.err.println("   " + e.getClass().getSimpleName() + ": " + e.getMessage());
        } finally {
            session.close();
        }
    }
    
    // ==================== LAZY LOADING ====================
    
    /**
     * Demostrar lazy loading en colecciones
     */
    public void demostrarLazyLoading(Long usuarioId) {
        Session session = sessionFactory.openSession();
        
        try {
            System.out.println("🔍 Cargando usuario (los préstamos son LAZY)...");
            
            Usuario usuario = session.get(Usuario.class, usuarioId);
            System.out.println("✅ Usuario cargado: " + usuario.getNombre());
            System.out.println("   (Aún NO se cargaron los préstamos)");
            
            System.out.println("\n   Accediendo a la colección de préstamos...");
            int cantidadPrestamos = usuario.getPrestamos().size();
            System.out.println("   → AHORA sí se ejecutó SQL para cargar préstamos");
            System.out.println("✅ Préstamos encontrados: " + cantidadPrestamos);
            
            // Mostrar detalles de cada préstamo
            if (cantidadPrestamos > 0) {
                System.out.println("\n   Detalles de los préstamos:");
                for (Prestamo p : usuario.getPrestamos()) {
                    System.out.println("   - Juego: " + p.getVideojuego().getTitulo());
                    System.out.println("     Fecha: " + p.getFechaPrestamo());
                    System.out.println("     Devuelto: " + (p.getDevuelto() ? "Sí" : "No"));
                }
            }
            
        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
        } finally {
            session.close();
        }
    }
    
    /**
     * Demostrar el problema de LazyInitializationException
     */
    public void demostrarLazyInitializationException(Long usuarioId) {
        Session session = sessionFactory.openSession();
        Usuario usuario = null;
        
        try {
            System.out.println("🔍 Cargando usuario dentro de la sesión...");
            usuario = session.get(Usuario.class, usuarioId);
            System.out.println("✅ Usuario cargado: " + usuario.getNombre());
            
        } finally {
            session.close();
            System.out.println("❌ Sesión CERRADA");
        }
        
        // Intentar acceder a los préstamos DESPUÉS de cerrar la sesión
        try {
            System.out.println("\n   Intentando acceder a préstamos fuera de la sesión...");
            int cantidad = usuario.getPrestamos().size();
            System.out.println("   Cantidad: " + cantidad);
            
        } catch (Exception e) {
            System.err.println("💥 EXCEPCIÓN capturada:");
            System.err.println("   " + e.getClass().getSimpleName());
            System.err.println("   Causa: Intentar acceder a colección lazy fuera de sesión");
        }
    }
    
    /**
     * Solución: Inicializar la colección dentro de la sesión
     */
    public void solucionLazyInitializationException(Long usuarioId) {
        Session session = sessionFactory.openSession();
        Usuario usuario = null;
        
        try {
            System.out.println("🔍 Cargando usuario...");
            usuario = session.get(Usuario.class, usuarioId);
            
            // INICIALIZAR la colección DENTRO de la sesión
            System.out.println("   Inicializando préstamos dentro de la sesión...");
            int cantidad = usuario.getPrestamos().size();
            System.out.println("✅ Préstamos inicializados: " + cantidad);
            
        } finally {
            session.close();
            System.out.println("✅ Sesión cerrada");
        }
        
        // Ahora SÍ podemos acceder fuera de la sesión
        try {
            System.out.println("\n   Accediendo a préstamos FUERA de la sesión...");
            System.out.println("✅ Cantidad de préstamos: " + usuario.getPrestamos().size());
            System.out.println("   ¡Funciona! Porque ya estaban cargados");
            
        } catch (Exception e) {
            System.err.println("❌ Error inesperado: " + e.getMessage());
        }
    }
    
    // ==================== COMPARACIÓN DE RENDIMIENTO ====================
    
    /**
     * Comparar rendimiento entre get() y load()
     */
    public void compararRendimientoGetVsLoad() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║  COMPARACIÓN DE RENDIMIENTO GET vs LOAD  ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        // Test con GET
        Session session1 = sessionFactory.openSession();
        long inicioGet = System.currentTimeMillis();
        
        Usuario usuarioGet = session1.get(Usuario.class, 1L);
        long finGet = System.currentTimeMillis();
        
        System.out.println("📊 get():");
        System.out.println("   Tiempo: " + (finGet - inicioGet) + "ms");
        System.out.println("   SQL ejecutado: SÍ (inmediatamente)");
        System.out.println("   Tipo: " + usuarioGet.getClass().getSimpleName());
        
        session1.close();
        
        // Test con LOAD
        Session session2 = sessionFactory.openSession();
        long inicioLoad = System.currentTimeMillis();
        
        Usuario usuarioLoad = session2.load(Usuario.class, 1L);
        long finLoad = System.currentTimeMillis();
        
        System.out.println("\n📊 load():");
        System.out.println("   Tiempo: " + (finLoad - inicioLoad) + "ms");
        System.out.println("   SQL ejecutado: NO (solo proxy)");
        System.out.println("   Tipo: " + usuarioLoad.getClass().getSimpleName());
        
        // Ahora accedemos a una propiedad
        long inicioAcceso = System.currentTimeMillis();
        usuarioLoad.getNombre();
        long finAcceso = System.currentTimeMillis();
        
        System.out.println("\n   Acceso a propiedad:");
        System.out.println("   Tiempo adicional: " + (finAcceso - inicioAcceso) + "ms");
        System.out.println("   SQL ejecutado: SÍ (ahora)");
        
        session2.close();
        
        System.out.println("\n💡 Conclusión:");
        System.out.println("   - get() es más simple y seguro");
        System.out.println("   - load() es más eficiente si solo necesitas la referencia");
    }
    
    /**
     * Caso de uso real: Crear préstamo optimizado con load()
     */
    public Long crearPrestamoOptimizadoConLoad(Long usuarioId, Long juegoId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Long id = null;
        
        try {
            tx = session.beginTransaction();
            
            System.out.println("🔍 Creando préstamo usando load() (optimizado)...");
            
            // Verificar stock con get() (necesitamos el dato)
            Videojuego juego = session.get(Videojuego.class, juegoId);
            
            if (juego == null || juego.getStock() < 0) {
                System.out.println("❌ Juego no disponible");
                return null;
            }
            
            // Crear préstamo usando load() para el usuario
            // (no necesitamos los datos, solo la referencia para la FK)
            Prestamo prestamo = new Prestamo();
            prestamo.setFechaPrestamo(new java.util.Date());
            prestamo.setDevuelto(false);
            prestamo.setUsuario(session.load(Usuario.class, usuarioId));
            prestamo.setVideojuego(juego);
            
            juego.setStock(juego.getStock() - 1);
            
            // save está deprecado en Hibernate 6, aunque debe funcionar; busca su alternativa
            id = (Long) session.save(prestamo);
            tx.commit();
            
            System.out.println("✅ Préstamo creado (solo 1 SELECT en lugar de 2)");
            System.out.println("   Se ahorró una consulta usando load()");
            
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error: " + e.getMessage());
        } finally {
            session.close();
        }
        
        return id;
    }
}