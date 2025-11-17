package pregunta03;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ComboAnimales extends JFrame {

	// arrays para los animales disponibles
	// crear dichos animales basados en estos nombres y razas asociadas
	// cada petName lleva asociado su petRaza con el mismo índice en dichos arrays
	// el elemento 0 de cada array es el primer animal, y asi sucesivamente...
	String[] petNames = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
	String[] petRaza = { "Ornatu", "Felinux", "Rogetux", "Antropus", "Duroc" };

	//lista animales
	ArrayList<String> nombreAnimalesArray =new ArrayList<String>();
	
	
	private JPanel contentPane;
	private JTextField jtfAnimal;
	private JTextField jtfRaza;

	private JComboBox comboBox;

	/**
	 * Create the frame.
	 */
	public ComboAnimales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre Animal");
		lblNewLabel.setBounds(16, 11, 121, 16);
		contentPane.add(lblNewLabel);

		jtfAnimal = new JTextField();
		jtfAnimal.setBounds(124, 6, 159, 26);
		contentPane.add(jtfAnimal);
		jtfAnimal.setColumns(10);

		JButton btnNewAnimal = new JButton("Insertar");

		btnNewAnimal.setBounds(295, 36, 117, 29);
		contentPane.add(btnNewAnimal);

		JButton btnAnimalsToList = new JButton("Animales a Lista");

		btnAnimalsToList.setBounds(259, 126, 153, 29);
		contentPane.add(btnAnimalsToList);

		// COMBO BOX
		comboBox = new JComboBox();
		comboBox.setBounds(16, 90, 235, 27);
		contentPane.add(comboBox);
		JLabel lbl1 = new JLabel("Animal");

		JLabel lblNewLabel_1 = new JLabel("Animales Disponibles");
		lblNewLabel_1.setBounds(16, 70, 137, 16);
		contentPane.add(lblNewLabel_1);

		JList<String> listAnimales = new JList<>();

		JScrollPane scrollPane = new JScrollPane(listAnimales);
		scrollPane.setBounds(16, 158, 396, 108);
		contentPane.add(scrollPane);

		JLabel lblNewLabel_2 = new JLabel("Lista de Animales");
		lblNewLabel_2.setBounds(16, 131, 147, 16);
		contentPane.add(lblNewLabel_2);

		JLabel lblRaza = new JLabel("Raza");
		lblRaza.setBounds(16, 41, 96, 16);
		contentPane.add(lblRaza);

		jtfRaza = new JTextField();
		jtfRaza.setColumns(10);
		jtfRaza.setBounds(124, 36, 159, 26);
		contentPane.add(jtfRaza);

		JLabel lblSelectedAnimal = new JLabel("Seleccionado:");
		lblSelectedAnimal.setBounds(259, 94, 185, 16);
		contentPane.add(lblSelectedAnimal);

		comboBox.addItem("nombre: " + petNames[0] + ", raza: " + petRaza[0]);
		nombreAnimalesArray.add(petNames[0]);
		comboBox.addItem("nombre: " + petNames[1] + ", raza: " + petRaza[1]);
		nombreAnimalesArray.add(petNames[1]);
		comboBox.addItem("nombre: " + petNames[2] + ", raza: " + petRaza[2]);
		nombreAnimalesArray.add(petNames[2]);
		comboBox.addItem("nombre: " + petNames[3] + ", raza: " + petRaza[3]);
		nombreAnimalesArray.add(petNames[3]);
		comboBox.addItem("nombre: " + petNames[4] + ", raza: " + petRaza[4]);
		nombreAnimalesArray.add(petNames[4]);

		// action listener
		//insertar
		btnNewAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = jtfAnimal.getText();
				String raza = jtfRaza.getText();
				
				Animal a = new Animal(nombre, raza);
				nombreAnimalesArray.add(nombre);
				
				jtfAnimal.setText("");
				jtfRaza.setText("");
				
				comboBox.addItem("nombre: "+a.getName()+", raza: "+a.getRaza());
				
			}
		});

		//animales lista
		btnAnimalsToList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] st = new String[comboBox.getItemCount()];
				for (int i = 0; i < comboBox.getItemCount(); i++) {
					st[i] = (comboBox.getItemAt(i)+"");
				}
			
				
				
				listAnimales.setListData(st);
				
			}
		});
		
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = comboBox.getSelectedIndex();
				
				String st = "Seleccionado: " +nombreAnimalesArray.get(i);
				
				lblSelectedAnimal.setText(st);
				
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();
		String petName = (String) cb.getSelectedItem();
		// updateLabel(petName);
	}
}
