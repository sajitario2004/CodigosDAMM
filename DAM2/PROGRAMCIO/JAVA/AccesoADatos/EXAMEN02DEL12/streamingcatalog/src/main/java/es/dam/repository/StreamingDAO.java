// Paquete: es.dam.streamingcatalog.repository
package es.dam.repository;

import es.dam.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StreamingDAO {

    private SessionFactory sessionFactory;

    public StreamingDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // ==================== CREATE ====================

    public Long crearEstudio(String nombre, java.util.Date fundacion) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Long id = null;
        try {
            tx = session.beginTransaction();
            Estudio e = new Estudio(nombre, fundacion);
            session.persist(e);
            id = e.getId();
            tx.commit();
            System.out.println("✅ Estudio creado: " + e);
        } catch (Exception ex) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error al crear estudio: " + ex.getMessage());
        } finally {
            session.close();
        }
        return id;
    }

    public Long crearPelicula(String titulo, Integer anio, String genero, Long estudioId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Long id = null;
        try {
            tx = session.beginTransaction();
            Pelicula p = new Pelicula(titulo, anio, genero);
            if (estudioId != null) {
                Estudio estudio = session.get(Estudio.class, estudioId);
                if (estudio == null) {
                    System.out.println("❌ Estudio no encontrado para asociar");
                } else {
                    estudio.addPelicula(p); // mantiene bidireccionalidad
                }
            }
            session.persist(p);
            id = p.getId();
            tx.commit();
            System.out.println("✅ Pelicula creada: " + p);
        } catch (Exception ex) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error al crear pelicula: " + ex.getMessage());
        } finally {
            session.close();
        }
        return id;
    }

    public Long crearCritica(String autor, Integer puntuacion, String comentario, Long peliculaId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Long id = null;
        try {
            tx = session.beginTransaction();
            Critica c = new Critica(autor, puntuacion, comentario);
            if (peliculaId != null) {
                Pelicula p = session.get(Pelicula.class, peliculaId);
                if (p == null) {
                    System.out.println("❌ Pelicula no encontrada para asociar critica");
                } else {
                    p.addCritica(c);
                }
            }
            session.persist(c);
            id = c.getId();
            tx.commit();
            System.out.println("✅ Crítica creada: " + c);
        } catch (Exception ex) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error al crear critica: " + ex.getMessage());
        } finally {
            session.close();
        }
        return id;
    }

    // ==================== READ ====================

    public Estudio findEstudio(Long id) {
        Session session = sessionFactory.openSession();
        Estudio e = null;
        try {
            e = session.get(Estudio.class, id);
            if (e != null) System.out.println("🔍 Estudio encontrado: " + e);
            else System.out.println("🔍 Estudio no encontrado (id=" + id + ")");
        } catch (Exception ex) {
            System.err.println("❌ Error findEstudio: " + ex.getMessage());
        } finally {
            session.close();
        }
        return e;
    }

    public Pelicula findPelicula(Long id) {
        Session session = sessionFactory.openSession();
        Pelicula p = null;
        try {
            p = session.get(Pelicula.class, id);
            if (p != null) System.out.println("🔍 Pelicula encontrada: " + p);
            else System.out.println("🔍 Pelicula no encontrada (id=" + id + ")");
        } catch (Exception ex) {
            System.err.println("❌ Error findPelicula: " + ex.getMessage());
        } finally {
            session.close();
        }
        return p;
    }

    public Critica findCritica(Long id) {
        Session session = sessionFactory.openSession();
        Critica c = null;
        try {
            c = session.get(Critica.class, id);
            if (c != null) System.out.println("🔍 Critica encontrada: " + c);
            else System.out.println("🔍 Critica no encontrada (id=" + id + ")");
        } catch (Exception ex) {
            System.err.println("❌ Error findCritica: " + ex.getMessage());
        } finally {
            session.close();
        }
        return c;
    }

    // ==================== UPDATE ====================

    public boolean actualizarAnioPelicula(Long peliculaId, Integer nuevoAnio) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        boolean exito = false;
        try {
            tx = session.beginTransaction();
            Pelicula p = session.get(Pelicula.class, peliculaId);
            if (p != null) {
                Integer anterior = p.getAnioLanzamiento();
                p.setAnioLanzamiento(nuevoAnio);
                tx.commit();
                System.out.println("✅ Año de película actualizado: " + p.getTitulo());
                System.out.println("   Anterior: " + anterior + "  Nuevo: " + nuevoAnio);
                exito = true;
            } else {
                System.out.println("❌ Pelicula no encontrada: id=" + peliculaId);
            }
        } catch (Exception ex) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error actualizarAnioPelicula: " + ex.getMessage());
        } finally {
            session.close();
        }
        return exito;
    }

    // ==================== DELETE ====================

    public boolean eliminarEstudio(Long estudioId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        boolean exito = false;
        try {
            tx = session.beginTransaction();
            Estudio e = session.get(Estudio.class, estudioId);
            if (e != null) {
                String nombre = e.getNombre();
                session.remove(e); // debido a CascadeType.ALL las películas y críticas asociadas se eliminarán
                tx.commit();
                System.out.println("🗑️ Estudio eliminado: " + nombre);
                exito = true;
            } else {
                System.out.println("❌ Estudio no encontrado: id=" + estudioId);
            }
        } catch (Exception ex) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error eliminarEstudio: " + ex.getMessage());
        } finally {
            session.close();
        }
        return exito;
    }

    public boolean eliminarPelicula(Long peliculaId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        boolean exito = false;
        try {
            tx = session.beginTransaction();
            Pelicula p = session.get(Pelicula.class, peliculaId);
            if (p != null) {
                String titulo = p.getTitulo();
                session.remove(p);
                tx.commit();
                System.out.println("🗑️ Pelicula eliminada: " + titulo);
                exito = true;
            } else {
                System.out.println("❌ Pelicula no encontrada: id=" + peliculaId);
            }
        } catch (Exception ex) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error eliminarPelicula: " + ex.getMessage());
        } finally {
            session.close();
        }
        return exito;
    }

    public boolean eliminarCritica(Long criticaId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        boolean exito = false;
        try {
            tx = session.beginTransaction();
            Critica c = session.get(Critica.class, criticaId);
            if (c != null) {
                session.remove(c);
                tx.commit();
                System.out.println("🗑️ Crítica eliminada: id=" + criticaId);
                exito = true;
            } else {
                System.out.println("❌ Crítica no encontrada: id=" + criticaId);
            }
        } catch (Exception ex) {
            if (tx != null) tx.rollback();
            System.err.println("❌ Error eliminarCritica: " + ex.getMessage());
        } finally {
            session.close();
        }
        return exito;
    }

    // ==================== CONSULTA AVANZADA (JPQL) ====================

    public List<Pelicula> findByAnioMayorQue(int anio) {
        Session session = sessionFactory.openSession();
        List<Pelicula> results = null;
        try {
            String jpql = "SELECT p FROM Pelicula p WHERE p.anioLanzamiento > :anio";
            results = session.createQuery(jpql, Pelicula.class)
                    .setParameter("anio", anio)
                    .getResultList();

            System.out.println("🔍 Películas encontradas con año > " + anio + ": " + results.size());
        } catch (Exception ex) {
            System.err.println("❌ Error findByAnioMayorQue: " + ex.getMessage());
        } finally {
            session.close();
        }
        return results;
    }
}
