package Mercadillo_Arrays;
import java.util.*;

public class Mercadillo3_Forma1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Paso 1º Pedir al usuario un número entero por consola.
		// Paso 2º Mostrar un mensaje por consola.
		System.out.println("Introduce los números de los dorsales: ");
		Scanner numeros = new Scanner(System.in);
		int num = numeros.nextInt();
		
		// Paso 3º Crear una tabla de tamaño X (0, 1000, 50000…).
		int dorsales [] = new int [0];
		
		// Paso 4º Crear un bucle que se repita mientras se cumpla una condición.
		while(num != -1) {
			// Paso 5º Copiar una tabla dada con un espacio más.
			dorsales = Arrays.copyOf(dorsales, dorsales.length + 1);
			dorsales[dorsales.length - 1]= num;
			num = numeros.nextInt();
		}
		numeros.close();
		System.out.println("Dorsales: " + Arrays.toString(dorsales) + "\n");
		
		// Paso 6º Guardar datos en la posición X de una tabla (en la última, primera…).
		boolean menor = false;
		int buscar = 13;
		
		// Paso 7º Salir de un bucle for que está recorriendo una tabla de principio a fin en busca de un valor dado.
		for(int i = 0; i < dorsales.length && menor == false; i++) {
			if(dorsales[i] == buscar) {
				menor = true;
				// Paso 8º Guardar el dato de la posición de una tabla en un variable.
				int aux = dorsales[i];
				dorsales[i] = dorsales[i - 1];
				dorsales[i - 1] = aux;
			}
		}
		System.out.println("Moviendo el menor: " + Arrays.toString(dorsales) + "\n");
		
		//Paso 9º Recorrer una tabla de principio a fin mirando lo que hay en cada una de sus celdas.
		int posicion = 0;
		int aBorrar = 17;
		while(posicion < dorsales.length && dorsales[posicion] != aBorrar) {
			posicion++;
		}
		if(posicion <= dorsales.length) {
			dorsales[posicion] = dorsales[dorsales.length - 1];
			dorsales[dorsales.length - 1] = dorsales.length;
			dorsales = Arrays.copyOf(dorsales, dorsales.length - 1);
			System.out.println("Indice donde esta el valor a borrar: " + posicion + "\n");
			System.out.println("Eliminando el dorsal 17: " + Arrays.toString(dorsales) + "\n");
		}
		
		//Paso 10º Hacer que se ejecute un trozo de código si no se ha cumplido una condición anterior (si no se cumple esto haz lo siguiente).
		boolean noPago = false;
		int sinPagar = 11;
		for(int i = 0; i < dorsales.length && noPago == false; i++) {
			if(dorsales[i] == sinPagar) {
				noPago = true;
				int aux = dorsales[i];
				dorsales[dorsales.length - 1] = aux;
				System.arraycopy(dorsales, i + 1, dorsales, i, dorsales.length - i - 1);
				dorsales = Arrays.copyOf(dorsales, dorsales.length - 1);
				System.out.println("Moviendo el menor 11 al final: " + Arrays.toString(dorsales) + "\n");
			}
		}
		// Paso 11º Copiar un rango de elementos de una tabla a otra tabla.
		int podio [] = Arrays.copyOfRange(dorsales, 0, 3);
		System.out.println("Oro: " + podio[0] + " ,Plata: " + podio[1] + ", Bronce: " + podio[2] + " " +  Arrays.toString(podio));
	}
}