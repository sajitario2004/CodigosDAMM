package edu.dam.dao;


import java.net.ConnectException;
import java.nio.channels.Pipe.SourceChannel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import edu.dam.model.Dispositivos;
import edu.dam.util.*;
import edu.dam.app.App;

public class DispositivosDAO {
    
    public void insertarDispositivo(Dispositivos d)throws SQLException{
        String sql = "INSERT INTO dispositivos(nombre, categoria, precio, stock) VALUES (?,?,?,?); ";
        try(Connection c = DatabaseConnection.getConection()){
            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, d.getNombre());
            ps.setString(2, d.getCategoria());
            ps.setDouble(3, d.getPrecio());
            ps.setInt(4, d.getStock());

            ps.execute();

            System.out.println("Se inserto correctamente a la persona.");
            c.close();
        }catch(Exception e){
            
        }
    }

    public void actualizarDispositivos(Dispositivos d)throws SQLException{
        String sql = "UPDATE dispositivos SET precio = ?, stock = ? WHERE id = ?;";
        try (Connection c = DatabaseConnection.getConection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setDouble(1, d.getPrecio());
            ps.setInt(2, d.getStock());
            ps.setInt(3, d.getId());
            ps.executeUpdate();
            System.out.println("Se ejecuto correctamente el cambio");
            c.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public void eliminarDispositivo(int id)throws SQLException{
        String sql = "DELETE FROM dispositivos WHERE id = ?;";

        try (Connection c = DatabaseConnection.getConection()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            System.out.println("Se elimino correctamente el dispositivo ");
            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void listarDispositivos()throws SQLException{
        String sql = "SELECT * FROM dispositivos;";

        try(Connection c = DatabaseConnection.getConection()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            boolean comprob = false;

            while(rs.next()){
                comprob = true;
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String categoria = rs.getString("categoria");
                double precio = rs.getDouble("precio");
                int stock = rs.getInt("stock");
                Dispositivos ds = new Dispositivos(id, nombre, categoria, precio, stock);
                System.out.println(ds);
            }

            if (comprob == false){
                System.out.println("No hay resultado en la lista");
            }
            c.close();
        }catch (Exception e) {
            System.out.println("Ha habido un error y el erro es: \n"+e.getMessage()+"\n");
        }
    }

    public void buscarPorCategoriayRangoPrecio(String categoria, double precioMin, double precioMax)throws SQLException{
        String sql = "SELECT * FROM dispositivos;";
        
        try(Connection c = DatabaseConnection.getConection()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            boolean comprob = false;
            System.out.println("Aqui los tienes filtrados: ");

            while (rs.next()) {
                if (rs.getString("categoria").equalsIgnoreCase(categoria)) {
                    double precio = rs.getDouble("precio");
                    if (precio >=precioMin && precio <= precioMax) {
                        String n = rs.getString("nombre");
                        int s = rs.getInt("stock");
                        Dispositivos ds = new Dispositivos(n,categoria,precio,s);
                        System.out.println(ds);

                        comprob = true;
                    }
                }
            }

            if (comprob == false){
                System.out.println("No habia ningun dispositivo con esas caracteristicas");
            }
            c.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }



    // aparte que lo necesito
    public Dispositivos buscarDispositivoID(int id)throws SQLException{
        try (Connection c = DatabaseConnection.getConection()){
            Dispositivos d = new Dispositivos();

            PreparedStatement ps = c.prepareStatement("SELECT * FROM dispositivos;");
            ResultSet rs = ps.executeQuery();

            boolean comprob = false;
            while (rs.next()) {
                if (rs.getInt("id") == id){
                    d.setNombre(rs.getString("nombre"));
                    d.setCategoria(rs.getString("categoria"));
                    d.setPrecio(rs.getDouble("precio"));
                    d.setStock(rs.getInt("stock"));
                    comprob = true;
                }
            }

            if (comprob = true){
                System.out.println("Dispositivo encontrado");
            }else{
                System.out.println("El dispositivo no ha sido encontrado se devolvera null;");
            }
            c.close();
            return d;
        } catch (Exception e) {
            return null;
        }
    }
}
