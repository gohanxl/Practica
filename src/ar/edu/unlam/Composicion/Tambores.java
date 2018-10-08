package ar.edu.unlam.Composicion;

import java.util.Random;

public class Tambores  {

	Integer cara = 0;
	Random r = new Random();
	
	public void Girar() {
		
		
		this.cara = r.nextInt(7)+1;
		
	}
	
	public Integer MostrarCara() {
		
		
		return this.cara;
	}
}
