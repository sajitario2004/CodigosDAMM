package pruebinas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pruebaTempo extends JFrame {
    private JLabel labelTiempo;
    private JButton botonIniciar, botonDetener;
    private Timer timer;
    private int segundos = 0;

    public pruebaTempo() {
        // Configuración de la ventana principal
        setTitle("Cronómetro");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Crear el JLabel para mostrar el tiempo
        labelTiempo = new JLabel("Tiempo: 0 segundos");
        labelTiempo.setFont(new Font("Arial", Font.PLAIN, 20));
        add(labelTiempo);

        // Crear botón para iniciar el cronómetro
        botonIniciar = new JButton("Iniciar");
        add(botonIniciar);

        // Crear botón para detener el cronómetro
        botonDetener = new JButton("Detener");
        botonDetener.setEnabled(false);  // Al principio no se puede detener, sólo iniciar
        add(botonDetener);

        // Timer para el cronómetro
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundos++;
                labelTiempo.setText("Tiempo: " + segundos + " segundos");
            }
        });

        // Acción del botón Iniciar
        botonIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start(); // Iniciar el cronómetro
                botonIniciar.setEnabled(false);  // Desactivar el botón de iniciar
                botonDetener.setEnabled(true);  // Activar el botón de detener
            }
        });

        // Acción del botón Detener
        botonDetener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop(); // Detener el cronómetro
                botonIniciar.setEnabled(true);  // Activar el botón de iniciar
                botonDetener.setEnabled(false);  // Desactivar el botón de detener
            }
        });

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar el cronómetro en el hilo de la interfaz gráfica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new pruebaTempo();
            }
        });
    }
}
