package Arrays;
import java.util.*;
public class Cámara_Secreta {
	
	
	public static int[] Aleatoria(int Secreta[]) {
		
		for (int j = 0; j < Secreta.length; j++) {
			Secreta[j] = (int) (Math.random() * 5 + 1);
		}
		
		return Secreta;
	}
	
	
	public static int[] Apuesta(int Apuesta[]) {
		
		@SuppressWarnings("resource")
		Scanner Numero = new Scanner(System.in);
		
		for (int k = 0; k < Apuesta.length; k++) {
			
			Apuesta[k] = Numero.nextInt();
		}
		return Apuesta;
	}
	
	
	public static int[] Pistas(int Secreta[], int Combinacion[]) {
		
		for (int i = 0; i < Combinacion.length; i++) {
			
			if (Secreta[i] > Combinacion[i]) {
				System.out.println(Combinacion[i] + ": El Numero Esta En Un Rango Mayor\n");
			}
			
			else if (Secreta[i] < Combinacion[i]) {
				System.out.println(Combinacion[i] + ": El Numero Esta En Un Rango Menor\n");
			}
			
			else {
				System.out.println(Combinacion[i] + " Los Numeros Son Iguales.\n");
			}
		}
		return Combinacion;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desarrollar el juego "la cámara secreta" que consiste en abrir una cámara
		 * mediante su combinación secreta, que está formada por una combinación de
		 * dígitos de uno al cinco. El jugador especificará cuál es la longitud de la
		 * combinación, a mayor longitud, mayor será la dificultad del juego. La
		 * aplicación genera de forma aleatoria una combinación secreta que el usuario
		 * tendrá que acertar. En cada intento se muestra como pista, para cada dígito
		 * de la combinación introducido si es mayor, menor o igual que el
		 * correspondiente en la combinación secreta
		 */
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce La Longitud De La Camara:");
		int valores = entrada.nextInt();
		
		
		int Clave[] = new int[valores];
		int MiClave[] = new int[valores];
		
		Aleatoria(Clave);
		
		System.out.println("Introduce Los Numeros Del Array Apuesta:");
		Apuesta(MiClave);
		
		
		while (!Arrays.equals(Clave, MiClave)) {
			
			Pistas(Clave, MiClave);
			System.out.println("Escribe La Combinacion: \n");
			Apuesta(MiClave);
		}
		
		System.out.println("!Fin Del Juego Cámara Abierta¡");
		entrada.close();
	}
}
