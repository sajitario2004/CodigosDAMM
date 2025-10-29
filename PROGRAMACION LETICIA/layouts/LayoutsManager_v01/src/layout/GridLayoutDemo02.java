package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GridLayoutDemo02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GridLayout gridPanel;

	private JPanel compsToExperiment = new JPanel();

	/**
	 * Create the frame.
	 */
	public GridLayoutDemo02() {
		setTitle("GridLayoutDemo2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		contentPane.add(compsToExperiment, BorderLayout.NORTH);
		//compsToExperiment.setLayout(new GridLayout(0, 2, 0, 0));
		gridPanel = new GridLayout(0, 2, 0, 0);
		compsToExperiment.setLayout(gridPanel);
		
		JButton btn01 = new JButton("Button 1");
		compsToExperiment.add(btn01);
		
		JButton btn02 = new JButton("Button 2");
		compsToExperiment.add(btn02);
		
		JButton btn03 = new JButton("Button 3");
		compsToExperiment.add(btn03);
		
		JButton btn04 = new JButton("Button 4");
		compsToExperiment.add(btn04);
		
		JButton btn05 = new JButton("Button 5");
		compsToExperiment.add(btn05);
		
		JPanel controls = new JPanel();
		contentPane.add(controls, BorderLayout.SOUTH);
		controls.setLayout(new GridLayout(0, 3, 10, 2));
		
		JLabel lblNewLabel = new JLabel("Horizontal Gap");
		controls.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vertical Gap");
		controls.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" ");
		controls.add(lblNewLabel_2);
		
		JComboBox horGapComboBox = new JComboBox();
		horGapComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "10", "15"}));
		controls.add(horGapComboBox);
		
		JComboBox verGapComboBox = new JComboBox();
		verGapComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "10", "15", "20"}));
		controls.add(verGapComboBox);
		
		JButton btnApply = new JButton("Apply");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Get the horizontal gap value
                String horGap = (String)horGapComboBox.getSelectedItem();
                System.out.print("horGap: " + horGap);
                
                //Get the vertical gap value
                String verGap = (String)verGapComboBox.getSelectedItem();
                System.out.println("verGap: " + verGap);
                
                
                
                //Set up the horizontal gap value
                gridPanel.setHgap(Integer.parseInt(horGap));
                
                //Set up the vertical gap value
                gridPanel.setVgap(Integer.parseInt(verGap));
                
                // refresh screen
                gridPanel.layoutContainer(compsToExperiment);
                /*repaint();
                revalidasssdsdste();*/
                
			}
		});
		controls.add(btnApply);
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, BorderLayout.CENTER);

	}

}
