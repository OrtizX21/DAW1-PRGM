package Maquinaria;
import Maquinaria.Vagones;
import Personal.Maquinistas;

@SuppressWarnings("unused")

	class Tren {
	
	Maquinistas Operario1;
	Locomotora Locomotora1;
	Vagones Vagon[];
	private int NumVagones;
	
	Tren (Maquinistas Rodrigo, Locomotora Locomot) {
		
		this.Operario1 = Rodrigo;
		this.Locomotora1 = Locomot;
		this.Vagon = new Vagones [5];
		this.NumVagones = 0;
	}
	
	public void AgregarVagon (Integer Id, Double Actual, Double Maximo, String Tipo) {
		
		if (NumVagones >= 6) {
			
			System.out.println("Maximo De Vagones Sobrepasado.");
		}
		
		else {
			
			Vagones v1 = new Vagones (Id, Actual, Maximo, Tipo);
			Vagon[NumVagones] = v1;
			NumVagones++;
		}
	}

}
