package proyecto1;

import java.awt.EventQueue;
import java.time.temporal.JulianFields;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejer1 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int contador;
	
	/*
	 * 
	 * BOTONES 
	 * 
	 */
	JButton botonRestar;
	JButton botonSumar;
	JTextArea areaTexto;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejer1 frame = new ejer1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ejer1() {
		contador=0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelArriba = new JPanel();
		contentPane.add(panelArriba, BorderLayout.NORTH);
		
		JPanel panelIzquierda = new JPanel();
		contentPane.add(panelIzquierda, BorderLayout.WEST);
		
		JPanel panelDerecha = new JPanel();
		contentPane.add(panelDerecha, BorderLayout.EAST);
		
		JPanel panelAbajo = new JPanel();
		contentPane.add(panelAbajo, BorderLayout.SOUTH);
		
		JPanel panelMedio = new JPanel();
		contentPane.add(panelMedio, BorderLayout.CENTER);
		
		JLabel textoArriba = new JLabel();
		textoArriba.setText("Titulo");
		panelArriba.add(textoArriba);
		
		botonRestar = new JButton();
		botonRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		botonRestar.setText("-");
		panelIzquierda.add(botonRestar);
		
		botonSumar = new JButton("+");
		panelDerecha.add(botonSumar);
		
		
		JButton reset = new JButton();
		reset.setText("reset");
		panelAbajo.add(reset);
		
		areaTexto = new JTextArea();
		areaTexto.setText(contador+"");
		panelMedio.add(areaTexto);

	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == botonSumar) {
			contador++;
			areaTexto.setText(contador+"");
		}
	}

}
