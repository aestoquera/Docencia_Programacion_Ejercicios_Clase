
public class Sabor {
	
	// Atributos de la clase
	private String nombre;
	private double hidratos;
	private double proteinas;
	private double grasas;
	
	
	// Constructores
	public Sabor() { }
	
	public Sabor(String nombre, double hidratos, double proteinas, double grasas) {
		this.nombre = nombre;
		this.hidratos = hidratos;
		this.proteinas = proteinas;
		this.grasas = grasas;				
	}
	
	public Sabor(Sabor s1) {
		this.nombre = s1.getNombre();
		this.hidratos = s1.getHidratos();
		this.proteinas = s1.getProteinas();
		this.grasas = s1.getGrasas();
	}

	// Métodos
	
	public double getProteinas() {
		return this.proteinas;
	}

	public double getGrasas() {
		return this.grasas;
	}

	public double getHidratos() {
		return this.hidratos;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}
	
	public void setGrasas(double grasas) {
		this.grasas = grasas;
	}
	
	public void setHidratos(double hidratos) {
		this.hidratos = hidratos;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "Nombre: " + this.nombre + 
				"\nHidratos: " + this.hidratos + 
				"\nProteinas: " + this.proteinas + 
				"\nGrasas: " + this.grasas;
	}
}
