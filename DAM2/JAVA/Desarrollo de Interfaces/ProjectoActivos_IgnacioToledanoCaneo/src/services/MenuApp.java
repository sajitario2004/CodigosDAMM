package services;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuApp {
    private List<Persona> personas;

    private Scanner sc;

    public MenuApp(List<Persona> personas) {
        this.personas = personas;
        this.sc = new Scanner(System.in);

    }

    public void iniciar() throws InterruptedException {
        int opcion;
        //Aqui ago un do while por que un while normal no entra si la variable opcion es 0 o null asi entra y pregunta
        //aun que sea una vez para ver que opcion tiene el cliente ( me pegue demasiado tiempo aqui)
        do {
            System.out.println("\nMENU PRINCIPAL");

            System.out.println("1.Listar todas las carteras");
            System.out.println("2.Ver detalles de una cartera (por DNI)");
            System.out.println("3.Quitar activo de una cartera");
            System.out.println("4.Actualizar activo de una cartera");
            System.out.println("5.Listar todos los ultimos precios y sus fechas de los activos");
            System.out.println("0.Salir");

            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    listarCarteras();
                    break;

                case 2:
                    verCarterasPorPersona();
                    break;

                case 3:
                    quitarActivo();
                    break;

                case 4:
                    actualizarActivo();
                    break;
                case 5:
                    verActivos();
                    break;

            }

            //He encontrado esto buscando como hacer una pausa para que al usuario le de tiempo a leer la informacion
            Thread.sleep(3000);

        } while (opcion != 0);
    }

    //lista todas las carteras de todas las personas
    private void listarCarteras() {
        for (Persona persona : personas) {
            persona.mostrarDetalles();

        }
    }

    //funcion que uso para buscar una persona atraves de el dni y que returna una variable tipo objeto Persona
    private Persona buscarPersona(String dni) {
        for (Persona persona : personas) {
            if (persona.getDni().equalsIgnoreCase(dni)) {
                return persona;
            }
        }
        return null;
    }

    // con esto veo las carteras de todas las personas y a quien pertenece cada cartera de cada persona
    private void verCarterasPorPersona() {
        System.out.print("Introduce DNI: ");
        String dni = sc.nextLine();
        Persona persona = buscarPersona(dni);

        if (persona != null) {
            persona.mostrarDetalles();
        } else {
            System.out.println("Persona no encontrada.\n");

        }

    }

    //Esta quita un activo de una persona.
    private void quitarActivo() {
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        Persona persona = buscarPersona(dni);

        if (persona != null) {
            for (Cartera cartera : persona.getCarteras()) {
                cartera.mostrarDetalles();
            }

            System.out.print("Ticker del activo a eliminar: ");
            String ticker = sc.nextLine();

            for (Cartera cartera : persona.getCarteras()) {
                cartera.removeActivo(ticker);
            }

            System.out.println("Activo eliminado.\n");
        }
    }

    //actualiza el precio de un activo pidiendo el dni y el nombre del activo para luego cambiarlo
    private void actualizarActivo() {
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        Persona persona = buscarPersona(dni);
        if (persona != null) {
            for (Cartera cartera : persona.getCarteras()) {
                cartera.mostrarDetalles();
            }
            System.out.print("Nombre del activo a actualizar: ");
            String nombre = sc.nextLine();
            for (Cartera cartera : persona.getCarteras()) {
                for (ActivoInversion activo : cartera.getActivos()) {
                    if (activo.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.print("Nuevo precio: ");
                        double precio = sc.nextDouble();

                        System.out.print("Fecha: ");
                        String fecha = sc.nextLine();
                        activo.setPrecioUltimo(precio, fecha);
                        System.out.println("Activo actualizado.\n");

                    }
                }
            }
        }
    }

    private void verActivos() {
        System.out.print("Los activos que ofrece nuestra empresa son: ");
        for (Persona persona : personas) {
            for (Cartera cartera : persona.getCarteras()) {
                for (ActivoInversion activo : cartera.getActivos()) {
                    System.out.println("Nombre del activo: " + activo.getNombre() + ". \n" +
                            "El precio del activo es: " + activo.getPrecioUltimo() + ".\n" +
                            "En la fecha " + activo.getFechaUltimoPrecio()+ " \n");

                }
            }
        }
    }
}