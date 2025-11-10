package edu.dam.dao;

import java.sql.SQLException;
import java.sql.*;


import edu.dam.model.*;
import edu.dam.util.*;

import edu.dam.app.*;

public class DispositivoDAO {


    public void insertarDispositivo(Dispositivo d) throws SQLException{
        String sql = "INSERT INTO dispositivos(nombre, categoria, precio, stock) VALUES (?, ?, ?, ?);";

        try (Connection c = Conexion.getConection()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, d.getNombre());
            ps.setString(2, d.getCategoria());
            ps.setDouble(3, d.getPrecio());
            ps.setInt(4, d.getStock());
            ps.execute();
            c.close();
            System.out.println("Se introdujo de manera correcta el dispositivo en la base de datos");
        } catch (Exception e) {
            System.out.println("El insert ha fallado por el error: "+ e.getMessage());
        } 
    }

    public void listarDispositivos() throws SQLException{
        String sql = "SELECT * FROM dispositivos;";

        try(Connection c = Conexion.getConection()){
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
                Dispositivo ds = new Dispositivo(id, nombre, categoria, precio, stock);
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

    public void buscarPorCategoria_RangoPrecio(String categ, double rangoMin, double rangoMax){
        String sql = "SELECT * FROM dispositivos;";
        
        try(Connection c = Conexion.getConection()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            boolean comprob = false;
            System.out.println("Aqui los tienes filtrados: ");

            while (rs.next()) {
                if (rs.getString("categoria").equalsIgnoreCase(categ)) {
                    double precio = rs.getDouble("precio");
                    if (precio >=rangoMin && precio <= rangoMax) {
                        String n = rs.getString("nombre");
                        int s = rs.getInt("stock");
                        Dispositivo ds = new Dispositivo(n,categ,precio,s);
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

    public void actualizar(String colum, int id){
        String sql = null;
        if (colum.equalsIgnoreCase("stock")){
            sql = "UPDATE dispositivos SET stock = ? WHERE id = ?;";

        }else if(colum.equalsIgnoreCase("precio")){
            sql = "UPDATE dispositivos SET precio = ? WHERE id = ?;";
        }else{
            System.out.println("La columna seleccionada no es ninguna de las mencionadas");
        }

        try (Connection c = Conexion.getConection()){
            if (sql != null){
                PreparedStatement ps = c.prepareStatement(sql);
                if (colum.equalsIgnoreCase("stock")) {
                    System.out.println("Dime la nueva cantidad del stock: ");
                    int st = App.sc.nextInt();
                    ps.setInt(1, st);
                }else if(colum.equalsIgnoreCase("precio")){
                    System.out.println("Dime el nuevo precio: ");
                    double preci = App.sc.nextInt();
                    ps.setDouble(1, preci);
                }
                ps.setInt(2, id);
                ps.execute();
                System.out.println("Se ejecuto correctamente el update.");
            }else {
                System.out.println("La orden es nula por que no ha llegado la informacion.");
            }
            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void eliminar(int id){
        String sql = "DELETE FROM dispositivos WHERE id = ?;";

        try (Connection c = Conexion.getConection()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            System.out.println("Se elimino correctamente el dispositivo ");
            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }


}
