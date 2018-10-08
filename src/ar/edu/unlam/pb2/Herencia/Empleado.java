package ar.edu.unlam.pb2.Herencia;

import java.util.Date;

public class Empleado {

	protected String nombre;
	protected Date fechaNacimiento;
	protected Integer salario;

	public Empleado(String nombre, Integer salario) {

		this.nombre = nombre;
		this.salario = salario;

	}

	public Empleado(String nombre, Integer salario, Date fechaNacimiento) {

		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public String brindarDetalles() {

		return "Soy un empleado";

	}

}
