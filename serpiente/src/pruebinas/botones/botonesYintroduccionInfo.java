package pruebinas.botones;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class botonesYintroduccionInfo extends JFrame implements ActionListener {
    //Constructores
    JButton abrirVentana1;
    JButton abrirVentana2;
    JLabel textoVentana1;
    Boolean ventanaPrinci = true;

    //ventana 1
    JButton botonVentana11;
    JButton botonVentana12;
    JColorChooser colorChooserVentana1;
    JFormattedTextField textVentana1;

    //ventana 2
    JButton botonVentana21;
    JButton botonVentana22;
    JTextField textVentana2;
    JFileChooser fileChooserVentana1;


    public botonesYintroduccionInfo() {
        JFrame ventanaPrincipal = new JFrame();
        ventanaPrincipal.setSize(660, 300);
        ventanaPrincipal.setLayout(null);

        JFrame ventana1 = new JFrame();
        ventana1.setSize(300, 600);
        ventana1.setLayout(null);

        JFrame ventana2 = new JFrame();
        ventana2.setSize(600, 1500);
        ventana2.setLayout(null);

        //Ventana principal

        abrirVentana1 = new JButton("abrir ventana 1 con colores");
        abrirVentana1.setBounds(10,150,300,50);
        ventanaPrincipal.add(abrirVentana1);
        abrirVentana1.addActionListener(this);


        abrirVentana2 = new JButton("abrir ventana 2 texto y selector de ficheros");
        abrirVentana2.setBounds(350,150,300,50);
        ventanaPrincipal.add(abrirVentana2);
        abrirVentana2.addActionListener(this);


        textoVentana1 = new JLabel();
        textoVentana1.setBounds(100,10,300,50);
        textoVentana1.setText("Elija la ventana a la que desea viajar");

        ventanaPrincipal.add(textoVentana1);

        ventanaPrincipal.setVisible(ventanaPrinci);


        //Ventana 1 con colores y demas movidad
        botonVentana11 = new JButton("Este no hace nada");
        botonVentana11.setBounds(10,100,300,50);
        botonVentana11.addActionListener(this);
        ventana1.add(botonVentana11);

        botonVentana12 = new JButton("Este no hace nada");
        botonVentana12.setBounds(320,100,300,50);
        botonVentana12.addActionListener(this);
        ventana1.add(botonVentana12);

        colorChooserVentana1 = new JColorChooser();
        colorChooserVentana1.setBackground(Color.RED);
        colorChooserVentana1.setForeground(Color.WHITE);
        ventana1.add(colorChooserVentana1);
        // apunte he pensado que con un Color.getColor(respuestaAunaPregunta.toUpercase)



    }

    public static boolean preguntaVentana(){
        if (true){
            return true;
        }else if (true){
            return true;
        }
        return false;
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == abrirVentana1){
            ventanaPrinci = false;
        }
    }

    public static boolean pregunta(){
    return false;
    }

    public static void main(String[] args) {
        new botonesYintroduccionInfo();
    }
}
