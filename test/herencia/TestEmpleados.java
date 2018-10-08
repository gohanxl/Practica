package herencia;

import org.junit.Test;
import static org.junit.Assert.*;
import ar.edu.unlam.pb2.Herencia.*;

public class TestEmpleados {
	
	@Test 
	
	public void CrearEmpleado() {
		Empleado empleado1 = new Empleado("Roberto", 1000);
		
		assertNotNull(empleado1);
		
	}
	
	
	
	@Test
	
	public void verificaQueSeaEmpleado() {
		
		
		
	}
	
	
	
}
