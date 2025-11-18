package com.ejemplo.util;

import org.hibernate.SessionFactory;

import org.hibernate.boot.Metadata;

import org.hibernate.boot.MetadataSources;

import org.hibernate.boot.registry.StandardServiceRegistry;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    // Instancia única de SessionFactory
    private static SessionFactory sessionFactory;
    // Bloque estático: se ejecuta una sola vez al cargar la clase
    static {
        try {
            // Construir el registro de servicios
            StandardServiceRegistry registry =
                    new StandardServiceRegistryBuilder()
                            .configure() // Lee hibernate.cfg.xml
                            .build();

            // Crear metadata y construir SessionFactory
            Metadata metadata = new MetadataSources(registry)
                    .getMetadataBuilder()
                    .build();
            sessionFactory = metadata.getSessionFactoryBuilder().build();

        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }

    }

    // Método público para obtener la SessionFactory

    public static SessionFactory getSessionFactory() {
        return sessionFactory;

    }

    // Método para cerrar la SessionFactory al terminar

    public static void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();

        }
    }

}