package Pruebas;

import java.util.*;

public class Examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 CREAR TABLA DE 1000 ELEMENTOS.
		int t[] = new int[1000];

		// 2 INICIALIZAR LA TABLA CON VALORES MAYORES A -100.
		for (int i = 0; i < t.length; i++) {

			t[i] = (int) ((Math.random() * -100) + 200);
		}

		// 3 MOSTRAR LA SUMA DE TODOS LOS VALORES DE LA TABLA.
		int Suma = 0;

		for (int i = 0; i < t.length; i++) {

			Suma = Suma + t[i];
		}

		System.out.println("La Suma De Los Elementos Es: " + Suma);

		System.out.println();

		System.out.println(Arrays.toString(t));

		// 4 BORRAR LOS ELEMENTOS QUE SEAN 20 DE LA TABLA.

		//ELIMINACION EN TABLA NO ORDENADA.
		int i = 0;
		int Valor = 20;

		while (i < t.length) {

			if (t[i] == Valor) {

				t[i] = t[t.length - 1];

				t = Arrays.copyOf(t, t.length - 1);
			}

			else {

				i++;
			}
		}

		int Numeros = t.length;

		System.out.println(Arrays.toString(t));
		System.out.println("Cantidad De Registro En La Tabla: " + Numeros);

		// 5 INSERTAR EL NUMERO 28 EN LA TABLA T.
		t = Arrays.copyOf(t, t.length + 1);
		t[t.length - 1] = 28;

		// 6 MOSTRAR LA TABLA Y TRATARLA DE MANERA ORDENADA.
		Arrays.sort(t);

		// 7 INSTERTAR EL NUMERO 35 EN LA TABLA.
		int[] aux1 = new int[t.length + 1];
		int indice = Arrays.binarySearch(t, 35);

		if (indice >= 0) { // Significa que el numero lo ha encontrado en la tabla
			System.arraycopy(t, 0, aux1, 0, indice);
			System.arraycopy(t, indice, aux1, indice + 1, t.length - indice);
			aux1[indice] = 35;

		} else { // No se encuentra en la tabla
			indice = -indice - 1;
			System.arraycopy(t, 0, aux1, 0, indice);
			System.arraycopy(t, indice, aux1, indice + 1, t.length - indice);
			aux1[indice] = 35;
		}

		t = Arrays.copyOf(aux1, aux1.length);

		// 8 MOSTRAR LA CANTIDAD DE REGISTROS QUE TIENE LA CUENTA.
		int Registros = t.length;
		System.out.println("La Tabla T Contiene Este Numero De Registros: " + Registros);

		// 9 CAMBIAR EL NOMBRE DE LA TABLA T A TABLAEXAMEN.
		int[] TablaExamen = t;
		System.out.println(Arrays.toString(TablaExamen));
		
		//ELIMINACION EN TABLA ORDENADA.
		
		int Pos = 0;
		int NumElemento = TablaExamen.length;
		
		for (int k = Pos; k < NumElemento; k++) {
			
			TablaExamen[k] = TablaExamen[k + 1];
		}
		NumElemento--;
		
		System.out.println("Registros En Tabla Examen: " + Registros);
		System.out.println(Arrays.toString(TablaExamen));

	}

}