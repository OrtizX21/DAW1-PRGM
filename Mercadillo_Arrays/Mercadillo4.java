package Mercadillo_Arrays;
import java.util.*;
import java.util.Collections;

public class Mercadillo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PASO 1 MIENTRAS QUE NO SE INTRODUZCA EL -1 INGRESAREMOS LOS SUELDOS DEL AYUNTAMIENTO (CREAMOS LA TABLA ESTRUCTURA DINAMICA).
		Double sueldos [] = new Double [0];
		
		Scanner importe = new Scanner(System.in);
		System.out.println("Introduce los sueldos de los funcionarios del ayuntamiento: ");
		double numeros = importe.nextInt();
		
		while(numeros != -1) {
			sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
			sueldos[sueldos.length - 1]= numeros;
			numeros = importe.nextInt();
		}
		importe.close();
		
		//PASO 2 ORGANIZAR LOS SUELDOS EN MANERA DESCENDENTE Y SALARIO MAXIMO Y MINIMO.
		Arrays.sort(sueldos, Collections.reverseOrder());
		System.out.println("Orden descendente: " + Arrays.toString(sueldos));
		
		Double sueldoMax [] = Arrays.copyOfRange(sueldos, 0, 1);
		System.out.println("Sueldo más alto del ayuntamiento: " + Arrays.toString(sueldoMax));
		
		Double sueldoMin [] = Arrays.copyOfRange(sueldos, sueldos.length - 1, sueldos.length);
		System.out.println("Sueldo más bajo del ayuntamiento: " + Arrays.toString(sueldoMin));
				
		//PASO 3 CALCULAR LA MEDIA DE LOS SUELDOS INTRODUCIDOS.
		
		Double suma = 0.0;
		for (Double i : sueldos) {
			suma += i;
		}
		Double media = (suma / sueldos.length);
		System.out.println("Promedio de los sueldos del ayuntamiento: " + media);
	}
}