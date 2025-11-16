package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Password;
import view.BotonPersonalizado;
import view.Ventana;

public class Controlador implements ActionListener {

	private Password ps;
	private Ventana fm;

	public Controlador(Password ps, Ventana fm) {
		this.ps = ps;
		this.fm = fm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();

		switch (s) {
		case "1":
			this.ps.escribirEnCadena("1");
			this.fm.escribirPassword(ps);
			break;
		case "2":
			this.ps.escribirEnCadena("2");
			this.fm.escribirPassword(ps);
			break;
		case "3":
			this.ps.escribirEnCadena("3");
			this.fm.escribirPassword(ps);
			break;
		case "4":
			this.ps.escribirEnCadena("4");
			this.fm.escribirPassword(ps);
			break;
		case "5":
			this.ps.escribirEnCadena("5");
			this.fm.escribirPassword(ps);
			break;
		case "6":
			this.ps.escribirEnCadena("6");
			this.fm.escribirPassword(ps);
			break;
		case "7":
			this.ps.escribirEnCadena("7");
			this.fm.escribirPassword(ps);
			break;
		case "8":
			this.ps.escribirEnCadena("8");
			this.fm.escribirPassword(ps);
			break;
		case "9":
			this.ps.escribirEnCadena("9");
			this.fm.escribirPassword(ps);
			break;
		case "0":
			this.ps.escribirEnCadena("0");
			this.fm.escribirPassword(ps);
			break;
		case "ver":
			this.fm.cambiarText(ps);
			break;
		case "no ver":
			this.fm.cambiarAsterisc(ps);
			break;
		default:
			break;
		}

		if (s.equals("comprob")) {
			this.fm.compobar(ps);
		} else if (s.equals("reset")) {
			this.fm.RPassword(ps);
		}

	}

}
