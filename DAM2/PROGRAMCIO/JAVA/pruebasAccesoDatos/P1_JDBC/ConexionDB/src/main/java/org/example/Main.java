package org.example;

import java.sql.*;
import java.util.Scanner;

import static org.example.crud.JugadorCRUD.*;

public class Main {

    //muy importante profe nada de esto funcionara si no se ha ejecutado el script y tiene que tener la el usuario
    // "prueba" con la contraseña "1234"
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n CRUD Jugadores ");
            System.out.println("1.Insertar jugador");
            System.out.println("2.Mostrar jugadores");
            System.out.println("3.Actualizar jugador");
            System.out.println("4.Eliminar jugador");
            System.out.println("0.Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> insertarJugador();
                case 2 -> mostrarJugadores();
                case 3 -> actualizarJugador();
                case 4 -> eliminarJugador();
                case 0 -> System.out.println("Saliendo");
                default -> System.out.println("Opción no valida.");
            }
        } while (opcion != 0);
    }



}