package Examen2_Repaso;
import java.util.*;

public class Repaso1_AO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Tabla1 [] = {11, 1, 0, 77, 99};
		
		int Contador = 0;
		int Clave = 6;
		
		//ALGORITMO BUSQUEDA EN TABLA DESORDENADA.
		
		while (Contador < Tabla1.length && Tabla1[Contador] != Clave) {
			
			Contador++;
		}
		
		if (Contador < Clave){
			
			System.out.println("El Elemento Que Busca Se Encuentra En: " + Contador);
		} 
		
		//INSERTAR EN LA TABLA DESORDENADA.
		
		int Pos = 2;
		
		if (Pos > Tabla1.length){
			
			System.out.println("La Tabla Esta Llena No Se Puede Insertar.");
		}
			else {
				
				Tabla1[Pos]= 9;
				Pos++;
			}
		
		System.out.println(Arrays.toString(Tabla1));
		
		//BORRAR EN TABLA DESORDENA ELEGIENDO EL VALOR A BORRAR.
		
		int i = 0;
		
		while (i < Tabla1.length) {
			
			if (Tabla1[i] == 11) {
				
				Tabla1[i] = Tabla1[Tabla1.length - 1];
				Tabla1[Tabla1.length - 1]=Tabla1.length;
			}
			
			i++;
		}
		
		System.out.println("Borrando De Manera Desordenada: "+ Arrays.toString(Tabla1));

		//BORRAR DE MANERA CORTA.
		
		int Copia1 [] = Arrays.copyOf(Tabla1, Tabla1.length);
		Copia1 = Arrays.copyOf(Copia1, Copia1.length - 1);
		System.out.println("Borrando De Manera Ordenada: " + Arrays.toString(Copia1));
	}
}