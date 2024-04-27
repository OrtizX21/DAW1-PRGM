package Pruebas;
import java.util.*;

public class Prueba_Paso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PRUEBA 1 ARRAYS.COPYOF NORMAL.
		int tabla1 [] = {11, 12, 13, 14, 15, 16, 17};
		int tablacopia [] = Arrays.copyOf(tabla1, tabla1.length);
		
		System.out.println("Tabla Original: " + Arrays.toString(tabla1));
		System.out.println("Tabla Copia: " + Arrays.toString(tablacopia));
		
		//PRUEBA 2 SYSTEM.ARRAYCOPY.
		int tabladestino [] = new int [tabla1.length];
		System.arraycopy(tabla1, 4, tabladestino, 0, 3);
		
		tabladestino = Arrays.copyOf(tabladestino, tabladestino.length);
		System.out.println("Usando el Array Copy: " + Arrays.toString(tabladestino));
		
		//PRUEBA 3 ARRAYS.COPYOFRANGE.
		int Rango [] = Arrays.copyOfRange(tabladestino, 0, 3);
		System.out.println("Usando la copia de rango: " + Arrays.toString(Rango));
	}
}