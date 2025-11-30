package model;

public class Password {
	
	private String textoAsterisc;
	private String cadena;
	
	public Password() {
		this.textoAsterisc = "";
		this.cadena = "";
	}
	
	
	
	
	public void pushAsterisc() {
		this.textoAsterisc+="*";
	}
	
	public void escribirEnCadena(String caracter) {
		this.cadena+=caracter;
		
		pushAsterisc();
	}
	
	public void resetPassword() {
		this.textoAsterisc = "";
		this.cadena = "";
	}
	
	public String getPassword() {
		return this.cadena;
	}
	
	public String getAsterisc() {
		return this.textoAsterisc;
	}
}
