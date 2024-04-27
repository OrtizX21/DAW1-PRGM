package Ejercicios_Profe_Pedro;
import java.util.*;

public class Gestion_Lista_Numeros {

	static int[] infoNumeros (int []t) {
		System.out.println("Valores de la tabla: " + Arrays.toString(t));
		return t;
		
	}
	static int[] ordenarNumeros (int []t) {
		Arrays.sort(t);
		System.out.println("Tabla con los valores organizados de manera ascendente: "
				+ "" + Arrays.toString(t));
		return t;
	}
	static int[] buscarNumero (int []t, int numero) {
		Arrays.sort(t);
		System.out.println("Tabla donde estamos buscando: " + Arrays.toString(t));
		int indiceBusqueda = Arrays.binarySearch(t, numero);
		if(indiceBusqueda >= 0) {
			System.out.println("El número se encuentra en la posición: " + indiceBusqueda);
		}
		else {
			System.out.println("No se encontro el número.");
		}
		return t;
	}
	static int[] copiarTabla (int []t) {
		int tablacopia1 [] = Arrays.copyOf(t, t.length);
		System.out.println("Tabla copia 1: " + Arrays.toString(tablacopia1));
		return tablacopia1;
	}
	static int[] copiarDosTablas (int []a, int []b) {
		int c[] = Arrays.copyOf(a, a.length + b.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println("Copia de ambos arrays: " + Arrays.toString(c));
		return b;
	}
	static int[] modificarNumero (int []t, int posicion, int numero) {
		t = Arrays.copyOf(t, t.length + 1);
		t[posicion] = numero;
		t = Arrays.copyOf(t, t.length - 1);
		System.out.println("Modificando un numero del array: " + Arrays.toString(t));
		return t;
	}
	static int[] insertarNumeroFin (int t[], int numero) {
		t = Arrays.copyOf(t, t.length + 1);
		t[t.length - 1]= numero;
		System.out.println("Insertando número al final: " + Arrays.toString(t));
		return t;
	}
	static int[] eliminar (int t[], int indiceBorrar) {
		
		int elementos = t.length;
		
		if(indiceBorrar < 0 || indiceBorrar > t.length) {
			System.out.print("Valor a borrar fuera del rango de la tabla.");
		}	
			else {
				for(int i = indiceBorrar + 1; i < elementos; i++) {
					t[i - 1] = t[i];
				}
				t = Arrays.copyOf(t, t.length - 1);
				System.out.println("Despues de borrar: " + Arrays.toString(t));
			}
		return t;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PASO 1 CREAR UN ARRAY DE 10 ELEMENTOS.
		
		int tabla1 [] = {55, 48, 77, 11, 0, 12, 6, 4, 5, 1};
		int tabla2 [] = {99, 99, 99};
		infoNumeros(tabla1);
		System.out.println();
		
		ordenarNumeros(tabla1);
		System.out.println();

		buscarNumero(tabla1, 77);
		System.out.println();
		
		copiarTabla(tabla1);
		System.out.println();
		
		modificarNumero(tabla1, 3, 9);
		System.out.println();
		
		insertarNumeroFin(tabla1, 555);
		System.out.println();
		
		eliminar(tabla1, 3);
		System.out.println();
		
		copiarDosTablas(tabla1, tabla2);		
	}
}