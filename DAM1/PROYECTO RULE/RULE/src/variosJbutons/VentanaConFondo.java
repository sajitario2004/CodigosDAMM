package variosJbutons;
import javax.swing.*;
import java.awt.*;

public class VentanaConFondo extends JFrame {

    private Image imagenFondo;

    public VentanaConFondo() {
        // Tamaño y formato de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1800, 1000);
        setLayout(null); // Usamos null layout para controlar manualmente la ubicación

        // Cargar la imagen de fondo
        //imagenFondo = new ImageIcon("../RULEFOTO.jpg").getImage();
        ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/imgs/RULEFOTO.jpg"));

        // Hacer visible la ventana
        setVisible(true);
    }

    // Sobrescribir el método paint para dibujar la imagen de fondo
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(imagenFondo, 0, 0, this); // Dibujar la imagen en el fondo
    }

    public static void main(String[] args) {
        new VentanaConFondo();
    }
}