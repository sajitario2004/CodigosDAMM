package pruebinas.botones;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;


public class botones extends JFrame implements ActionListener {



       JButton boton1;
       JButton boton2;
       JButton boton3;
       JButton boton4;

       Boolean preguntaBoolean;

       public botones() {
           Scanner teclado = new Scanner(System.in);
           System.out.println("quieres imprimir la ventana");
           String pregunta = teclado.nextLine();
           if (pregunta.equals("1")) {
               preguntaBoolean = true;
           }else {
               System.out.println("ha habido un error");
           }


           JFrame ventana = new JFrame();

           boton1 = new JButton("Boton1");
           boton1.setBounds(10, 10, 200, 200);

           boton2 = new JButton("Boton2");
           boton2.setBounds(220, 10, 200, 200);

           boton3 = new JButton("Boton3");
           boton3.setBounds(10, 220, 200, 200);

           boton4 = new JButton("Boton4");
           boton4.setBounds(220, 220, 200, 200);

           ventana.add(boton1);
           boton1.addActionListener(this);
           ventana.add(boton2);
           boton2.addActionListener(this);
           ventana.add(boton3);
           boton3.addActionListener(this);
           ventana.add(boton4);
           boton4.addActionListener(this);

           ventana.setSize(430, 430);
           ventana.setLayout(null);
           ventana.setVisible(preguntaBoolean);

       }


       public void actionPerformed(ActionEvent e) {
           if (e.getSource() == boton1) {
               System.out.println("has pulsado boton 1");
           }
           if (e.getSource() == boton2) {
               System.out.println("has pulsado boton 2");
           }
           if (e.getSource() == boton3) {
               System.out.println("has pulsado boton 3");
           }
           if (e.getSource() == boton4) {
               System.out.println("has pulsado boton 4");
           }
       }


       public static void main(String[] args) {
           new botones();
       }

   }
