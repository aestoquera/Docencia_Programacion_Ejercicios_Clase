
public class Libro {
	
	private String titulo = "";
	private String autor = "";
	private int a�o = 1900;
	private String isbn = "";
	
	public Libro() {	}
	
	public Libro(String titulo, String autor, int a�o, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.a�o = a�o;
		this.isbn = isbn;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
}
