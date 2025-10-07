import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Texto de entrada
            Scanner input = new Scanner(System.in);
            String texto = "hola mundo desde java";

            // Creamos el proceso que ejecutará: tr a-z A-Z
            ProcessBuilder pb = new ProcessBuilder("tr", "a-z", "A-Z");
            Process proceso = pb.start();

            // Escribimos el texto al proceso (entrada estándar)
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(proceso.getOutputStream()));
            writer.write(texto);
            writer.close();

            // Leemos la salida (texto transformado)
            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            System.out.println("Texto convertido con tr:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            // Esperamos que el proceso termine
            proceso.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
