package Character;

import java.util.*;

public class Espacios_Blancos {
	
	static void Espacios () {
		
		System.out.println("Introduce Una Cadena De Texto:");

		Scanner Cadena = new Scanner(System.in);

		String Frase = Cadena.nextLine();

		int espacios = 0;

		for (int i = 0; i < Frase.length(); i++) {

			char letras = Frase.charAt(i);

			if (Character.isSpaceChar(letras)) {

				espacios = espacios + 1;

				System.out.println("Espacios Encontrados: " + espacios);

			}
		}

		Cadena.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Diseñar una aplicación que pida al usuario que introduzca una frase por
		 * teclado e indique cuántos espacios en blanco tiene.
		 */
		
		Espacios();

	}

} 