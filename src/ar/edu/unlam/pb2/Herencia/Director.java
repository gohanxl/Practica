package ar.edu.unlam.pb2.Herencia;

import java.util.Date;

public class Director extends Gerente {

	protected Integer salarioExtra;

	public Director(Integer cochera, String departamento, Integer salarioExtra, String nombre, Integer salario,
			Date fechaNacimiento) {
		super(cochera, departamento, nombre, salario, fechaNacimiento);

		this.salarioExtra = salarioExtra;
	}

	public Integer getSalarioExtra() {
		return salarioExtra;
	}

	public void setSalarioExtra(Integer salarioExtra) {
		this.salarioExtra = salarioExtra;
	}

	public String brindarDetalles() {

		return "Soy un Director";

	}

}
