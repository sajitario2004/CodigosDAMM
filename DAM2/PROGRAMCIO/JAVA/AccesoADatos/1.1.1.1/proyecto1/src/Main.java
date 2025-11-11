
import java.io.File;
import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 * 
 Ahora toca poner en práctica todo lo aprendido. Imagina que trabajas para una empresa tecnológica y 
necesitas crear un prototipo de gestor de archivos que permita:

🏗️ Crear ficheros y carpetas con un solo comando
✏️ Renombrar nombres o mover archivos entre carpetas
🗑️ Eliminar archivos de forma segura
📋 Listar el contenido con filtros por extensión
Este proyecto simulará las funcionalidades básicas de servicios como Google Drive o Dropbox, 
pero trabajando localmente, es una excelente oportunidad para consolidar tus conocimientos y 
enfrentarte a desafíos reales de gestión de ficheros en Java. ¡Vamos al lío!
 */


public class Main {

    public static Scanner sc= new Scanner(System.in);
    private static int cantimplora;


    public static void main(String[] args) {
        
        try {
        mostrarMenu();
        } catch (Exception e){
            System.out.println("El erro es: " + e);
        }
    }

    public static void mostrarMenu(){
        System.out.println("Seleccione una opción:");
        System.out.println("1. Crear fichero");
        System.out.println("2. Crear carpeta");
        System.out.println("3. Eliminar archivo");
        System.out.println("4. Listar contenido");
        System.out.println("5. Cambiar nombre");
        System.out.println("0. Salir");
        cantimplora = sc.nextInt();
        

        switch (cantimplora) {
            case 1 -> crearFichero();
            case 2 -> crearCarpeta();
            case 3 -> eliminarArchivo();
            case 4 -> listarContenido();
            case 5 -> cambiarNombre();
            case 0 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción no válida");
        }

        if (cantimplora != 0) {
            mostrarMenu();
        } 
    }

    public static void crearFichero() {
        try {
            System.out.println("Introduce el nombre que le quieras dar a el archivo: ");
            File archivo = new File(sc.next());
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
                System.out.println("Ruta absoluta: " + archivo.getAbsolutePath()+"\n");
            } else {
                System.out.println("El archivo ya existe."+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void crearCarpeta() {
        
            
            File dir = new File(sc.next());
            if (dir.mkdir()) {
                System.out.println("Carpeta creada: " + dir.getName());
            } else {
                System.out.println("No se pudo crear la carpeta.");
            }

        

    }
    
    public static void eliminarArchivo() {

    }
    
    public static void listarContenido() {
        try {
            System.out.println("por que extension quieres filtrar: ");
            String carpetSTR = sc.next();
            //String[] txtFiles = carpeta.list((dir, name) -> name.endsWith(".txt"));
        } catch (Exception e) {

        }
       
    }
    

    public static void cambiarNombre(){
        try {
            Path origen = Paths.get(sc.next());
            Path destino = Paths.get(sc.next());   
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
