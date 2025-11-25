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
}