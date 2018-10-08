package ar.edu.unlam.pb2.Herencia;

import java.util.Date;

public class Secreteria extends Empleado {

	public Secreteria(String nombre, Integer salario, Date fechaNacimiento) {
		super(nombre, salario, fechaNacimiento);

	}

	public String brindarDetalles() {
		return "Soy una secretaria";
	}

}
