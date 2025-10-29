/**
 * 
 */

import java.awt.EventQueue;

import layout.BoxLayoutDemo;
import layout.FlowLayoutDemo;
import layout.GridLayoutDemo;
import layout.GridLayoutDemo02;
import layout.BorderLayoutDemo;

/**
 * 
 */
public class MainApp {

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//FlowLayoutDemo frame = new FlowLayoutDemo();
					//GridLayoutDemo frame = new GridLayoutDemo();
					//BoxLayoutDemo frame = new BoxLayoutDemo();
					//GridLayoutDemo frame = new GridLayoutDemo();
					GridLayoutDemo02 frame = new GridLayoutDemo02();
					
					// centramos la ventana
					frame.setLocationRelativeTo(null);
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
