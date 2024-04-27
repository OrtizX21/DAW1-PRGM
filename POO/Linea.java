package POO;

public class Linea {

	// CREAMOS DOS OBJETOS DE TIPO PUNTO QUE HACE REFERENCIA AL PLANO CARTESIANO VACIO.
	private Punto PuntoA;
	private Punto PuntoB;
	
	// CONSTRUCOTR PARA DAR LOS PUNTOS DE LAS DOS LINEAS X, Y
	public Linea (Punto Punto1, Punto Punto2) {
		
		this.PuntoA = Punto1;
		this.PuntoB = Punto2;	
	}
	
	@Override
	public String toString() {
		return "Linea [PuntoA = " + PuntoA + ", PuntoB = " + PuntoB + "]";
	}
	
	// HACEMOS REFERENCIA DE AMBOS PUNTOS CON EL EJE X PARA MOVERLOS AL EJE POSITIVO.
	double mueveDerecha (double xPositivo) {
		
		this.PuntoA.x += xPositivo;
		this.PuntoB.x += xPositivo;
		return xPositivo;
	}
	// HACEMOS REFERENCIA DE AMBOS PUNTOS CON EL EJE X PARA MOVERLOS AL EJE NEGATIVO.
	double mueveIzquierda (double xNegativo) {
		
		this.PuntoA.x -= xNegativo;
		this.PuntoB.x -= xNegativo;
		return xNegativo;
	}
	
	// HACEMOS REFERENCIA DE AMBOS PUNTOS CON EL EJE X PARA MOVERLOS AL EJE POSITIVO.
	double mueveArriba (double yPositivo) {
		
		this.PuntoA.y += yPositivo;
		this.PuntoB.y += yPositivo;
		return yPositivo;
	}
	
	// HACEMOS REFERENCIA DE AMBOS PUNTOS CON EL EJE X PARA MOVERLOS AL EJE NEGATIVO.
	double mueveAbajo (double yNegativo) {
		
		this.PuntoA.y -= yNegativo;
		this.PuntoB.y -= yNegativo;
		return yNegativo;
	}	
	
	// METODO PARA COMPROBAR SI LAS LINEAS SON PARALELAS CON SU FORMULA.
	public static boolean lineasParalelas (Linea uno, Linea dos) {
		
		boolean Paralela = false;
		
		double forma1 = (uno.PuntoA.y - dos.PuntoB.y)/(uno.PuntoA.x - dos.PuntoB.x);
		double forma2 = (dos.PuntoA.y - uno.PuntoB.y)/(dos.PuntoA.x - uno.PuntoB.x);
		
		if (forma1 == forma2) {
			
			Paralela = true;
		}
		
		return Paralela;
	}
}