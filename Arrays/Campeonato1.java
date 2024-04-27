package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Campeonato1 {

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
		Scanner Puntuaciones = new Scanner (System.in);
		
		System.out.println("Introduce La Puntuación De Los Programadores:");
		
		int Programadores[] = new int [5];

		
		
		for (int i = 0; i < Programadores.length; i++) {
			
			Programadores[i]  = Puntuaciones.nextInt();
						
			System.out.println(Arrays.toString(Programadores));
				
		}
		
		Arrays.sort(Programadores);
		
		System.out.println(Arrays.toString(Programadores));
		
		
		
		int ProgramadoresExhibicion [] = Arrays.copyOf(Programadores, Programadores.length);
		int Valores = Puntuaciones.nextInt();

		
		  while (Valores != -1) {
			  
			ProgramadoresExhibicion = Arrays.copyOf(ProgramadoresExhibicion, ProgramadoresExhibicion.length + 1); 
			
			  System.out.println(Arrays.toString(ProgramadoresExhibicion));
			  
				ProgramadoresExhibicion [ProgramadoresExhibicion.length -1] = Valores;
					Valores	= Puntuaciones.nextInt();
			
		 }
		  
		  Arrays.sort(ProgramadoresExhibicion);
		  System.out.println(Arrays.toString(ProgramadoresExhibicion));

		 
		  Puntuaciones.close();
		  
	}
}