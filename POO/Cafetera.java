package POO;

public class Cafetera {

	private int CapacidadMaxima;
	private int CantidadActual;
	
	Cafetera () {
		
		this.CapacidadMaxima = 1000;
		this.CantidadActual = 0;
	}
	
	Cafetera (int CapacidadMax) {
		
		this.CapacidadMaxima = CapacidadMax;
		CapacidadMax = CantidadActual;
	}
	
	Cafetera (int CapacidadMax, int CantActual) {
		
		this.CapacidadMaxima = CapacidadMax;
		this.CantidadActual = CantActual;
		
		if (CantidadActual > CapacidadMaxima) {
			
			this.CantidadActual = CapacidadMaxima;
		}
	}
	
	void llenarCafetera () {
		
		this.CantidadActual = CapacidadMaxima;
	}
	
	int servirTaza (int Taza) {
		
		this.CantidadActual += Taza;
		
		if (Taza < CapacidadMaxima) {
			
			System.out.println("Se Agrego Mas Café A La Taza: " + CantidadActual);
		}
		
		else {
			
			System.out.println("Ya Esta Llena La Taza De Café");
		}
		
		return Taza;
	}
	
	int agregarCafe (int Cafes) {
		
		this.CapacidadMaxima += Cafes;
		System.out.println("Se Han Agregado Esta Cantidad De Cafés: " + CapacidadMaxima);
		return Cafes;
	}

	@Override
	public String toString() {
		return "Cafetera La Capacidad Máxima De Esta Es: " + CapacidadMaxima + " C.C: , Cantidad Actual De La Cafetera: " + CantidadActual + " C.C" + "\n";
	}
	
	void Informacion () {
		
		System.out.println("Cantidad Actual De Cafes En La Cafetera: " + CantidadActual);
		System.out.println("Capacidad Maxima De La Cafetera: " + CapacidadMaxima);
	}
	
}
