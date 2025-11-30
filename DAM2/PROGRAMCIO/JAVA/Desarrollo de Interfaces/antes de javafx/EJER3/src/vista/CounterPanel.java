package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import model.Counter;
import controlador.CounterListener;

public class CounterPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Counter modelo;
	
	JTextField textField;
	
	public CounterPanel() {
		modelo = new Counter();
		configuracionPanel();
	}
	
	public void configuracionPanel() {
		setLayout(new BorderLayout(20, 20));
		
		// Botones
		JButton botonRestar = new JButton("     -    ");
		JButton botonSumar = new JButton("    +    ");
		
		// Config basica
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setText(String.valueOf(modelo.getContador()));
		add(textField, BorderLayout.CENTER);
		
		
		// Controlador
		CounterListener listener = new CounterListener(modelo, this);
		botonRestar.addActionListener(listener);
		botonSumar.addActionListener(listener);
		botonSumar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		// Añadir a el panel
		add(botonRestar, BorderLayout.WEST);
		add(botonSumar, BorderLayout.EAST);

	}
	
	public void actualizarValor(int valor) {
		textField.setText(String.valueOf(valor));
		repaint();
	}

}
