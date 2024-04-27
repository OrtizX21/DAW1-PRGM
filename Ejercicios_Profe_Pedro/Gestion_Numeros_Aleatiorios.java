package Ejercicios_Profe_Pedro;
import java.util.*;

public class Gestion_Numeros_Aleatiorios {
	
	static int[] Aleatorios (int tabla[]) {
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random()*10)+ 1;
		}
		return tabla;
	}
	static int[] mostrarInfo(int tabla []) {
		System.out.println("Mostrando la tabla con valores aleatorios: " + Arrays.toString(tabla) + "\n");
		return tabla;
	}
	static int[] copiarArray(int tabla[]) {
		int copia [] = Arrays.copyOf(tabla, tabla.length); 
		System.out.println("Copia de la tabla: " + Arrays.toString(copia)+ "\n");
		return copia;
	}
	static int[] copiarDosArrays(int tabla1[], int tabla2[]) {
		int copia2 [] = Arrays.copyOf(tabla1, tabla1.length + tabla2.length);
		System.arraycopy(tabla2, 0, copia2, tabla1.length, tabla2.length);
		System.out.println("Uniendo las dos tablas: " + Arrays.toString(copia2) + "\n");
		return copia2;
	}
	static int[] buscarElemento(int tabla[], int valor) {
		int posicion = 0;
		while(posicion < tabla.length && tabla[posicion] != valor) {
			posicion++;
		}
		if(posicion <= tabla.length) {
			System.out.println("Tabla donde estamos buscando: " + Arrays.toString(tabla) + "\n");
			System.out.println("Valor encontrado en la posición: " + posicion + "\n");
		}
		if (posicion >= tabla.length) {
			System.out.println("Tabla donde estamos buscando: " + Arrays.toString(tabla) + "\n");
			System.out.println("No se encontro el valor.");
		}
		return tabla;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla1 [] = new int [10];
		int tabla2 [] = {111, 777, 999};
		
		Aleatorios(tabla1);
		mostrarInfo(tabla1);
		copiarArray(tabla1);
		
		copiarDosArrays(tabla1, tabla2);
		buscarElemento(tabla2, 999);
		buscarElemento(tabla2, 0);
		
	}

}
