/**
 * 
 */
package pregunta01;

import java.awt.EventQueue;

/**
 * Clase que contiene metodo main para Pregrunta01
 */
public class mainPregunta01 {

	/**
	 * 
	 */
	public mainPregunta01() {

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioContactos fm = new FormularioContactos();
					fm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
