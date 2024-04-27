package Pruebas;
import java.util.*;

public class Prueba_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int t [] = {5, 8, 7, 15, 55, 54, 53};
		
		
		int indiceborrado = Arrays.binarySearch(t, 5);
		
		if (indiceborrado != -1) {
			
			t[indiceborrado] = t [t.length - 1];
			
			t = Arrays.copyOf(t, t.length - 1);
			
			System.out.print(Arrays.toString(t));
			
		}
	}

}
