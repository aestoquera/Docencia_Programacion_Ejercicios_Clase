package datos;

public class GestorLD {
	
	private String[] datos = new String[10];
	
	public GestorLD() {	
		datos[0] = "Estudiante1";
		datos[1] = "Estudiante2";
		
	}
	
	public String[] seleccionarAlumnos() {
		return datos;
	}
	
	public void insertarAlumno(String datosAlumno) {
		int posicionVacia = 0;
		
		while(this.datos[posicionVacia] != null) {
			posicionVacia++;
		}
		
		datos[posicionVacia] = datosAlumno;
		
	}
	
	public void mostrarBBDD() {
		for(int i = 0; i < this.datos.length; i++) {
			System.out.println(this.datos[i]);
		}
	}
	
	
}
