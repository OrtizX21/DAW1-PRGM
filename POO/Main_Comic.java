package POO;

public class Main_Comic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CREANDO LOS OBJETOS CÓMIC.
		
		Comic Comic1, Comic2, Comic3;
		
		//////////////////////////////////////////////////////////////////

		// PRESTANDO UN CÓMIC.
		
		Comic1 = new Comic ("Hajime No Ippo", "Manga Boxeo", 179, 20, 4);
		
		Comic1.Prestamo();
		Comic1.Info();
		
		System.out.println();
		
		//////////////////////////////////////////////////////////////////
		
		// REGRESANDO UN CÓMIC.
		
		Comic1.Devolucion();
		Comic1.Info();
		
		System.out.println();
		
		//////////////////////////////////////////////////////////////////
		
		// SIN CÓMICS DISPONIBLES.
		
		Comic2 = new Comic ("Ashita No Joe", "Manga Boxeo", 180, 0, 9);
		
		Comic2.Info();
		
		System.out.println();
		
		//////////////////////////////////////////////////////////////////

		// CON CÓMICS DISPONIBLES.
		
		Comic3 = new Comic ("One Piece", "Manga Acción", 181, 10, 0);
		
		Comic3.Info();

	}

}