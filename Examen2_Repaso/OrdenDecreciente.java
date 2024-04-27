package Examen2_Repaso;

import java.util.Arrays;

public class OrdenDecreciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla1 [] = {0,99,98,100,9};
		
		Arrays.sort(tabla1);
		System.out.println(Arrays.toString(tabla1));
		
		int tabla1Decreciente [] = new int [tabla1.length];
		System.out.println("Hacemos copia de la longitud: " + Arrays.toString(tabla1Decreciente));
		
		for (int i = 0; i < tabla1.length; i++) {
			tabla1Decreciente[i] = tabla1[tabla1.length -1 - i];
		}
		System.out.println("Despues de copiar los valores de forma decreciente: " + Arrays.toString(tabla1Decreciente));
		System.out.println("Despues de hacer la copia: " + Arrays.toString(tabla1));
	}

}
