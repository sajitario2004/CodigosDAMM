package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BoxLayoutDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public BoxLayoutDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JButton btnButton1 = new JButton("Button 1");
		contentPane.add(btnButton1);
		
		JButton btnButton2 = new JButton("Button 2");
		contentPane.add(btnButton2);
		
		JButton btnButton3 = new JButton("Button 3");
		btnButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnButton3);
		
		JButton btnButton4 = new JButton("Long Text Button4");
		contentPane.add(btnButton4);
		
		JButton btnButton5 = new JButton("5");
		contentPane.add(btnButton5);

	}

}
