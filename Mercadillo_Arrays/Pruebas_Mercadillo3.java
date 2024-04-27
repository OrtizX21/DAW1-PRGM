package Mercadillo_Arrays;

import java.util.*;

public class Pruebas_Mercadillo3 {

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

		//PASO 1.
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

		//PASO 3.
		System.out.println("Eliminando los dorsales de los positivos en el doping, introduzca -1 para dejar de eliminar dopados");
		int indice = 0;
		meta = sc.nextInt();
		
		while(indice < tabla.length) {
			if(meta == tabla[indice] && meta != -1) {
				tabla[indice] = tabla[tabla.length - 1];
				tabla[tabla.length - 1]= meta;
				meta = sc.nextInt();
				tabla = Arrays.copyOf(tabla, tabla.length - 1);
			}
			else {
				indice++;
			}
		}
		sc.close();
		int dopados [] = Arrays.copyOf(tabla, tabla.length);
		System.out.println("Tabla despues de eliminar los dopados: " + Arrays.toString(dopados));
	}

}
