package Mercadillo_Arrays;

import java.util.*;

public class Mercadillo3 {

	/*
	 * Diseña una aplicación para gestionar la llegada a meta de los participantes
	 * de una carrera. Cada uno de ellos dispone de un dorsal (número entero) que
	 * los identifica. EN la aplicación se introduce el número de dorsal de cada
	 * corredor cuando este llega a la meta. Para indicar que la carrera ha
	 * terminado se introduce como dorsal el número -1. A continuación la aplicación
	 * solicita información extra de los corredores. EN primer lugar se introducen
	 * los dorsales de todos los corredores menores de edad; para premiarlos por su
	 * esfuerzo se les avanza un puesto en el ranking general de la carrera, es
	 * decir, es como si hubieran adelantado al corredor que llevaban delante. En
	 * segundo lugar, se introducen los dorsales de los corredores que han dado
	 * positivo en el test antidopaje, lo que provoca su expulsión inmediata. Para
	 * finalizar, se introducen los dorsales de los corredores que no han pagado su
	 * inscripción en la carrera, lo que provoca que se releguen a los últimos
	 * puestos del ranking general. La aplicación debe mostrar los dorsales de los
	 * corredores que han conseguido las medallas de oro , plata y bronce.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PASO 1 CUANDO TERMINEMOS DE INGRESAR LA CANTIDAD DE DORSALES DESEADOS
		// (INTRODUCIREMOS -1 PARA LLEGAR A LA META.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los dorsales que llegaron a la meta:");
		int meta = sc.nextInt();
		int tabla[] = new int[0];

		while (meta != -1) {
			tabla = Arrays.copyOf(tabla, tabla.length + 1);
			tabla[tabla.length - 1] = meta;
			meta = sc.nextInt();
		}
		System.out.println("Terminaron la carrera: " + Arrays.toString(tabla));
		System.out.println();

		// PASO 2 MOVER TODOS LOS DORSALES DE LOS MENORES DE EDAD A LA IZQUIERDA.
		int menores[] = Arrays.copyOf(tabla, tabla.length);
		System.out.println("Tabla menores de edad: " + Arrays.toString(menores));
		Scanner mover = new Scanner(System.in);
		System.out.println("Introduce los dorsales que quieres mover: ");
		int posicion = mover.nextInt();

		System.out.println("Antes de mover a la izquierda: " + Arrays.toString(menores));
		int primerElemento = menores[posicion];
		while (posicion != -1) {
			for (int i = posicion; i < menores.length - 1; i++) {
				menores[i] = menores[i + 1];
			}
			posicion = mover.nextInt();
			menores[menores.length - 1] = primerElemento;
			System.out.println("Moviendo a la izquierda: " + Arrays.toString(menores));
			menores = Arrays.copyOf(menores, menores.length);

		}
		menores = Arrays.copyOf(menores, menores.length - 1);
		System.out.println("Despues de mover a la izquierda: " + Arrays.toString(menores));
		mover.close();

		// PASO 3 LOS DORSALES DE LOS CORREDORES DOPADOS LOS BORRAMOS DE LA TABLA.
		System.out.println(
				"Eliminando los dorsales de los positivos en el doping, introduzca -1 para dejar de eliminar dopados");
		int indice = 0;
		meta = sc.nextInt();

		int dopados[] = Arrays.copyOf(tabla, tabla.length);
		while (indice < tabla.length) {
			if (meta == tabla[indice] && meta != -1) {
				tabla[indice] = tabla[tabla.length - 1];
				tabla[tabla.length - 1] = meta;
				meta = sc.nextInt();
				tabla = Arrays.copyOf(tabla, tabla.length - 1);
			} else {
				indice++;
			}
		}
		sc.close();

		// GOOD
		tabla = Arrays.copyOf(tabla, tabla.length);
		dopados = Arrays.copyOf(dopados, tabla.length);

		// MOSTRAMOS LOS VALORES ELIMINADOS.
		System.out.println("Valores eliminados: " + Arrays.toString(dopados));

		// MOSTRAMOS LOS VALORES DE NUESTRA TABLA DESPUES DE ELIMINAR LOS DESEADOS.
		System.out.println("Tabla sin dopados" + Arrays.toString(tabla));
		System.out.println();

		// PASO 4 MOVER LOS VALORES QUE NO HAN PAGADO AL FINAL DE LA TABLA.

		// PASO 5 MOSTRAR EL PODIO DE LA CARRERA.
		int podio[] = Arrays.copyOfRange(tabla, 0, 3);
		System.out.println("Primera posición oro: " + podio[0] + ", Segunda posición plata: " + podio[1]
				+ ", Tercera Posición bronce: " + podio[2]);
	}
}