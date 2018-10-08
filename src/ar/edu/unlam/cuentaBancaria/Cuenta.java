package ar.edu.unlam.cuentaBancaria;

public abstract class Cuenta {  //clase abstracta: al menos 1 metodo abstracto, puede tener atributos.

	public abstract void depositar(Double cantidad);
	
	public abstract void extraer(Double cantidad);
	
	public abstract Double getSaldo();
	
	public abstract void setSaldo(Double saldo);
	
}
