package Mercadillo_Arrays;

import java.util.*;

public class Mercadillo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PASO 1 DEFINIR Y CREAR EL ARRAY BIDIMENSIONAL Y LAS VARIABLES.
		int matriz[][] = new int[4][4];
		int sumaColumnas0 = 0, sumaFilas0 = 0,sumaColumnas1 = 0, sumaFilas1 = 0, sumaColumnas2 = 0, sumaFilas2 = 0, sumaColumnas3 = 0, sumaFilas3 = 0;

		// PASO 2 RELLENAMOS EL ARRAR CON EL SCANNER.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce los valores de la matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = entrada.nextInt();				
			}
		}
		entrada.close();
		
		//PASO 3 RECORREMOS LOS ARRAYS CON DOS BUCLES (PRIMERO LAS FILAS), (SEGUNDO LAS COLUMNAS) Y ASIGNAMOS UNA VARIABLE SUMA
		//PARA GUARDAR TODOS LOS VALORES TANTO DE FILAS COMO COLUMNAS.
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
		
		//PASO 4 COMPROBRAMOS QUE TODOS LAS SUMAS DE LAS FILAS Y LAS COLUMNAS SEAN IGUALES PARA QUE SEA MÁGICA.
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
	}
}