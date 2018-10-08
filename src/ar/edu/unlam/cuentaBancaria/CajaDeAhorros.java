package ar.edu.unlam.cuentaBancaria;

public class CajaDeAhorros extends CuentaSaldo {

	public CajaDeAhorros() {

	}

	public CajaDeAhorros(String titular, Double saldo) {
		super(saldo, titular);

	}

	public void extraer(Double cantidad) {

		if (contador < 5 && this.getSaldo() > cantidad) {

			super.extraer(cantidad);
		}

		if (contador >= 5 && this.getSaldo() > (cantidad + 5)) {

			super.extraer(cantidad + 6);

		}
	}

}
