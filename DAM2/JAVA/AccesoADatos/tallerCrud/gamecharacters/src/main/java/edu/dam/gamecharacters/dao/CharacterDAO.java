package edu.dam.gamecharacters.dao;

import edu.dam.gamecharacters.model.Character;
import edu.dam.gamecharacters.util.ConexionSQLite;
import java.sql.*;
import java.util.*;

public class CharacterDAO {

    /**
     * CREATE - Insertar un nuevo personaje
     */
    public void insertar(Character personaje) throws SQLException {
        String sql = "INSERT INTO personajes(nombre, clase, nivel, puntos_vida) VALUES(?, ?, ?, ?)";
        try (Connection conn = ConexionSQLite.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, personaje.getNombre());
            ps.setString(2, personaje.getClase());
            ps.setInt(3, personaje.getNivel());
            ps.setInt(4, personaje.getPuntosVida());
            ps.executeUpdate();
            System.out.println("✨ Personaje creado: " + personaje.getNombre());
        }
    }

    /**
     * READ - Listar todos los personajes
     */
    public List<Character> listar() throws SQLException {
        List<Character> lista = new ArrayList<>();
        String sql = "SELECT * FROM personajes";
        try (Connection conn = ConexionSQLite.conectar();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Character personaje = new Character();
                personaje.setId(rs.getInt("id"));
                personaje.setNombre(rs.getString("nombre"));
                personaje.setClase(rs.getString("clase"));
                personaje.setNivel(rs.getInt("nivel"));
                personaje.setPuntosVida(rs.getInt("puntos_vida"));
                lista.add(personaje);
            }
        }
        return lista;
    }

    /**
     * UPDATE - Actualizar nivel y puntos de vida
     */
    public void actualizar(Character personaje) throws SQLException {
        String sql = "UPDATE personajes SET nivel = ?, puntos_vida = ? WHERE id = ?";
        try (Connection conn = ConexionSQLite.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, personaje.getNivel());
            ps.setInt(2, personaje.getPuntosVida());
            ps.setInt(3, personaje.getId());
            ps.executeUpdate();
            System.out.println("⬆️ Personaje actualizado: " + personaje.getNombre());
        }
    }

    /**
     * DELETE - Eliminar un personaje por ID
     */
    public void eliminar(int id) throws SQLException {
        String sql = "DELETE FROM personajes WHERE id = ?";
        try (Connection conn = ConexionSQLite.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("💀 Personaje eliminado (ID: " + id + ")");
        }
    }
}