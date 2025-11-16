package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.PasswordAuthentication;

import javax.swing.JTextField;


import controler.Controlador;
import model.Password;
import java.awt.Font;
import javax.swing.JButton;

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
	
	BotonPersonalizado bver;
	BotonPersonalizado bnover;
	// 
	private JTextField textField;

	
	
	
	
	public Ventana() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTexto = new JPanel();
		contentPane.add(panelTexto, BorderLayout.NORTH);
		panelTexto.setLayout(new BoxLayout(panelTexto, BoxLayout.X_AXIS));
		
		// Caja de texto
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setEditable(false);
		panelTexto.add(textField);
		textField.setColumns(10);
		
	
		
		
		//Botones 
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones);
		panelBotones.setLayout(new GridLayout(0, 3, 0, 0));
		
		b1 = new BotonPersonalizado();
		b1.setText("1");
		b1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// cuando hace click (presionar y soltar
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// Justo cuando presionas el boton
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// Justo cuando sueltas el boton
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// cuando el cursor entra en el area del boton
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// Cuando el curson sale del area
				
			}
		});
		panelBotones.add(b1);
		b2 = new BotonPersonalizado();
		b2.setText("2");
		panelBotones.add(b2);
		b3 = new BotonPersonalizado();
		b3.setText("3");
		panelBotones.add(b3);
		b4 = new BotonPersonalizado();
		b4.setText("4");
		b4.setName("4");
		panelBotones.add(b4);
		b5 = new BotonPersonalizado();
		b5.setText("5");
		panelBotones.add(b5);
		b6 = new BotonPersonalizado();
		b6.setText("6");
		panelBotones.add(b6);
		b7 = new BotonPersonalizado();
		b7.setText("7");
		panelBotones.add(b7);
		b8 = new BotonPersonalizado();
		b8.setText("8");
		panelBotones.add(b8);
		b9 = new BotonPersonalizado();
		b9.setText("9");
		panelBotones.add(b9);
		b0 = new BotonPersonalizado();
		b0.setText("0");
		panelBotones.add(b0);
		comprob = new BotonPersonalizado();
		comprob.setText("comprob");
		panelBotones.add(comprob);
		reset = new BotonPersonalizado();
		reset.setText("reset");
		panelBotones.add(reset);

		bver = new BotonPersonalizado();
		bver.setText("ver");
		panelTexto.add(bver);
		
		bnover = new BotonPersonalizado();
		bnover.setText("no ver");
		panelTexto.add(bnover);
		
		//Contraseña 
		Password ps = new Password();
		
		
		//LISENER 
		Controlador listener = new Controlador(ps, this);
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		b6.addActionListener(listener);
		b7.addActionListener(listener);
		b8.addActionListener(listener);
		b9.addActionListener(listener);
		b0.addActionListener(listener);
		reset.addActionListener(listener);
		comprob.addActionListener(listener);
		bver.addActionListener(listener);
		bnover.addActionListener(listener);
		
		

	}
	
	public void escribirPassword(Password ps) {
		textField.setText(ps.getAsterisc());
		
	}
	
	public void RPassword(Password ps) {
		ps.resetPassword();
		textField.setText(ps.getAsterisc());

	}
	
	public void compobar(Password ps) {
		String password = ps.getPassword();
		
		System.out.println(password);
		if(password.equals("1234567890")) {
			JOptionPane.showMessageDialog(this,"Contraseña correcta felicidades", "La contraseña era esa"+password, JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void cambiarAsterisc(Password ps) {
		this.textField.setText(ps.getAsterisc()+"");
	}
	
	public void cambiarText(Password ps) {
		this.textField.setText(ps.getPassword()+"");
		
	}

}
