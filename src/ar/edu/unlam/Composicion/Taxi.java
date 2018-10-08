package ar.edu.unlam.Composicion;

public class Taxi {

	String marca = "";
	String modelo = "";
	String patente = "";
	String nombre = "";
	String apellido = "";
	Chofer chofer;
	
	public Taxi() {
		
	}
	
	public Taxi(String marca, String modelo, String patente, String nombre, String apellido) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.chofer = new Chofer(nombre, apellido);	
	}
	
	public String datosDeChofer() {
		
		
		return chofer.getNombre() + chofer.getApellido(); 
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
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

	public Chofer getChofer() {
		return chofer;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}
	
	
	
}
