/**
 * 
 */
package pregunta03;

import java.awt.EventQueue;

/**
 * 
 */
public class mainPregunta03 {

	/**
	 * 
	 */
	public mainPregunta03() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboAnimales fm = new ComboAnimales();
					fm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
