package edu.dam.app;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

import edu.dam.dao.DispositivosDAO;
import edu.dam.model.Dispositivos;
import edu.dam.util.DatabaseConnection;

public class App 
{
    public static Scanner sc = new Scanner(System.in);
    public static DispositivosDAO dso = new DispositivosDAO();
    public static void main( String[] args ){
        DatabaseConnection.iniciar();
        int num = 1;

        while (num != 6 || num > 6 || num < 1) {
            System.out.println("Introduce una opcion: "+
            "\n 1. Añadir Dispositivo"+
            "\n 2. Listar Dispositivo"+
            "\n 3. Buscar Por Categoria"+
            "\n 4. Actualizar precio/stock"+
            "\n 5. Eliminar dispostivo"+
            "\n 6. salir");
            switch (sc.nextInt()) {
                case 1 -> insertar();
                case 2 -> listar();
                case 3 -> buscar();
                case 4 -> actualizar();
                case 5 -> eliminar();
                case 6 -> salir();
                default -> salir();

            }
        }
        
    }

    public static void insertar(){
        System.out.println("Digame el nombre del dispositivo: ");
        String n = sc.next();
        System.out.println("Digame la categoria del dispositivo");
        String c = sc.next();
        System.out.println("Digame el precio del dispositivo");
        double p = sc.nextDouble();
        System.out.println("Digame el stock del dispositivo");
        int s = sc.nextInt();
        Dispositivos d = new Dispositivos(n,c,p,s);
        try {
            dso.insertarDispositivo(d);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void listar(){
        try {
            dso.listarDispositivos();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void actualizar(){
        try {
            System.out.println("Digame el id del dispositivo: ");
            Dispositivos d = dso.buscarDispositivoID(sc.nextInt());
            System.out.println("Digame el nuevo stock: ");
            d.setStock(sc.nextInt());
            System.out.println("Digame el nuevo precio: ");
            d.setPrecio(sc.nextDouble());
            dso.actualizarDispositivos(d);
        } catch (Exception e) {
            System.out.println(e);    
        }
    }

    public static void eliminar(){
        try {
            System.out.println("Digame el id del dispositivo que desea eliminar: ");
            
            dso.eliminarDispositivo(sc.nextInt());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void buscar(){
        try {
            System.out.println("Digame la categoria: ");
            String c = sc.next();
            System.out.println("Digame el precio minimo: ");
            double pmin = sc.nextDouble();
            System.out.println("Digame el precio maximo: ");
            double pmax = sc.nextDouble();
            dso.buscarPorCategoriayRangoPrecio(c, pmin, pmax);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void salir(){
        System.out.println("Saliendo del programa ...");
        sc.close();
        System.exit(0);
    }
}
