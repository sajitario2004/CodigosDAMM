package edu.dam.app;


import java.util.Scanner;

import edu.dam.dao.DispositivoDAO;
import edu.dam.model.Dispositivo;
import edu.dam.util.Conexion;;


public class App 
{
    public static Scanner sc = new Scanner(System.in);
    public static DispositivoDAO dso = new DispositivoDAO();
    public static void main( String[] args )
    {
        Conexion.iniciar();
        int num = 1;
        while ( num!=6 || num<1 || num>6 ) {
            System.out.println("\nElije una opcion: "+
                                "\n1. Añadir dispositivo"+
                                "\n2. Listar dispositivo"+
                                "\n3. Buscar por categoria y rango de precio"+
                                "\n4. Actualizar precio/stock"+
                                "\n5. Eliminar dispositivo"+
                                "\n6. Salir\n");

            switch (sc.nextInt()) {
                case 1:
                    insertar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    buscar();
                    break;
                case 4:
                    actualizar();
                break;
                    case 5:
                    eliminar();
                break;
                    case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("No sé cómo has llegado hasta aquí");

            }

        }

        System.out.println("Saliendo del programa. ");

    }

    public static void insertar(){
        System.out.println("Nombre:");
        String n = sc.next();
        System.out.println("Categoria: ");
        String c = sc.next();
        System.out.println("Precio: ");
        double p = sc.nextDouble();
        System.out.println("Stock: ");
        int s = sc.nextInt();
        Dispositivo ds = new Dispositivo(n,c,p,s);
        try {
            dso.insertarDispositivo(ds);
        } catch (Exception e) {
            System.err.println("Ha habido un erro: "+e.getMessage());
        }
    }

    public static void listar(){
        try{
            dso.listarDispositivos();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void buscar(){
        try {
            System.out.println("Introduzca la categoria el precio minimo y el precio maximo (en ese orden): ");
            dso.buscarPorCategoria_RangoPrecio(sc.next(), sc.nextDouble(), sc.nextDouble());
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public static void actualizar(){
        try {
            System.out.println("Dime la columna que quieres editar (stock/precio): ");
            String colum = sc.next().trim();
            System.out.println("Dime el id de la columna que deseas cambiar: ");
            int cant = sc.nextInt();
            dso.actualizar(colum, cant);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void eliminar(){
        try {
            System.out.println("Dime el id de el dispositivo que quieres eliminar: ");
            dso.eliminar(sc.nextInt());
        } catch (Exception e) {
            System.out.println(e);    
        }
    }
}
