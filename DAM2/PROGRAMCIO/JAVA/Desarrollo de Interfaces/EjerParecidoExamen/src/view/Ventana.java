package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Mis botones
	BotonPersonalizado b1;
	BotonPersonalizado b2;
	BotonPersonalizado b3;
	BotonPersonalizado b4;
	BotonPersonalizado b5;
	BotonPersonalizado b6;
	BotonPersonalizado b7;
	BotonPersonalizado b8;
	BotonPersonalizado b9;
	BotonPersonalizado b0;
	
	BotonPersonalizado comprob;
	BotonPersonalizado reset;
	private JTextField textField;
	
	// Texto
	

	
	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTexto = new JPanel();
		contentPane.add(panelTexto);
		panelTexto.setLayout(new BoxLayout(panelTexto, BoxLayout.X_AXIS));
		
		textField = new JTextField();
		panelTexto.add(textField);
		textField.setColumns(10);
		
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones);
		panelBotones.setLayout(new GridLayout(0, 3, 0, 0));
		
		b1 = new BotonPersonalizado();
		panelBotones.add(b1);
		b2 = new BotonPersonalizado();
		panelBotones.add(b2);
		b3 = new BotonPersonalizado();
		panelBotones.add(b3);
		b4 = new BotonPersonalizado();
		panelBotones.add(b4);
		b5 = new BotonPersonalizado();
		panelBotones.add(b5);
		b6 = new BotonPersonalizado();
		panelBotones.add(b6);
		b7 = new BotonPersonalizado();
		panelBotones.add(b7);
		b8 = new BotonPersonalizado();
		panelBotones.add(b8);
		b9 = new BotonPersonalizado();
		panelBotones.add(b9);
		b0 = new BotonPersonalizado();
		panelBotones.add(b0);
		comprob = new BotonPersonalizado();
		panelBotones.add(comprob);
		reset = new BotonPersonalizado();
		panelBotones.add(reset);

	}

}
