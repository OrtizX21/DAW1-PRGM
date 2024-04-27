package Examen1Papel;

public class Programa_Fin {

	static int Rectangulo_Lleno(int Largo, int Ancho) {

		for (int i = 0; i < Largo; i++) {

			for (int j = 0; j < Ancho; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		return Largo + Ancho;
	}

	
	static int Rectangulo_Hueco(int Largo, int Ancho) {

		for (int i = 0; i <= Largo; i++) {

			for (int j = 0; j <= Ancho; j++) {

				if (i == 0 || i == Largo || j == 0 || j == Ancho) {

					System.out.print("*");
				}

				else {

					System.out.print(" ");
				}

			}

			System.out.println();
		}
		return Largo + Ancho;
	}
	

	static int TrianguloRec(int Triangulo) {

		for (int i = 0; i < Triangulo; Triangulo--) {

			for (int j = 0; j < Triangulo; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		return Triangulo;
	}
	
	static int Piramide (int Piramide) {
		
		for (int i = 1; i <= Piramide; Piramide--) {
			
			
			for (int j = 0; j < Piramide; j++) {
				
				System.out.print("*");
			}
	
			System.out.println(" ");

		}
		

		
		
		return Piramide;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangulo_Lleno(4, 16);

		System.out.println(" ");

		Rectangulo_Hueco(4, 16);

		System.out.println(" ");

		TrianguloRec(8);
		
		Piramide(8);
	}

}