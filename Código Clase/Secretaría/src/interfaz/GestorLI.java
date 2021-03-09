package interfaz;

import java.util.ArrayList;

import negocio.GestorLN;
import negocio.iProperty;

public class GestorLI {
	
	private GestorLN gln = new GestorLN();
	
	public GestorLI() {
		// Primero introducimos un estudiante
		this.gln.insertarAlumno("Estudiante 3");
		// Mostramos los datos de todos los estudiantes
		ArrayList<iProperty> datosEstudiantes = this.gln.consultarAlumnos();
		
		datosEstudiantes.get(0).getProperty("NOMBRE");
		
		System.out.println("Datos de los estudiantes");
		System.out.println("========================");
		
		for(int i = 0; i < datosEstudiantes.size(); i++) {
			System.out.println(datosEstudiantes.get(i));
		}
		
	}
	
}
