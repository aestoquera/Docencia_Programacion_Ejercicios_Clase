
public class Lanzallamas {
	private String usuario = "";
	private String color = "";
	private static int ultimoNserieUsado = 0;
	private int nserie;
	
	public Lanzallamas() {
		ultimoNserieUsado++;
		this.nserie = ultimoNserieUsado;
		
	}
	
	public Lanzallamas(String usuario, String color) {
		this.usuario = usuario;
		this.color = color;
		this.nserie = ultimoNserieUsado + 1;
		ultimoNserieUsado++;
	}
	
	public int getNserie() {
		return nserie;
	}
	
	
	public String toString() {
		return this.usuario + " - " + this.color + " - " + this.nserie; 
	}

}
