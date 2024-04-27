package Arrays;
import java.util.*;

public class AgregarValores_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int t [] = {1, 2, 3, 4, 6, 7, 8};
		
		int NumNuevo = 5;
		
		System.out.println(Arrays.toString(t));
		
		int indiceinsercion = Arrays.binarySearch(t, 5);
		
		if (indiceinsercion < 0) {
			
			indiceinsercion = -indiceinsercion -1;
			
		}
		
		int TablaCopia [] = new int [t.length + 1];
		
		System.arraycopy(t, 0, TablaCopia, 0, indiceinsercion);
		
		System.arraycopy(t, indiceinsercion, TablaCopia, indiceinsercion + 1, t.length - indiceinsercion);
		
		TablaCopia [indiceinsercion] = NumNuevo;
		
		t = TablaCopia;
		
		System.out.println(Arrays.toString(t));
	}

}