package ar.edu.unlam.cuentaBancaria;

public class CuentaCorriente extends CuentaSaldo {

	protected Double limiteBancario = 0.0;
	protected Double comision = 0.0;

	public CuentaCorriente(Double cantidad, String titular, Double limiteBancario) {
		super(cantidad, titular);

	}

	public void extraer(Double cantidad) {

		if (cantidad > 0 && this.getSaldo() > cantidad) {

			super.extraer(cantidad);

		} 

		if (this.getSaldo() < cantidad) {
			
			this.comision = this.getSaldo() - cantidad;

			this.saldo -= (cantidad - (comision * 5/100));

		}

	}

	public Double getLimiteBancario() {
		return limiteBancario;
	}

	public void setLimiteBancario(Double limiteBancario) {
		this.limiteBancario = limiteBancario;
	}

}
