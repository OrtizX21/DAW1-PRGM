package Examen2_Repaso;
import java.util.*;

public class Examen2_Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. CREAR UNA TABLA CON ESTOS VALORES.
		
		int TablaExamen [] = {1, 4, 5, 11, 77, 99, 58, 12, 11, 11};
		
		//2. SUMA LOS VALORES DE LA TABLA.
		
		int Suma = 0;
		
		for (int i  = 0; i < TablaExamen.length; i++) {
			
			Suma = Suma + TablaExamen[i];
		}
		
		System.out.println("La Suma De Los Elementos Es: " + Suma);
		
		//3. BORRAR TODOS LOS NUMEROS 11.
		
		int Contador = 0;
		
		while (Contador < TablaExamen.length) {
			
			if (TablaExamen[Contador] == 11) {
				
				TablaExamen[Contador] = TablaExamen[TablaExamen.length - 1];
				TablaExamen = Arrays.copyOf(TablaExamen, TablaExamen.length - 1);
			}
			
			else {
				
				Contador++;
			}
		}
		
		System.out.println(Arrays.toString(TablaExamen));
		
		// 4. INSERTAR EL NUMERO 16 SIN IMPORTAR EL ORDEN.

		TablaExamen = Arrays.copyOf(TablaExamen, TablaExamen.length + 1);
		TablaExamen[TablaExamen.length -1] = 16;
		
		System.out.println(Arrays.toString(TablaExamen));
		
		// 5. TRATAR LA TABLA DE MANERA ORDENADA.
		
		Arrays.sort(TablaExamen);
		
		// 6. INSERTAR EL NUMERO 7 TENIENDO EN CUENTA EL ORDEN.
		
		int Auxiliar [] = Arrays.copyOf(TablaExamen, TablaExamen.length + 1);
		int Posicion = Arrays.binarySearch(TablaExamen, 7);
		
		if (Posicion >= 0) {
			
			System.arraycopy(TablaExamen, 0, Auxiliar, 0, TablaExamen.length);
			System.arraycopy(TablaExamen, 0, Auxiliar, 0, TablaExamen.length - Posicion);
			Auxiliar[Posicion]= 7;
		}
		
			else {
				
				int Buscar = -Posicion -1;
				
				System.arraycopy(TablaExamen, 0, Auxiliar, 0, TablaExamen.length);
				System.arraycopy(TablaExamen, 0, Auxiliar, Buscar + 1, TablaExamen.length - Buscar);
				Auxiliar[Buscar]= 7;
			} 
		
		TablaExamen = Arrays.copyOf(Auxiliar, Auxiliar.length);
		System.out.println("Tabla Insertando El 7 En Orden: " + Arrays.toString(TablaExamen));
		
		// 7. MOSTRAR CUANTOS REGISTRO TIENE LA TABLA CON LA QUE TRABAJAMOS.
		
		System.out.println("La Cantidad De Registro De La Tabla Es: " + TablaExamen.length);
		
		// 8. CAMBIALE EL NOMBRE A LA TABLA POR APROBADO.
		
		int [] Aprobado = TablaExamen;
		
		System.out.println("Esta Es La Tabla De Tu Examen Aprobado: " + Arrays.toString(Aprobado));
		
		// 9. PRUEBA DE INSERCION ORDENADA.
		
		int TablaPrueba[] = {1, 5, 9, 8, 4, 3, 77};
		int Pos = 6;
		
		if(Pos > TablaPrueba.length) {
			
			System.out.println("La Tabla Esta Llena.");
		}
			else {
				
				TablaPrueba[Pos] = 80;
			} 
		
		System.out.println("Tabla Prueba: " + Arrays.toString(TablaPrueba));
	}
}