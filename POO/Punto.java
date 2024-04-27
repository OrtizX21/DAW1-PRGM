package POO;

public class Punto {

	double x;
	double y;
	
	// CREAMOS EL OBJETOS DE TIPO PUNTO QUE SON LOS EJES.
	public Punto (double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	void infoPuntos () {
		
		System.out.println("Valores Del Punto X: " + x);
		System.out.println("Valores Del Punto Y: " + y);
	}
}