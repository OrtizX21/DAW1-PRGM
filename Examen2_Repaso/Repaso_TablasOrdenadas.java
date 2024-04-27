package Examen2_Repaso;
import java.util.*;

// ESTE ARCHIVO CONTIENE COMO INSERTAR VALORES, BORRAR VALORES, RECORRER ARRAYS EN ORDEN Y DESORDEN.

public class Repaso_TablasOrdenadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CREACION DE ARRAY CON VALORES DEFINIDOS.
		int Dorsales[] = { 10, 11, 7, 5, 9, 1, 4, 12 };

		// TRATAR LA TABLA DE MANERA ORDENADA.
		Arrays.sort(Dorsales);

		// MOSTRAMOS LOS VALORES DE LA TABLA.
		System.out.println("Dorsales Del Real Madrid:" + Arrays.toString(Dorsales));

		// MOSTRAMOS LA LONGITUD DE LA TABLA.
		System.out.println("Tamaño De La Tabla De Dorsales: " + Dorsales.length);

		// RECORREMOS LA TABLA DE MANERA CRECIENTE.
		for (int i = 0; i < Dorsales.length; i++) {

			System.out.print(Dorsales[i] + " ");
		}

		System.out.println();

		// RECORREMOS LA TABLA DE FORMA DECRECIENTE
		for (int j = Dorsales.length - 1; j >= 0; j--) {

			System.out.print(Dorsales[j] + " ");
		}

		System.out.println();

		// HACEMOS USO DEL ARRAYS.COPYOF PARA COPIAR UNA TABLA.
		int Copia1[];

		// ESTE METODO NOS PERMITE COPIAR LOS VALORES Y LA LONGITUD DE LA TABLA QUE LE INDIQUEMOS.
		Copia1 = Arrays.copyOf(Dorsales, Dorsales.length);
		System.out.println(Arrays.toString(Copia1));

		// HACEMOS USO DEL ARRAYS.COPYOFRANGE.
		int Copia2[];

		// ESTE NOS COPIA DE LA TABLA QUE LE INDIQUEMOS, LA POSICION DESDE LA QUE
		// QUEREMOS COPIAR Y LA CANTIDAD DE VALORES.
		Copia2 = Arrays.copyOfRange(Dorsales, 0, 3);
		System.out.println("Usando El Copy Of Range: " + Arrays.toString(Copia2));

		// BORRAR EN TABLAS ORDENADAS.

		// POSICION ES EL INDICE DONDE SE ENCUENTRA EL VALOR QUE QUEREMOS ELIMINAR.
		int Posicion = 0;

		// NUMERO ELEMENTO ES LA LONGITUD DE LA TABLA QUE TENEMOS.

		for (int k = Posicion; k < Dorsales.length - 1; k++) {

			Dorsales[k] = Dorsales[k + 1];
		}
		Dorsales[Dorsales.length - 1]--;

		System.out.println("Eliminamos El Primer Valor De La Tabla: " + Arrays.toString(Dorsales));

		// INSERTAR VALORES EN TABLAS ORDENADAS.

		int Elemento = 8;
		int Indice = 7;

		for (int i = Elemento - 1; i > Indice; i--) {

			Dorsales[i] = Dorsales[i + 1];
		}

		Dorsales[Indice] = 91;

		Dorsales = Arrays.copyOf(Dorsales, Dorsales.length + 1);
		Dorsales[Dorsales.length - 1] = 77;

		System.out.println("Agregamos Un Valor A La Tabla: " + Arrays.toString(Dorsales));

		int[] Auxiliar = new int[Dorsales.length + 1];
		int indice = Arrays.binarySearch(Dorsales, 99);

		if (indice >= 0) {

			System.arraycopy(Dorsales, 0, Auxiliar, 0, indice);
			System.arraycopy(Dorsales, indice, Auxiliar, indice + 1, Dorsales.length - indice);
			Auxiliar[indice] = 99;
		}
		
			else {

			indice = -indice - 1;
			System.arraycopy(Dorsales, 0, Auxiliar, 0, indice);
			System.arraycopy(Dorsales, indice, Auxiliar, indice + 1, Dorsales.length - indice);
			Auxiliar[indice] = 99;
		}

		Dorsales = Arrays.copyOf(Auxiliar, Auxiliar.length);
		
		int Registros = Dorsales.length;
		
		System.out.println("La Tabla T Contiene Este Numero De Registros: " + Registros);
		System.out.println(Arrays.toString(Auxiliar));

	}
}