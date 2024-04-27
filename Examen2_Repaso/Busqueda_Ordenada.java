package Examen2_Repaso;
import java.util.*;

public class Busqueda_Ordenada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Tabla1 [] = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(Tabla1));
				
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length - 1);
		System.out.println("Tabla Original: " + Arrays.toString(Tabla1));
		
		int Copia1[] = {0, 2, 3, 5, 7, 8};
		
		int Numelem = Copia1.length;
		
		for (int i = 1; i < Numelem - 1; i++){
			
			Copia1[i] = Copia1[i + 1];
		}
		Numelem--;
		
		System.out.println("Tabla Copia: " + Arrays.toString(Copia1));
	}

}
