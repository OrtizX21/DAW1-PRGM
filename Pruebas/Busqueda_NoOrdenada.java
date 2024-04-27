package Pruebas;
import java.util.*;

public class Busqueda_NoOrdenada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Contador = 0;
		int Tabla1 [] = {11, 7, 55, 8, 9};
		int Clave = 7;
		
		while (Contador < Tabla1.length && Tabla1[Contador] != Clave) {
		
			Contador++;
		}
		
		if (Contador < Clave) {
			
			System.out.println("Indice Encontrado En La Posicion: " + Contador);
		}
			else {
				
				System.out.println("Indice No Encontrado.");
			}
		
		if (Contador == -1) {
			
			System.out.println("No Se Encontro El Elemento.");
		}
			else {
				
				Tabla1[Contador] = Tabla1[Tabla1.length - 1];
				Tabla1[Tabla1.length - 1] = Tabla1.length;
			}
		
		System.out.println(Arrays.toString(Tabla1));

	}

}
