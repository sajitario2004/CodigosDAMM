package pruebinas.botones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class botones100 {
    public static void main(String[] args) {
            // Crear el marco (ventana)
            JFrame frame = new JFrame("Cuadrícula de Botones");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout()); // Usar BorderLayout para organizar componentes

            // Crear un panel para la cuadrícula de botones
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new GridLayout(10, 10)); // Crear un GridLayout de 10 filas y 10 columnas

            // Crear etiquetas para mostrar información
            JLabel topLabel = new JLabel("Presiona un botón", SwingConstants.CENTER);
            JLabel bottomLabel = new JLabel("Acciones realizadas aparecerán aquí", SwingConstants.CENTER);

            // Crear los botones
            for (int i = 1; i <= 100; i++) {
                JButton button = new JButton("Botón " + i);
                button.setPreferredSize(new Dimension(80, 80)); // Establecer tamaño preferido

                // Definir una acción diferente para cada botón
                final int index = i; // Necesitamos hacer la variable final para usarla en el ActionListener
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Acción diferente para cada botón
                        System.out.println("Has presionado el " + button.getText());
                        bottomLabel.setText("Has presionado el " + button.getText());
                        // Aquí puedes agregar más lógica específica para cada botón
                        switch (index) {
                            case 1:
                                System.out.println("Acción para el Botón 1");
                                break;
                            case 2:
                                System.out.println("Acción para el Botón 2");
                                break;
                            // Agrega más casos según sea necesario
                            case 100:
                                System.out.println("Acción para el Botón 100");
                                break;
                            default:
                                System.out.println("Acción para el Botón " + index);
                                break;
                        }
                    }
                });
                buttonPanel.add(button); // Agregar el botón al panel
            }

            // Agregar componentes al marco
            frame.add(topLabel, BorderLayout.NORTH); // Etiqueta en la parte superior
            frame.add(buttonPanel, BorderLayout.CENTER); // Panel de botones en el centro
            frame.add(bottomLabel, BorderLayout.SOUTH); // Etiqueta en la parte inferior

            // Configurar el tamaño de la ventana y hacerla visible
            frame.setSize(800, 800); // Ajustar el tamaño de la ventana
            frame.setVisible(true);
        }

}
