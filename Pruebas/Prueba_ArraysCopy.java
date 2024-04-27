package Pruebas;
import java.util.*;

public class Prueba_ArraysCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Tabla1[] = {11, 55, 77, 88, 99, 111};
		int Tabla2[] = new int [6];
		
		System.arraycopy(Tabla1, 0, Tabla2, 0, 3);
		System.out.println("Tabla 1: " + Arrays.toString(Tabla1) + "La Longitud De La Tabla Es: " + Tabla1.length);
		System.out.println("Tabla 2: " + Arrays.toString(Tabla2));
		
		int Tabla3[] = Arrays.copyOfRange(Tabla2, 3, 6);
		System.out.println("Tabla 3: " + Arrays.toString(Tabla3));

	}

}
