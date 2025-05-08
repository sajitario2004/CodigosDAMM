package org.minijuego;

import org.jnativehook.keyboard.NativeKeyListener;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
//imports del Listener
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

//Listener del teclado
import org.jnativehook.keyboard.NativeKeyEvent;

public class minijuego2 extends JFrame implements ActionListener, NativeKeyListener {
    JFrame vMinijuego = new JFrame();
    //salir
    JButton bSalir = new JButton();
    //fondo
    JPanel contentPane;
    Image backgroundImage = null;
    //punto blanco
    JLabel jugador = new JLabel();
    ImageIcon jImage=null;



    public minijuego2(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int tamanoX = screenSize.width ;
        int tamanoY = screenSize.height ;
        vMinijuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vMinijuego.setTitle("Minijuego");
        vMinijuego.setBounds(0, 0, tamanoX, tamanoY);

        // Cargar la imagen de fondo
        try {
            backgroundImage = ImageIO.read(getClass().getResource("/negro.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
            backgroundImage = null;
        }

        //JPanel

        contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        contentPane.setLayout(null);

        //boton salir
        // Configuración del botón de salida
        bSalir.addActionListener(this);
        bSalir.setText(""); // Asegúrate de que el botón tenga texto
        int cSalidaX = tamanoX - 100;
        int cSalidaY = 0;
        int tSalidaX = tamanoX * 6 / 100;
        int tSalidaY = tamanoY * 6 / 100;
        bSalir.setBounds(cSalidaX, cSalidaY, tSalidaX, tSalidaY);
        bSalir.setBackground(Color.RED);
        bSalir.setForeground(Color.WHITE);

        // Añadir MouseListener para el botón
        bSalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                bSalir.setBackground(new Color(138, 0, 0));
                bSalir.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                bSalir.setBackground(Color.RED);
                bSalir.setForeground(Color.WHITE);
            }
        });

        //jugador
        jImage = new ImageIcon(getClass().getResource("/blanco.png"));

        jugador.setSize(20,20);
        jugador.setLocation(tamanoX/2,tamanoY/2 );

        jugador.setIcon(jImage);


        // Añadir el botón al panel de contenido
        contentPane.add(bSalir);
        contentPane.add(jugador);

        vMinijuego.setContentPane(contentPane);

        vMinijuego.setVisible(true);


    }

    public static void main(String[] args) {

        try {
            GlobalScreen.registerNativeHook();
            GlobalScreen.addNativeKeyListener(new minijuego2());
        } catch (NativeHookException e) {
            System.err.println("ha ocurrido un error con la aplicacion. Tipo de error:" + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bSalir) {
            System.exit(0);
        }if (e.getSource() == jugador) {

        }
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent) {
        if(nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_W || nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_UP){
            if(jugador.getY()>0) {
                jugador.setLocation(jugador.getX(), jugador.getY() - 10);
                vMinijuego.repaint();
            }
        } else if (nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_A || nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_LEFT) {
            if(jugador.getX()>0){
            jugador.setLocation(jugador.getX()-10,jugador.getY());
            vMinijuego.repaint();
             }
        } else if (nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_S || nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_DOWN) {
            jugador.setLocation(jugador.getX(),jugador.getY()+10);
            vMinijuego.repaint();
        } else if (nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_D || nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_RIGHT) {
            jugador.setLocation(jugador.getX()+10,jugador.getY());
            vMinijuego.repaint();
        } else if (nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_W && nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_A) {
            jugador.setLocation(jugador.getX()-10,jugador.getY()-10);
        } else if (nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_W && nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_D) {
            jugador.setLocation(jugador.getX() + 10, jugador.getY() - 10);
        } else if (nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_S && nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_A) {
            jugador.setLocation(jugador.getX()-10,jugador.getY()+10);
        } else if (nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_S && nativeKeyEvent.getKeyCode()==NativeKeyEvent.VC_D) {
            jugador.setLocation(jugador.getX()+10,jugador.getY()+10);
        }

        vMinijuego.repaint();
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent) {

    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent) {

    }
}
