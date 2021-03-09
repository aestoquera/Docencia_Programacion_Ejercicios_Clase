
public class Libreria {
	
	private String nombre = "";
	private String calle = "";
	private int cp = 0;
	private Libro[] aLibros = new Libro[100];
	
	public Libreria() { }
	
	public Libreria(String nombre, String calle, int cp, Libro[] aLibros) {
		this.nombre = nombre;
		this.calle = calle;
		this.cp = cp;
		this.aLibros = aLibros;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCalle() {
		return this.calle;
	}
	
	public int getCp() {
		return this.cp;
	}
	
	public Libro[] getLibros() {
		return this.aLibros;
	}
}
