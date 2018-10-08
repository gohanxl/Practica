package herencia;

import ar.edu.unlam.cuentaBancaria.CajaDeAhorros;
import ar.edu.unlam.cuentaBancaria.CuentaCorriente;
import ar.edu.unlam.cuentaBancaria.CuentaSaldo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCuentas {
	
	@Test
	
	public void testCuentaSaldo() {
	
	CuentaSaldo cuenta = new CuentaSaldo();
	
	cuenta.depositar(4000.00);
	cuenta.extraer(2000.00);
	
	Double valorEsperado = 2000.00;
	Double valorObtenido = cuenta.getSaldo();
	
	assertEquals(valorEsperado, valorObtenido);
	
	}
	
	@Test
	
	public void testCajaDeAhorros() {
		
	CajaDeAhorros cuenta = new CajaDeAhorros("Martin", 7000.00);
	
	cuenta.extraer(1000.00);
	cuenta.extraer(1000.00);
	cuenta.extraer(1000.00);
	cuenta.extraer(1000.00);
	cuenta.extraer(1000.00);
	cuenta.extraer(1000.00);
	cuenta.extraer(500.00);
	
	Double valorEsperado = 488.00;
	Double valorObtenido = cuenta.getSaldo();
	
	assertEquals(valorEsperado, valorObtenido);
	
	}
	
	@Test
	
	public void testCuentaCorriente() {
		
	CuentaCorriente cuenta = new CuentaCorriente(100.00, "Lucas", 1000.00);
	
	cuenta.extraer(200.00);
		
	
	Double valorEsperado = -105.00;
	Double valorObtenido = cuenta.getSaldo();
	
	assertEquals(valorEsperado, valorObtenido);
	
	}
	
}
