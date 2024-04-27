package Examen2_Repaso;
import java.util.*;

public class Repaso2_AD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CREANDO TABLA ORDENADA.
		
		int Tabla1 [] = {1, 2, 3, 4, 5, 6, 7};
		
		//USANDO EL BINARYSEARCH PARA INSERTAR EN ORDEN.
		
		int Auxiliar [] = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		int Posicion = Arrays.binarySearch(Tabla1, 8);
		
		if (Posicion >= 0) {
			
			System.arraycopy(Tabla1, 0, Auxiliar, 0, Tabla1.length);
			System.arraycopy(Tabla1, 0, Auxiliar, Posicion, Tabla1.length);
			Auxiliar[Posicion]= 8;
		}
			else {
				
				Posicion =- Posicion -1;
				System.arraycopy(Tabla1, 0, Auxiliar, Posicion + 1, Tabla1.length - Posicion);
				Auxiliar[Posicion]= 8;
			}
		
		Tabla1 = Arrays.copyOf(Auxiliar, Auxiliar.length);
		System.out.println("Insertando En Tabla Ordenada: " + Arrays.toString(Tabla1));
		System.out.println("Cantidad De Registros Antes De Borrar: " + Tabla1.length);
		
		//BORRAR EN TABLA ORDENADA DE MANERA LARGA (UTILIZANDO EL BUCLE FOR).
		
		int Longitud = Tabla1.length;
		
		for (int i = 1; i < Longitud -1; i++) {
			
			Tabla1[i] = Tabla1[i + 1];
		}
		Longitud--;
		
		System.out.println("Borrando En Tabla Ordenada: " + Arrays.toString(Tabla1));
		
		//BORRAR EN TABLA ORDENADA DE MANERA CORTA
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length -1);
		System.out.println("Borrando De Manera Corta: " + Arrays.toString(Tabla1));
		
		//BORRAR EL VALOR QUE SELECCIONEMOS DE LA TABLA.
		
		int k = 0;
		
		while (k < Tabla1.length) {
			
			if (Tabla1[k] == 4) {
				
				Tabla1[k] = Tabla1[Tabla1.length - 1];
				Tabla1[Tabla1.length -1]= Tabla1.length;
			}
			
			else {
				
				k++;
			}
		}
		
		System.out.println("Borrando El Valor Que Seleccione: " + Arrays.toString(Tabla1));
		System.out.println("Cantidad De Registros Despues De Borrar: " + Tabla1.length);
	}
}