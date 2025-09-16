package pruebinas.botonessimple;


    import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

    public class CambiarFuenteVariosBotones extends JFrame {

        private List<JButton> botones; // Lista para almacenar los botones

        public CambiarFuenteVariosBotones() {
            // Configuración básica del JFrame
            setTitle("Cambiar Fuente de Varios Botones");
            setSize(800, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            // Crear un panel para los botones
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(10, 10)); // Una cuadrícula de 10x10

            // Inicializar la lista de botones
            botones = new ArrayList<>();

            // Crear 100 botones y agregarlos al panel
            for (int i = 1; i <= 100; i++) {
                JButton boton = new JButton("Botón " + i);
                botones.add(boton); // Guardar en la lista
                panel.add(boton); // Agregar al panel
            }

            // Cambiar la fuente de todos los botones
            cambiarFuenteDeBotones(new Font("Arial", Font.BOLD, 14));

            // Agregar el panel al JFrame
            add(panel);
        }

        private void cambiarFuenteDeBotones(Font fuente) {
            for (JButton boton : botones) {
                boton.setFont(fuente);
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                new CambiarFuenteVariosBotones().setVisible(true);
            });
        }
    }


