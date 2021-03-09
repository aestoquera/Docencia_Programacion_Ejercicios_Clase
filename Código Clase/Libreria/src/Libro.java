
public class Libro {
	
	private String titulo = "";
	private String autor = "";
	private int año = 1900;
	private String isbn = "";
	
	public Libro() {	}
	
	public Libro(String titulo, String autor, int año, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
		this.isbn = isbn;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
}
