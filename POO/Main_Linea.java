package POO;

public class Main_Linea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CREO Y MUESTRO TODOS LOS PUNTOS CON EL METODO TO STRING.
		Punto Punto1 = new Punto (0.0, 5.0);
		System.out.println(Punto1);
		
		Punto Punto2 = new Punto (1.0, 1.0);
		System.out.println(Punto2 + "\n");
		
		Punto Punto3 = new Punto (0.0, 5.0);
		System.out.println(Punto3);
		
		Punto Punto4 = new Punto (1.0, 1.0);
		System.out.println(Punto4);

		System.out.println();

		// CREO Y MUESTRO TODOS LAS LINEAS CON EL METODO TO STRING.
		Linea MiLinea1 = new Linea (Punto1, Punto2);
		
		/*MiLinea1.mueveArriba(0.0);
		MiLinea1.mueveAbajo(0.0);
		MiLinea1.mueveIzquierda(0.0);
		MiLinea1.mueveDerecha(0.0);
		*/
		
		Linea MiLinea2 = new Linea (Punto3, Punto4);
		
		/*MiLinea1.mueveArriba(0.0);
		MiLinea1.mueveAbajo(0.0);
		MiLinea1.mueveIzquierda(0.0);
		MiLinea1.mueveDerecha(0.0);
		*/
		
		System.out.println(MiLinea1 + "\n");
		System.out.println(MiLinea2 + "\n");
		
		// COMPRUEBO SI LAS LINEAS SON PARALELAS CON EL METODO LINEAS PARALELAS DE LA CLASE PUNTO.
		boolean Paralelas = Linea.lineasParalelas(MiLinea1, MiLinea2);
		
		if (Paralelas == true) {
			
			System.out.println("Las Lineas Son Paralelas: " + Paralelas + ".");
		}
		
		else {
			Paralelas = false;
			System.out.println("Las Lineas No Son Paralelas: " + Paralelas + ".");
		}		
	}
}