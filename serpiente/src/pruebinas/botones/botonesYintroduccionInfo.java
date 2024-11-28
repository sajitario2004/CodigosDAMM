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
    JFrame ventanaPrincipal = new JFrame();

    //ventana 1
    JButton botonVentana11;
    JButton botonVentana12;
    JColorChooser colorChooserVentana1;
    JFormattedTextField textVentana1;
    JFrame ventana1 = new JFrame();

    //ventana 2
    JButton botonVentana21;
    JButton botonVentana22;
    JTextField textVentana2;
    JFileChooser fileChooserVentana2;
    JFrame ventana2 = new JFrame();


    public botonesYintroduccionInfo() {

        ventanaPrincipal.setSize(660, 300);
        ventanaPrincipal.setLayout(null);


        ventana1.setSize(600, 700);
        ventana1.setLayout(null);


        ventana2.setSize(600, 300);
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
        botonVentana11.setBounds(10,10,300,50);
        botonVentana11.addActionListener(this);
        ventana1.add(botonVentana11);

        botonVentana12 = new JButton("Este TAMPOCO hace nada");
        botonVentana12.setBounds(320,10,300,50);
        botonVentana12.addActionListener(this);
        ventana1.add(botonVentana12);

        colorChooserVentana1 = new JColorChooser();
        colorChooserVentana1.setBounds(150,150,300,300);
        colorChooserVentana1.setBackground(Color.RED);
        ventana1.add(colorChooserVentana1);

        ventana1.setVisible(false);
        ventana1.setLayout(null);

        // apunte he pensado que con un Color.getColor(respuestaAunaPregunta.toUpercase)
        botonVentana21 = new JButton("Este no hace nada");
        botonVentana21.setBounds(10,100,300,50);
        botonVentana21.addActionListener(this);
        ventana2.add(botonVentana21);

        botonVentana22 = new JButton("Este TAMPOCO hace nada");
        botonVentana22.setBounds(320,100,300,50);
        botonVentana22.addActionListener(this);
        ventana2.add(botonVentana22);

        textVentana2 = new JTextField();
        textVentana2.setBounds(200,10,200,50);
        ventana2.add(textVentana2);

        fileChooserVentana2 = new JFileChooser();
        fileChooserVentana2.setBounds(200,250,200,50);
        ventana2.add(fileChooserVentana2);


    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == abrirVentana1){
            ventanaPrinci = false;
            ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //ventana1.
            ventana1.setVisible(true);
        }

        if (e.getSource() == abrirVentana2){
            ventanaPrinci = false;
            ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana2.setVisible(true);
        }
    }


    public static void main(String[] args) {
        new botonesYintroduccionInfo();
    }
}
