package Examen2_Repaso;
import java.util.*;

public class Prueba_Fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t [] = {1, 2, 3, 4, 5};
		
		t = Arrays.copyOf(t, t.length - 1);
		System.out.println(Arrays.toString(t));
		
		int PruebaFill [] = new int [11];
		Arrays.fill(PruebaFill, 11);
		System.out.println(Arrays.toString(PruebaFill));
		
		int CopiaFill [] = Arrays.copyOf(PruebaFill, PruebaFill.length);
		Arrays.fill(CopiaFill, 0, 8, 55);
		System.out.println(Arrays.toString(CopiaFill));

		//1. CREAR TABLA DE 1000 ELEMENTOS.
		
		int Tabla1 [] = new int [10];

		//2. INICIALIZAR LA TABLA CON VALORES ALEATORIOS DE 100.
		
		int Suma = 0;
		for (int i = 0; i < Tabla1.length; i++){
			
			Tabla1[i]=(int)(((Math.random()*200)-100)+1);
		}

		//3. MOSTRAR LA SUMA DE TODOS LOS VALORES.
		
		for (int k = 0; k < Tabla1.length; k++){
			
			Suma = Suma + Tabla1[k];
		}
		
		System.out.println("La Suma De Los Valores Es: " + Suma);

		//4. BORRAR TODOS LOS ELEMENTOS QUE SEAN EL NUMERO 20 EN LA TABLA.
		
		int Contador = 0;
		
		while (Contador < Tabla1.length){
			
			if (Tabla1[Contador] == 20){
				
				Tabla1[Contador] = Tabla1[Tabla1.length -1];
				Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length -1);
			}
				else {
					
					Contador++;
				}
		}

		//5. INSERTAR EL NUMERO 28 EN LA TABLA.
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		Tabla1[Tabla1.length - 1]= 28;
		
		System.out.println("Tabla Sin Ordenar: " + Arrays.toString(Tabla1));

		//6. TRATAR LA TABLA DE MANERA ORDENADA
		
		Arrays.sort(Tabla1);
		System.out.println("Tabla Ordenada: " + Arrays.toString(Tabla1));
		
		//7. INSERTAR EL NUMERO 35 EN LA TABLA IMPORTAR EL ORDEN.
		
		int Auxiliar [] = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		int Insertar = Arrays.binarySearch(Tabla1, 35);
		
		if (Insertar >= 0) {
			
			System.arraycopy(Tabla1, 0, Auxiliar, 0, Tabla1.length);
			System.arraycopy(Tabla1, 0, Auxiliar, 0, Tabla1.length - Insertar);
			Auxiliar[Insertar]= 35;
		}
			else {
				
				Insertar =- Insertar - 1;
				System.arraycopy(Tabla1, 0, Auxiliar, 0, Tabla1.length);
				System.arraycopy(Tabla1, 0, Auxiliar, 0, Tabla1.length - Insertar);
				Auxiliar[Insertar]= 35;
			}
		
		Tabla1 = Arrays.copyOf(Auxiliar, Auxiliar.length);
		System.out.println("Tabla Insertando El Numero 35: " + Arrays.toString(Tabla1));
		
		//8. MUESTRA CUANTOS REGISTRO TIENE LA TABLA AHORA.
		
		System.out.println("La Tabla Tien En Total De Registros: " + Tabla1.length);
		
		//9. RENOMBRAR LA TABLA POR TABLAEXAMEN.
		
		int TablaExamen [] = Tabla1;
		System.out.println("Felicidades Has Aprobado: " + Arrays.toString(TablaExamen));
	}
}