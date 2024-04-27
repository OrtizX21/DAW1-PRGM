package Mercadillo_Arrays;
import java.util.Arrays;

public class Mercadillo2 {

	static int [] desordenar (int tabla[]) {
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random()*100);
		}
		System.out.println(Arrays.toString(tabla));
		return tabla;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2 -Escribe la función void desordenar (int t[]), que cambia de forma
		 * aleatoria los elementos contenidos en la tabla t, si la tabla estuviera
		 * ordenada dejaría de estarlo.
		 */
		
		int tablaordenada [] = {11,12,13,14,15,16};
		desordenar(tablaordenada);
		}
	}