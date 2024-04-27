package Examen1;

public class Funcion_RectanguloEspacios {

	static int RectanguloVacio(int Altura, int Anchura) {

		for (int i = 0; i <= Altura; i++) {

			for (int j = 0; j <= Anchura; j++) {

				if (i == 0 || i == Altura || j == 0 || j == Anchura) {

					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		return Anchura + Altura;
	}
	

	static int Trianguloizq(int Filas) {

		for (int i = 0; i < Filas; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print("*");
			}

			System.out.println("");
		}

		return Filas;
	}
	

	static int Trianguloder(int Filas) {

		for (int i = 0; i <= Filas; i++) {

			for (int k = 0; k <= Filas - i; k++) {

				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println("");
		}

		return Filas;
	}
	
	
	static int Trianguloinvert (int Largo) {
		
		
		for (int i = 0; i <= Largo; Largo--) {
			
			for (int j = 0; j <= Largo; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		return Largo;
	}
	
	static int cuadrado (int Cuadrado) {
		
		for (int i = 0; i < Cuadrado; i++) {
			
			for (int j = 0; j < Cuadrado; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		return Cuadrado;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RectanguloVacio(4, 16);
		
		System.out.println();

		RectanguloVacio(4, 9);
		
		System.out.println();

		cuadrado(4);
		
		System.out.println();


		Trianguloizq(5);

		System.out.println();

		Trianguloder(5);
		
		System.out.println();
		
		Trianguloinvert(6);

	}

}