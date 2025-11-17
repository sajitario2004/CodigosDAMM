package pregunta01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioContactos extends JFrame {

	//Mis variables
	int idContactos = 0;

	private JTextField txtNombre = new JTextField(10);
	private JTextField txtTelefono = new JTextField(10);
	private JButton btnAgregar = new JButton("Agregar");
	private JTextArea areaContactos = new JTextArea(10, 25);

	private JPanel contentPane;
	private final JPanel panelInferior = new JPanel();
	private final JButton btnLimpiarContactos = new JButton("Borrar");

	public FormularioContactos() {
		setResizable(false);

		setTitle("Gestion de Contactos");

		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		contentPane = new JPanel(new GridLayout(3, 2));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panelSuperior = new JPanel();
		panelSuperior.add(new JLabel("Nombre:"));
		panelSuperior.add(txtNombre);
		panelSuperior.add(new JLabel("Teléfono:"));
		panelSuperior.add(txtTelefono);
		
		panelSuperior.add(btnAgregar);

		JScrollPane panelCentralContactos = new JScrollPane(areaContactos);

		getContentPane().add(panelSuperior, BorderLayout.NORTH);
		getContentPane().add(panelCentralContactos, BorderLayout.CENTER);
		FlowLayout flowLayout = (FlowLayout) panelInferior.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);

		contentPane.add(panelInferior);
		
		panelInferior.add(btnLimpiarContactos);
		
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//si el nombre o el telefono esta vacio salta una ventana avisando y no introduce el usuaro
				if(getNombre().trim().equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(panelCentralContactos, "no esta escrito el nombre");
				}else if(getTelefono().trim().equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(panelCentralContactos, "no esta escrito el telefono");
				}else {
					Contacto c = new Contacto(getNombre(), getTelefono());
					c.setId(idContactos);
					idContactos++;
					String texto = "id: " + c.getId() + ", nombre: "+ c.getNombre() + ", telefono: " + c.getTelefono() +"\n";
					areaContactos.append(texto);
				}
			}
		});
		
		btnLimpiarContactos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaContactos.setText("");
				idContactos=0;
			}
		});

	}

	public String getNombre() {
		return txtNombre.getText();
	}

	public String getTelefono() {
		return txtTelefono.getText();
	}

	public void mostrarContactos(String texto) {
		areaContactos.setText(texto);
	}

}
