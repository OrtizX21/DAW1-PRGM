package Mercadillo_Arrays;
import java.util.*;

public class Mercadillo1 {
	
	static int [] buscarTodos (int tabla[], int clave) {
		
		Arrays.sort(tabla);
		int indices = Arrays.binarySearch(tabla, clave);
		System.out.println("Valores de la tabla ordenados: " + Arrays.toString(tabla));
		if(indices >= 0) {
			System.out.println("El valor buscado se encuentra en la posición: " + indices);
		}
		else {
			tabla = new int[0];
			System.out.println("No se encontro el valor: " + Arrays.toString(tabla));
		}
		return tabla;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla1 [] = {99, 99, 1, 0, 5, 44};
		int clave = 77;
		buscarTodos(tabla1, clave);
	}
}