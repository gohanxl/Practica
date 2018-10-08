package herencia;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.edu.unlam.Composicion.Tambores;
import ar.edu.unlam.Composicion.TragaMonedas;

public class TestTragaMonedas {

	@Test

	public void TestTambor() {
		
		Tambores tambor1 = new Tambores();
		
		Boolean valorObtenido = false;

		tambor1.Girar();

		if (tambor1.MostrarCara() >= 1 && tambor1.MostrarCara() < 8) {

			valorObtenido = true;

		}else {
			
			valorObtenido = false;
		}
		
		assertTrue(valorObtenido);
	}
	
	@Test
	
	public void TestTragaMonedas() {
		
		TragaMonedas traga1 = new TragaMonedas();
		
		traga1.Jugar();
		
		//el test de esto lo vamos a ver en Taller Web 1 - test moquito
		
	}

}
