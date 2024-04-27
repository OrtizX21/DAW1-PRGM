package Arrays;
import java.util.*;

public class Mastermind {

	static void Muertos(int Secreto[], int Respuesta[]) {

		System.out.println("");
		System.out.print(" MUERTOS: ");

		for (int contador = 0; contador < Secreto.length; contador++) {

			for (int contador1 = 0; contador1 < Respuesta.length; contador1++) {

				if (Secreto[contador] == Respuesta[contador1] && contador == contador1) {

					System.out.print(Respuesta[contador1] + " ");
				}
			}
		}

	}

	static void Heridos(int TablaRespuesta[], int TablaAdivinanza[], int digitos) {

		System.out.println("");
		System.out.print(" HERIDOS: ");

		for (int contador1 = 0; contador1 < digitos; contador1++) {

			boolean encontrado = false;

			for (int contador2 = 0; contador2 < digitos; contador2++) {

				if (TablaRespuesta[contador1] == TablaAdivinanza[contador2] && contador1 != contador2) {

					encontrado = true;
					break;
				}
			}

			if (encontrado == false) {

				System.out.print(" X ");

			}

			else {

				System.out.print(TablaAdivinanza[contador1] + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("INICIAMOS EL JUEGO DE MASTERMIND ELIGE LA CANTIDAD DE DIGITOS");
		int Digitos = entrada.nextInt();

		System.out.println("ELIGE LA CANTIDAD DE INTENTOS PARA LOS JUGADORES");
		int Intentos = entrada.nextInt();

		int[] Jugador1 = new int[Digitos];
		int[] Jugador2 = new int[Digitos];

		int[] Apuesta1 = new int[Digitos];
		int[] Apuesta2 = new int[Digitos];
		
		
		int j = 0;
		
		while (j < Intentos) {
			
			System.out.println("");
			System.out.print("INTRODUCE LOS VALORES DEL JUGADOR 1, !JUGADOR 2 NO MIRES¡:");

			for (int i = 0; i < Jugador1.length; i++) {

				Jugador1[i] = entrada.nextInt();
			}
			System.out.println("");
			System.out.print("JUGADOR 2, !APUESTA POR ESTOS NÚMEROS¡:");

			for (int i = 0; i < Apuesta2.length; i++) {

				Apuesta2[i] = entrada.nextInt();
			}
			
			System.out.println("");
			System.out.print("INTRODUCE LOS VALORES DEL JUGADOR 2, !JUGADOR 1 NO MIRES¡:");

			for (int i = 0; i < Jugador2.length; i++) {

				Jugador2[i] = entrada.nextInt();
			}
			
			System.out.println("");
			System.out.print("JUGADOR 1, !APUESTA POR ESTOS NÚMEROS¡:");

			for (int i = 0; i < Apuesta1.length; i++) {

				Apuesta1[i] = entrada.nextInt();
			}

			Muertos(Jugador2, Apuesta1);
			System.out.println("");

			Muertos(Jugador1, Apuesta2);
			System.out.println("");

			Heridos(Apuesta2, Jugador1, Digitos);
			System.out.println("");

			Heridos(Apuesta1, Jugador2, Digitos);
			System.out.println("");

			
			j++;
		}
		

		entrada.close();

	}

}