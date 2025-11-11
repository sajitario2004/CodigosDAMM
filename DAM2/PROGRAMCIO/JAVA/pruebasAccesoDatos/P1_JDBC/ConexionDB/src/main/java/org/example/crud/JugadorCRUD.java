package org.example.crud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JugadorCRUD {

    public static Scanner sc = new Scanner(System.in);

    public static void insertarJugador() {
        System.out.print("Introduce el nombre del jugador: ");
        String nombre = sc.nextLine();
        String sql = "INSERT INTO informacion_jugador (nombre_jugador) VALUES (?)";

        try (Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.executeUpdate();
            System.out.println("jugador insertado correctamente");

        } catch (SQLException e) {
            System.out.println("error al insertar jugador:");
            e.printStackTrace();
        }
    }

    public static void mostrarJugadores() {
        String sql = "SELECT * FROM informacion_jugador";
        List<Jugador> lista = new ArrayList<>();

        try (Connection con = ConexionBD.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Jugador(rs.getString("nombre_jugador")));
            }

            if (lista.isEmpty()) {
                System.out.println("No hay jugadores registrados.");
            } else {
                System.out.println("\nLista de Jugadores ");
                for (Jugador j : lista) {
                    System.out.println(j);
                }
            }

        } catch (SQLException e) {
            System.out.println(" Error al mostrar jugadores:");
            e.printStackTrace();

        }
    }

    public static void actualizarJugador() {
        System.out.print("Introduce el nombre actual del jugador: ");
        String nombreViejo = sc.nextLine();
        System.out.print("Introduce el nuevo nombre: ");
        String nombreNuevo = sc.nextLine();

        String sql = "UPDATE informacion_jugador SET nombre_jugador = ? WHERE nombre_jugador = ?";

        try (Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombreNuevo);
            ps.setString(2, nombreViejo);

            //esto lo he encontrado en un foro de redit que sirve para si devuelve 1 o 2 es que algo sale mal
            //pero si devuelve 0 es que no ha habido ningun problema con el update
            int filas = ps.executeUpdate();

            if (filas > 0)
                System.out.println("Jugador actualizado correctamente.");
            else
                System.out.println("No se encontro el jugador.");

        } catch (SQLException e) {
            System.out.println(" Error al actualizar jugador:");

            e.printStackTrace();

        }
    }

    public static void eliminarJugador() {
        System.out.print("Introduce el nombre del jugador a eliminar: ");
        String nombre = sc.nextLine();
        String sql = "DELETE FROM informacion_jugador WHERE nombre_jugador = ?";

        try (Connection con = ConexionBD.conectar();

             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            int filas = ps.executeUpdate();
            if (filas > 0)
                System.out.println("Jugador eliminado correctamente");
            else
                System.out.println("No se encontró el jugador");

        } catch (SQLException e) {
            System.out.println("Error al eliminar jugador:");
            e.printStackTrace();

        }
    }
}

