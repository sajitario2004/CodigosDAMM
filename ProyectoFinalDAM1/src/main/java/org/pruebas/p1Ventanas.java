package org.pruebas;
import java.awt.*;

public class p1Ventanas {
    public static void main(String[] args) {
        // Obtener el Toolkit por defecto
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Obtener el tamaño de la pantalla
        Dimension screenSize = toolkit.getScreenSize();

        int tamanoPantallaX = screenSize.width ;
        int tamanoPantallaY = screenSize.height ;

        System.out.println("El tamaño de la pantalla en el eje x es de "+tamanoPantallaX + " y la altura y de la pantalla es  " + tamanoPantallaY);
    }
}
