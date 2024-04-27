package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Campeonato2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Diseñar una aplicación para gestionar un campeonato de programación, donde se
		 * introduce la puntuación (enteros) obtenidos por 5 programadores, conforme van
		 * terminando su prueba. La aplicación debe mostrar las puntuaciones ordenadas
		 * de los 5 participantes. En ocasiones, cuando finalizan los 5 participantes
		 * anteriores, se suman al campeonato programadores de exhibición, cuyos puntos
		 * se incluyen con el resto. La forma de especificar que no intervienen más
		 * programadores de exhibición es introducir como puntuación un -1. La
		 * aplicación debe mostrar, finalmente, los puntos ordenados de todos los
		 * participantes
		 */
		Scanner Puntuaciones = new Scanner(System.in);
		

		System.out.println("Introduce La Puntuación De Los Programadores:");
		

		int Programadores[] = new int[5];

		for (int i = 0; i < Programadores.length; i++) {

			Programadores[i] = Puntuaciones.nextInt();

		}

		
		Arrays.sort(Programadores);
		System.out.println(Arrays.toString(Programadores));
		

		int PromExhibicion = Puntuaciones.nextInt();

		while (PromExhibicion != -1) {

			int indiceinsercion = Arrays.binarySearch(Programadores, PromExhibicion);

			
			if (indiceinsercion < 0) {

				indiceinsercion = -indiceinsercion - 1;
			}

			
			int PuntosExhibicion[] = new int[Programadores.length + 1];

			
			System.arraycopy(Programadores, 0, PuntosExhibicion, 0, indiceinsercion);
			

			System.arraycopy(Programadores, indiceinsercion, PuntosExhibicion, indiceinsercion + 1,Programadores.length - indiceinsercion);

			
			PuntosExhibicion[indiceinsercion] = PromExhibicion;

			
			Programadores = PuntosExhibicion;

			
			System.out.println(Arrays.toString(Programadores));

			
			PromExhibicion = Puntuaciones.nextInt();

		}

		System.out.print("Puntuación final: " + Arrays.toString(Programadores));

		Puntuaciones.close();
	}
}