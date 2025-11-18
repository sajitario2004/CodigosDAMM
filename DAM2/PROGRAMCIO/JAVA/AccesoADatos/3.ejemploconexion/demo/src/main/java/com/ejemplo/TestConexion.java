package com.ejemplo;

import com.ejemplo.util.HibernateUtil;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

public class TestConexion {

    public static void main(String[] args) {

        SessionFactory sessionFactory = null;

        Session session = null;

        try {

            // Obtener la SessionFactory

            sessionFactory = HibernateUtil.getSessionFactory();

            System.out.println("✓ SessionFactory creada correctamente");

            // Abrir una sesión

            session = sessionFactory.openSession();

            System.out.println("✓ Sesión abierta correctamente");

            // Hacer una query simple para verificar conexión

            String sql = "SELECT 1";

            Integer resultado = (Integer) session

                    .createNativeQuery(sql, Integer.class)

                    .getSingleResult();

            System.out.println("✓ Conexión a BD verificada: " + resultado);

            System.out.println("\n¡Todo funciona perfectamente!");

        } catch (Exception e) {

            System.err.println("✗ Error en la conexión:");

            e.printStackTrace();

        } finally {

            if (session != null) {

                session.close();

            }

            HibernateUtil.shutdown();

        }

    }

}
