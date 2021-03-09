package negocio;

import java.util.ArrayList;

import datos.GestorLD;

public class GestorLN {
	
	private GestorLD gld = new GestorLD();
	
	private ArrayList<Persona> listaAlumnos;
	
	public GestorLN() {
		listaAlumnos = new ArrayList<Persona>();
		actualizarListaAlumnos();
	}
	
	public void insertarAlumno(Estudiante alumno) {
		this.gld.insertarAlumno(alumno);
	}
	
	public ArrayList<Persona> consultarAlumnos() {
		actualizarListaAlumnos();
		return this.listaAlumnos;
	}

	private void actualizarListaAlumnos() {
		// Recuperamos la lista de los alumnos de la capa de datos
		String[] alumnosBD = this.gld.seleccionarAlumnos();
		
		// Poblamos el array list con los datos
		for(int i = 0; i < alumnosBD.length; i++) {
			if(alumnosBD[i] != null) {
				listaAlumnos.add(alumnosBD[i]);
			}
		}
	}
	
	

}
