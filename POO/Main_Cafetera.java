package POO;

public class Main_Cafetera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CONSTRUCTOR VACIO DE LA CAFETERA
		
		Cafetera Caf1 = new Cafetera ();
		System.out.println(Caf1);
		Caf1.llenarCafetera();
		Caf1.Informacion();
		System.out.println();
		
		// CONSTRUCTOR QUE INICIALIZA EL VALOR DE LA CAPACIDAD MAXIMA A LA ACTUAL.
		
		Cafetera Caf2 = new Cafetera (1500);
		Caf2.Informacion();
		System.out.println();
		
		// CONSTRUCTOR EN EL CUAL LA CANTIDAD ACTUAL ES MAYOR A LA CAPACIDAD.
		
		Cafetera Caf3 = new Cafetera (1200, 1500);
		Caf3.Informacion();
		Caf3.llenarCafetera();
		Caf3.servirTaza(150);
		Caf3.agregarCafe(500);
		System.out.println();
		Caf3.Informacion();
	}

}
