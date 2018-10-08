package herencia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.edu.unlam.Composicion.Persona;

public class TestFechaPersona {

	@Test
	
	public void TestFecha() {
		
		Boolean SonIguales = false;
		
		Persona Selina = new Persona("Selina", "Weeb", 9, 6, 2000);
		Persona Danno = new Persona("Dan", "Weeb", 2, 11, 1995);
		Persona Selina2 = new Persona("Selina", "Weeb", 9, 6, 2000);
		
		
		Integer valorEsperado = 9;
		Integer valorObtenido = Selina.getFechaDeNacimiento().getDia();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	
	public void TestFecha2() {
		
		Boolean sonIguales = false;
		
		Persona Selina = new Persona("Selina", "Weeb", 9, 6, 2000);
		Persona Danno = new Persona("Dan", "Weeb", 2, 11, 1995);
		Persona Selina2 = new Persona("Selina", "Weeb", 9, 6, 2000);
		
		if (Selina.getFechaDeNacimiento().equals(Selina2.getFechaDeNacimiento())) {
			
			sonIguales = true;
		}
		
		assertTrue(sonIguales);
	}
	
	
}
