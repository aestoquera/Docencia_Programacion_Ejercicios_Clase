package datos;

import java.util.ArrayList;

public class MainPruebaLD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestorLD gld = new GestorLD();
		
		gld.mostrarBBDD();
		
		System.out.println("------------------");
		
		gld.insertarAlumno("Estudiante3");
		
		gld.mostrarBBDD();

	}

}
