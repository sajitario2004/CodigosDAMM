package com.ejemplo;

import com.ejemplo.model.Usuario;

import com.ejemplo.util.HibernateUtil;

import org.hibernate.Session;

import org.hibernate.Transaction;

public class TestEntidad {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            
            // Crear y guardar un usuario
            Usuario usuario = new Usuario("Ana García", "ana@ejemplo.com");
            session.persist(usuario);
            transaction.commit();
            System.out.println("✓ Usuario guardado: " + usuario);

            // Recuperar el usuario
            Usuario recuperado = session.get(Usuario.class, usuario.getId());
            System.out.println("✓ Usuario recuperado: " + recuperado);

        } catch (Exception e) {

            if (transaction != null)
                transaction.rollback();
            e.printStackTrace();

        } finally {
            session.close();
            HibernateUtil.shutdown();

        }

    }

}