package Arrays;

import java.util.*;

public class Eliminar_Mayores {

	static int[] Eliminar(int t[], int Valor) {

		int i = 0;

		while (i < t.length) {

			for (int j = 0; j < t.length; j++) {

				if (t[i] > Valor) {

					t[i] = t[t.length - 1];

					t = Arrays.copyOf(t, t.length - 1);
				}

				else
					i++;

			}
		}

		System.out.println(Arrays.toString(t));

		return t;

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir la función: int[] eliminarMayores (int t[], int valor) que crea y
		 * devuelve una copia de la tabla 't' donde se han eliminado todos los elementos
		 * que son mayores que 'valor'
		 */

		int TablaEliminar[] = { 11, 12, 13, 14, 25, 44, 55 };
		int Maximo = 12;

		Eliminar(TablaEliminar, Maximo);

	}
}