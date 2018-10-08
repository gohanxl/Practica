package ar.edu.unlam.Composicion;

public class Persona {

	String nombre = "";
	String apellido = "";
	Fecha fechaDeNacimiento;
	
	
	public Persona() {
		
		
	}
	
	public Persona(String nombre, String apellido, Integer dia, Integer mes, Integer año) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = new Fecha(dia, mes, año);
		
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Fecha getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
}
