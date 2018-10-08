package ar.edu.unlam.Composicion;

public class TragaMonedas {

	Boolean ganaste = false;
	Tambores tambor1;
	Tambores tambor2;
	Tambores tambor3;

	
	public TragaMonedas() {
		
		tambor1 = new Tambores();
		tambor2 = new Tambores();
		tambor3 = new Tambores();
		
	}
	
	public void Jugar() {

		
		
		
		tambor1.Girar();

		tambor2.Girar();

		tambor3.Girar();
		
	}

	public Boolean GanastePremio() {

		if (tambor1.MostrarCara() == tambor2.MostrarCara() && tambor1.MostrarCara() == tambor3.MostrarCara()) {

			ganaste = true;

		}

		return ganaste;
	}
}
