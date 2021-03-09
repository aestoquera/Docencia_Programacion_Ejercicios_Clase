
public class Main {

	public static void main(String[] args) {
		Libro[] aLibros = {new Libro("Libro1", "autor1", 1900, "-"), new Libro("Libro2", "autor2", 1920, "-")};
		Libreria l1 = new Libreria("L1", "Torpedo", 01400, aLibros);
		
		System.out.println("Libreria: " + l1.getNombre());
		
		System.out.println("Libros:");
		
		for(int i = 0; i < l1.getLibros().length; i++) {
			System.out.println(l1.getLibros()[i].getTitulo() + " - " + l1.getLibros()[i].getAutor());
		}

	}

}
