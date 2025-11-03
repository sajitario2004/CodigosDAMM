package proyect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;

public class tacobell extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelCentral;
	private JPanel panel;
	private JTextArea areaTexto;
	private double precio;
	private List<String> listaProductos = new ArrayList<String>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tacobell frame = new tacobell();
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
	public tacobell() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.TRAILING, 5, 5));
		
		JButton btnIniciar = new JButton("iniciar");
		
		panel.add(btnIniciar);
		
		panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(1, 0, 0, 0));
		panelCentral.setVisible(false);
		
		
		JPanel panelTicket = new JPanel();
		panelCentral.add(panelTicket);
		panelTicket.setLayout(new BoxLayout(panelTicket, BoxLayout.X_AXIS));
		panelTicket.setVisible(false);
		
		JPanel panelAñadir = new JPanel();
		panelTicket.add(panelAñadir);
		panelAñadir.setLayout(new BoxLayout(panelAñadir, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panelAñadir.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JLabel taco = new JLabel("tacos - 2$");
		panel_1.add(taco);
		
		JButton suma1 = new JButton("+");	
		panel_1.add(suma1);
		
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		panelAñadir.add(panel_2);
		
		JLabel ensalada = new JLabel("ensalada - 3$");
		panel_2.add(ensalada);
		
		JButton suma2 = new JButton("+");
		
		panel_2.add(suma2);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_3.getLayout();
		flowLayout_2.setAlignment(FlowLayout.RIGHT);
		panelAñadir.add(panel_3);
		
		JLabel quesadilla = new JLabel("quesadilla - 5$");
		panel_3.add(quesadilla);
		
		JButton suma3 = new JButton("+");
		
		panel_3.add(suma3);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_4.getLayout();
		flowLayout_3.setAlignment(FlowLayout.RIGHT);
		panelAñadir.add(panel_4);
		
		JLabel nachos = new JLabel("nacho - 2$");
		panel_4.add(nachos);
		
		JButton suma4 = new JButton("+");
		
		panel_4.add(suma4);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_5.getLayout();
		flowLayout_4.setAlignment(FlowLayout.RIGHT);
		panelAñadir.add(panel_5);
		
		JLabel bebidas = new JLabel("bebidas - 4$");
		panel_5.add(bebidas);
		
		JButton suma5 = new JButton("+");
		panel_5.add(suma5);
		
		areaTexto = new JTextArea();
		panelTicket.add(areaTexto);
		
		JPanel panelPagar = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelPagar.getLayout();
		flowLayout.setAlignment(FlowLayout.TRAILING);
		contentPane.add(panelPagar, BorderLayout.SOUTH);
		
		JButton pedir = new JButton("pedir");
		
		panelPagar.add(pedir);
		
		//boton iniciar
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCentral.setVisible(true);
				panelTicket.setVisible(true);
			}
		});
		
		//suma
		suma1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double preci1 = 2;
				String producString = "taco";
				sobrescribirTicket(producString, preci1);
				
			}
		});
		
		suma2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double preci1 = 3;
				String producString = "ensalada";
				sobrescribirTicket(producString, preci1);
				
			}
		});
		
		suma3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double preci1 = 5;
				String producString = "quesadilla";
				sobrescribirTicket(producString, preci1);
				
			}
		});
		
		suma4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double preci1 = 2;
				String producString = "nacho";
				sobrescribirTicket(producString, preci1);
				
			}
		});
		
		suma5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double preci1 = 4;
				String producString = "bebida";
				sobrescribirTicket(producString, preci1);
				
			}
		});
		
		// boton pedir
		pedir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (precio == 0) {
					JOptionPane.showMessageDialog(pedir, "No se puede pedir un pedido vacio");
				}else {
					try {
						MiDialogo dialog = new MiDialogo();
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception error) {
						error.printStackTrace();
					}
				}
			}
		});
		

	}
	
	public void sobrescribirTicket(String producto, double preci) {
		String lista = ("La lista de productos es: \n");
		precio += preci;
		
		String newProduc = producto + " con precio " + preci;
		listaProductos.add(newProduc);
		
		

		for (Iterator<String> iterator = listaProductos.iterator(); iterator.hasNext();) {
			String string1 = (String) iterator.next();
			lista += "\n"+ string1;
		}
		
		
		
		lista += "\n El precio total es: "+ precio;
		
		areaTexto.setText(lista);
	}
	
	
	
	

}
