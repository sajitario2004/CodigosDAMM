package ejer10;

public class Libro {
	private String titulo;
	private String autor;
	private String ano;
	
	

	public Libro() {
		super();
	} 
	
	public Libro(String titulo, String autor, String ano) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + "]";
	}
	
	
	
	
}
