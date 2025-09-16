package org.example.pruebinas.botones;

import org.jnativehook.GlobalScreen;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class botonJNATIVEHOOK implements NativeMouseListener {
    private JButton[] buttons = new JButton[100];
    private JLabel bottomLabel;

    public static void main(String[] args) {
        new botonJNATIVEHOOK().createAndShowGUI();
    }

    private void createAndShowGUI() {
        // Crear el marco (ventana)
        JFrame frame = new JFrame("Cuadrícula de Botones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Crear un panel para la cuadrícula de botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(10, 10));

        // Crear etiquetas para mostrar información
        JLabel topLabel = new JLabel("Presiona un botón", SwingConstants.CENTER);
        bottomLabel = new JLabel("Acciones realizadas aparecerán aquí", SwingConstants.CENTER);

        // Crear los botones
        for (int i = 0; i < 100; i++) {
            buttons[i] = new JButton("Botón " + (i + 1));
            buttons[i].setPreferredSize(new Dimension(80, 80));
            final int index = i; // Necesitamos hacer la variable final para usarla en el ActionListener

            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonAction(index);
                }
            });

            buttonPanel.add(buttons[i]);
        }

        // Agregar componentes al marco
        frame.add(topLabel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(bottomLabel, BorderLayout.SOUTH);

        // Configurar el tamaño de la ventana y hacerla visible
        frame.setSize(800, 800);
        frame.setVisible(true);

        // Iniciar JNativeHook
        try {
            GlobalScreen.registerNativeHook();
            GlobalScreen.addNativeMouseListener(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buttonAction(int index) {
        // Acción para el botón
        String buttonText = buttons[index].getText();
        bottomLabel.setText("Has presionado el " + buttonText);
        System.out.println("Has presionado el " + buttonText);
    }

    @Override
    public void nativeMouseClicked(NativeMouseEvent e) {
        // Verificar si se hizo clic derecho
        if (e.getButton() == NativeMouseEvent.BUTTON2) {
            // Obtener la posición del ratón
            Point mousePoint = MouseInfo.getPointerInfo().getLocation();
            for (int i = 0; i < buttons.length; i++) {
                Rectangle buttonBounds = buttons[i].getBounds();
                // Convertir las coordenadas del ratón a las coordenadas del botón
                Point buttonLocation = buttons[i].getLocationOnScreen();
                if (buttonBounds.contains(mousePoint.x - buttonLocation.x, mousePoint.y - buttonLocation.y)) {
                    buttonAction(i); // Llamar a la acción del botón correspondiente
                    break;
                }
            }
        }
    }

    @Override
    public void nativeMousePressed(NativeMouseEvent e) {}

    @Override
    public void nativeMouseReleased(NativeMouseEvent e) {}

    // Asegúrate de desregistrar el hook al cerrar la aplicación
    public void cleanup() {
        try {
            GlobalScreen.unregisterNativeHook();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

