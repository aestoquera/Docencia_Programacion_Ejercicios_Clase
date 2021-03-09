package negocio;

public class Estudiante extends Persona implements iProperty{

	private String nombre = "";
	private int edad = 0;
	
	@Override
	public Object getProperty(String property) {
		if(property.equals("NOMBRE")) {
			return this.nombre;
		}
		
		if(property.equals("EDAD")) {
			return this.edad;
		}
		return null;
	}
	
	

}
