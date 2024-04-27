package Arrays_Bidemensionales;
import java.util.*;

public class Mult_Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementa la función int [ ] [ ] productoMatrices ( int [ ] [ ] matrizUno,
		 * int [ ] [ ] matrizDos) la cual devuelve otra matriz resultado de la
		 * multiplicación de matrizUno x matrizDos.
		 */

		int[][] matrizUno = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matrizDos = { { 1, 4, 7, }, { 2, 5, 8, }, { 3, 6, 9 } };

		int[][] productoMatrices = new int[matrizUno.length][matrizDos[0].length];

		if (matrizUno[0].length != matrizDos.length) {

			System.out.println("NO SE PUEDE REALIZAR EL CALCULO");
		}

		else {

			// FILAS DE LA MATRIZ UNO
			for (int i = 0; i < matrizUno.length; i++) {

				// COLUMNAS DE LA MATRIZ DOS
				for (int j = 0; j < matrizDos[0].length; j++) {

					// COLUMNAS DE LA MATRIZ UNO
					for (int k = 0; k < matrizUno[0].length; k++) {

						productoMatrices[i][j] += matrizUno[i][k] * matrizDos[k][j];
					}
				}
			}
		}

		System.out.println(Arrays.deepToString(productoMatrices));

	}

}