package ar.edu.unlam.pb2.Herencia;

import java.util.Date;

public class Gerente extends Empleado {

	protected String departamento;
	protected Integer cochera;

	public Gerente(Integer cochera, String departamento, String nombre, Integer salario, Date fechaNacimiento) {
		super(nombre, salario, fechaNacimiento);

		this.cochera = cochera;
		this.departamento = departamento;

	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Integer getCochera() {
		return cochera;
	}

	public void setCochera(Integer cochera) {
		this.cochera = cochera;
	}

	public String brindarDetalles() {
		return "Soy un gerente";
	}

}
