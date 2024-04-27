package Pruebas;

import java.util.*;

public class Apuntes_CopiaBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PASO 1 RELLENAREMOS LA TABLA CON VALORES PASADOS POR SCANNER.
		int matriz[][] = new int[4][4];
		int sumaColumnas0 = 0; 
		int sumaFilas0 = 0;
		int suma = 0;
		int sumaColumnas1 = 0; 
		int sumaFilas1 = 0;
		int sumaColumnas2 = 0; 
		int sumaFilas2 = 0;
		int sumaColumnas3 = 0; 
		int sumaFilas3 = 0;

		// PASO 2.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce los valores de la matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = entrada.nextInt();
				suma += matriz[i][j];
				
			}
		}
		entrada.close();
		System.out.println(suma);
		for (int i = 0; i < matriz.length; i++) {
			sumaFilas0 += matriz[i][0];	
			sumaFilas1 += matriz[i][1];	
			sumaFilas2 += matriz[i][2];	
			sumaFilas3 += matriz[i][3];
		}
		for (int k = 0; k < matriz[0].length; k++) {
			sumaColumnas0 += matriz[0][k];				
			sumaColumnas1 += matriz[1][k];
			sumaColumnas2 += matriz[2][k];
			sumaColumnas3 += matriz[3][k];
		}
		
		if (sumaFilas0 == sumaColumnas0 && sumaFilas1 == sumaColumnas1 && sumaFilas2 == sumaColumnas2 && sumaFilas3 == sumaColumnas3 ) {
			System.out.println("!MATRIZ MÁGICA¡: " + Arrays.deepToString(matriz));
			System.out.println();
			System.out.println("Suma de las columnas 1: " + sumaColumnas0);
			System.out.println("Suma de las filas 1: " + sumaFilas0);
			System.out.println();
			
			System.out.println("Suma de las columnas 2: " + sumaColumnas1);
			System.out.println("Suma de las filas 2: " + sumaFilas1);
			System.out.println();
			
			System.out.println("Suma de las columnas 3: " + sumaColumnas2);
			System.out.println("Suma de las filas 3: " + sumaFilas2);
			System.out.println();
			
			System.out.println("Suma de las columnas 4: " + sumaColumnas3);
			System.out.println("Suma de las filas 4: " + sumaFilas3);
			System.out.println();
		}
		else {
			System.out.println("!Matriz Normal¡: " + Arrays.deepToString(matriz));
		}

		/*
		 * int copia [][] = new int [0][0];
		 * 
		 * 
		 * for(int i = 0; i < matriz.length; i++) { copia = Arrays.copyOf(matriz,
		 * matriz.length); for (int k = 0; k < matriz[0].length; k++) { copia =
		 * Arrays.copyOf(matriz, matriz.length + matriz[0].length); } } copia =
		 * Arrays.copyOf(matriz, matriz.length); System.out.println("Matriz Original" +
		 * Arrays.deepToString(matriz)); System.out.println("Copia Matriz" +
		 * Arrays.deepToString(copia));
		 */

		/*
		 * for(int[] i : matriz) { sumaFilas = i; for (int elemento : i) { sumaColumnas
		 * = elemento; System.out.print(elemento + ""); } System.out.println(); }
		 */
	}
}