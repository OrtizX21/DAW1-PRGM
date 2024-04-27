package Pruebas;
import java.util.*;

public class Paso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner mover = new Scanner(System.in);
		 * System.out.println("Introduce los dorsales que quieres mover a la izquierda:"
		 * ); int numero = mover.nextInt(); int tabla1 [] = {11, 12, 13, 14, 15 , 16};
		 * System.out.println("Tabla 1 antes de mover los elementos: " +
		 * Arrays.toString(tabla1));
		 * 
		 * for(int i = 0; i < tabla1.length - 1; i++) { tabla1[i] = tabla1[i + 1];
		 * 
		 * } tabla1[tabla1.length - 1] = 0; tabla1 = Arrays.copyOf(tabla1, tabla1.length
		 * - 1);
		 * 
		 * System.out.println("Despues de mover a la izquierda: " +
		 * Arrays.toString(tabla1));
		 */
		Scanner mover = new Scanner(System.in);
		System.out.println("Introduce los dorsales que quieres mover: ");
		int indice = mover.nextInt();
		
		int menores [] = {12, 13, 14, 15, 16, 17, 8};
		System.out.println("Antes de mover a la izquierda: " + Arrays.toString(menores));
		int primerElemento = menores[indice];
		while(indice != - 1) {
		for(int i = indice; i < menores.length - 1; i++) {
			menores[i] = menores[i + 1];
		}
		indice = mover.nextInt();
		menores[menores.length - 1]= primerElemento;
		System.out.println("Moviendo a la izquierda: " + Arrays.toString(menores));
		menores = Arrays.copyOf(menores, menores.length);

		}
		menores = Arrays.copyOf(menores, menores.length - 1);
		System.out.println("Despues de mover a la izquierda: " + Arrays.toString(menores));
		mover.close();
		


	}

}
