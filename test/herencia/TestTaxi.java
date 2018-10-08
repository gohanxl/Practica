package herencia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.edu.unlam.Composicion.Chofer;
import ar.edu.unlam.Composicion.Taxi;

public class TestTaxi {

	@Test

	public void testChofer() {

		Taxi volks = new Taxi("Volks", "A", "ABC123", "Roberto", "Perez");

		String valorEsperado = "Roberto" + "Perez";
		String valorObtenido = volks.datosDeChofer();

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test

	public void testChofer2() {

		Taxi volks = new Taxi("Volks", "A", "ABC123", "Roberto", "Perez");

		assertTrue(volks.getNombre().contains("Roberto"));

	}
}
