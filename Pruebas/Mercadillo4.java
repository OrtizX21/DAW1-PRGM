package Pruebas;
import java.util.*;
public class Mercadillo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PASO 1 MIENTRAS QUE NO SE INTRODUZCA EL -1 INGRESAREMOS LOS SUELDOS DEL AYUNTAMIENTO (CREAMOS LA TABLA ESTRUCTURA DINAMICA).
		double sueldos [] = new double [0];
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce los sueldos de los encuestados: ");
		double numeros = entrada.nextDouble();
		
		while(numeros != -1) {
			sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
			sueldos[sueldos.length - 1]=numeros;
			numeros = entrada.nextDouble();
		}
		entrada.close();
		System.out.println("Sueldos antes de ordenar: " + Arrays.toString(sueldos));
		
		//PASO 2 ORGANIZAR LOS SUELDOS EN MANERA DESCENDENTE Y SALARIO MAXIMO Y MINIMO.
		Arrays.sort(sueldos);
		double sueldosDecrecientes [] = new double[sueldos.length];
		
		for(int i = 0; i < sueldos.length; i++) {
			sueldosDecrecientes[i] = sueldos[sueldos.length - 1 - i];
		}
		sueldos = Arrays.copyOf(sueldosDecrecientes, sueldosDecrecientes.length);
		System.out.println("sueldos organizados de manera decreciente: " + Arrays.toString(sueldos));
		
		double sueldoMax [] = Arrays.copyOfRange(sueldosDecrecientes, 0, 1);
		System.out.println("Sueldo Máximo: " + Arrays.toString(sueldoMax));
		
		double sueldoMin [] = Arrays.copyOfRange(sueldosDecrecientes, sueldosDecrecientes.length - 1, sueldosDecrecientes.length);
		System.out.println("Sueldo Minimo: " + Arrays.toString(sueldoMin));
		
		//PASO 3 CALCULAR LA MEDIA DE LOS SUELDOS INTRODUCIDOS.
		double media = 0.0;
		
		for(double i : sueldosDecrecientes) {
			media += i;
		}
		double promedio = (media / sueldosDecrecientes.length);
		System.out.println("Promedio de los sueldos de la encuesta: " + promedio);
	}
}