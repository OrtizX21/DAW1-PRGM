package Pruebas;
import java.util.*;

public class Examen2_Pruebas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. CREAR TABLA DE 1000 ELEMENTOS.
		
		int Tabla1 [] = new int [15];
		
		//2. INICIALIZAR LA TABLA CON VALORES ALEATORIOS DE 100.
		
		int Suma = 0;
		
		for (int i = 0; i < Tabla1.length; i++) {
			
			Tabla1[i] = (int) (Math.random()*19 + 1);
			Suma = Suma + Tabla1[i];
		}
		
		//3. MOSTRAR LA SUMA DE TODOS LOS VALORES.
		int Longitud = Tabla1.length;
		
		System.out.println("La Longitud De La Tabla Es: " + Longitud);
		System.out.println(Arrays.toString(Tabla1));
		System.out.println("La Suma De Los Valores De La Tabla Es: " + Suma);
		System.out.println();
		
		//4. BORRAR TODOS LOS ELEMENTOS QUE SEAN EL NUMERO 100 EN LA TABLA.
		
		int Contador = 0;
		
		while (Contador < Tabla1.length) {
			
			if (Tabla1[Contador] == 11) {
				
				Tabla1[Contador] = Tabla1[Tabla1.length - 1];
				Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length -1);
			}
			
				else {
					
					Contador++;
				}
		}
		
		//LE ACTUALIZO EL VALOR A LA VARIABLE LONGITUD.
		Longitud = Tabla1.length;

		System.out.println(Arrays.toString(Tabla1));
		System.out.println("La Longitud De La Tabla Despues De Borrar El 100: " + Longitud);
		
		//5. INSERTAR EL NUMERO 28 EN LA TABLA.
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		Tabla1[Tabla1.length - 1] = 28;
		
		System.out.println();
		System.out.println("Insertando El 28 Sin Importar El Orden: " + Arrays.toString(Tabla1));
		
		
		//6. ORDENAR LA TABLA DE MANERA ORDENADA
		
		Arrays.sort(Tabla1);
		
		//7. INSERTAR EL NUMERO 35 EN LA TABLA SIN IMPORTAR EL ORDEN.
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		Tabla1[Tabla1.length - 1] = 35;
		
		System.out.println();
		System.out.println("Insertando El 35 Sin Importar El Orden: " + Arrays.toString(Tabla1));
		System.out.println();
		
		//8. INSERTAR EL NUMERO 0 EN LA TABLA INSERCION ORDENADA.
		
		int Auxiliar [] = Arrays.copyOf(Tabla1, Tabla1.length +1);
		int Insertar = Arrays.binarySearch(Tabla1, 0);
		
		if (Insertar >= 0) {
			
			System.arraycopy(Tabla1, 0, Auxiliar, 0, Insertar);
			System.arraycopy(Tabla1, 0, Auxiliar, 0, Tabla1.length - Insertar);
			Auxiliar[Insertar]= 0;
		}
		
			else {
				
				int InsertarOrden =- Insertar -1;
				System.arraycopy(Tabla1, 0, Auxiliar, 0, InsertarOrden);
				System.arraycopy(Tabla1, 0, Auxiliar, InsertarOrden + 1, Tabla1.length - InsertarOrden);
				Auxiliar[InsertarOrden]= 0;
			} 
		
		Tabla1 = Arrays.copyOf(Auxiliar, Auxiliar.length);
		System.out.println("Tabla Insertandole El 0:" + Arrays.toString(Tabla1));
	}

}