package Character;

import java.util.*;

public class Acierta_Palabra {
	
	static void JuegoPalabra () {
		

		System.out.println("!INICIAMOS EL JUEGO DE ACIERTA LA PALABRA¡");
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce La Palabra Secreta: ");

		String Contraseña1 = sc.nextLine();

		System.out.println("Introduce La Palabra Para Adivinar");

		String Pistas = sc.nextLine();

		while (!Contraseña1.equals(Pistas)) {

			if (Contraseña1.compareTo(Pistas) > Pistas.compareTo(Contraseña1)) {

				System.out.println("La Contraseña Es Mayor.");
			}

			else {

				System.out.println("Las Contraseña Es Menor");
			}

			Pistas = sc.nextLine();

		}

		System.out.println("!Has Adivinado La Contraseña¡");

		sc.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Diseña el juego "acierta la contraseña". La mecánica del juego es la
		 * siguiente: el primer jugador introduce la contraseña; a continuación, el
		 * segundo jugador debe teclear palabras hasta que la acierte. Como pistas se
		 * debe decir si la palabra introducida alfabéticamente mayor o menor que la
		 * contraseña.
		 * 
		 * Ayuda: puedes usar los métodos 'equals' y 'compareTo' de la clase String
		 */

		
		JuegoPalabra();

	}

}