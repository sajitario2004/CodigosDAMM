package swing1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing33 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel arriba;
	private JPanel medio;
	private JPanel abajo;
	private JTextField texto1;
	private JTextField texto2;
	private JButton suma;
	private JButton resta;
	private JButton multi;
	private JButton divi;
	private JTextArea textArea;
	private JButton clear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing33 frame = new swing33();
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
	public swing33() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		arriba = new JPanel();
		contentPane.add(arriba, BorderLayout.NORTH);
		arriba.setLayout(new BoxLayout(arriba, BoxLayout.X_AXIS));
		
		texto1 = new JTextField();
		arriba.add(texto1);
		texto1.setColumns(10);
		
		texto2 = new JTextField();
		arriba.add(texto2);
		texto2.setColumns(10);
		
		suma = new JButton("+");
		
		arriba.add(suma);
		
		resta = new JButton("-");
		arriba.add(resta);
		
		multi = new JButton("*");
		arriba.add(multi);
		
		divi = new JButton("/");
		arriba.add(divi);
		
		medio = new JPanel();
		contentPane.add(medio, BorderLayout.CENTER);
		medio.setLayout(new BoxLayout(medio, BoxLayout.X_AXIS));
		
		textArea = new JTextArea();
		medio.add(textArea);
		
		abajo = new JPanel();
		contentPane.add(abajo, BorderLayout.SOUTH);
		abajo.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 5));
		
		clear = new JButton("clear");
		
		abajo.add(clear);
		
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int var1 = Integer.parseInt(texto1.getText());
				int var2 = Integer.parseInt(texto2.getText());
				
				int suma = var1 + var2;
				
				String respuesta = ("La respuesta es: " + var1 + " + " + var2 + " = " + suma + "\n" );
				
				textArea.append(respuesta);
				
			}
		});
		
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int var1 = Integer.parseInt(texto1.getText());
				int var2 = Integer.parseInt(texto2.getText());
				
				int suma = var1 - var2;
				
				String respuesta = ("La respuesta es: " + var1 + " + " + var2 + " = " + suma + "\n" );
				
				textArea.append(respuesta);
				
			}
		});
		
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int var1 = Integer.parseInt(texto1.getText());
				int var2 = Integer.parseInt(texto2.getText());
				
				int suma = var1 * var2;
				
				String respuesta = ("La respuesta es: " + var1 + " + " + var2 + " = " + suma + "\n" );
				
				textArea.append(respuesta);
				
			}
		});
		
		divi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int var1 = Integer.parseInt(texto1.getText());
				int var2 = Integer.parseInt(texto2.getText());
				
				int suma = var1 / var2;
				
				String respuesta = ("La respuesta es: " + var1 + " + " + var2 + " = " + suma + "\n"+
				"Y de resto " + (var1%var2) + "\n");
				
				textArea.append(respuesta);
				
			}
		});
		
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		
		

	}

}
