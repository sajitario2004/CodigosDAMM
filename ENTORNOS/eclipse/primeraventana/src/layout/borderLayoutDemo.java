package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;

public class borderLayoutDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					borderLayoutDemo frame = new borderLayoutDemo();
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
	public borderLayoutDemo() {
		setTitle("GridLayout Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JButton btnNewButton_4 = new JButton("New button");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("New button");
		contentPane.add(btnNewButton_3, BorderLayout.EAST);

	}

}
