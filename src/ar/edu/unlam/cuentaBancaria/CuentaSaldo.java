package ar.edu.unlam.cuentaBancaria;

public class CuentaSaldo extends Cuenta {

	
	protected Double saldo = 0.0;
	protected String titular = "";
	protected Integer contador = 0;
	
	
	public CuentaSaldo (){
		
	}
	
	public CuentaSaldo(Double saldo, String titular) {
		
		this.saldo = saldo;
		this.titular = titular;
		
	}
	
	public CuentaSaldo(Double cantidad) {
		
		this.saldo = cantidad;
		
	}
	
	
	public void depositar(Double cantidad) {
	
		this.saldo += cantidad;
		
	}
	
	public void extraer(Double cantidad) {
		
		if(cantidad > 0 && this.saldo > cantidad) {
		
			this.saldo -= cantidad;
			contador++;
		
		}
	}


	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}	
	
}
