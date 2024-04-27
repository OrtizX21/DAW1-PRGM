package Arrays;
import java.util.*;

public class Sin_Repetidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int TablaRepetida [] = {1, 2, 20, 3, 24, 1, 2, 20, 3, 24};
		
		TablaRepetida = SinRepetidos (TablaRepetida);
		
		System.out.println(Arrays.toString(TablaRepetida));

	}

	
	static int [] SinRepetidos (int Tabla[]) {
		
		int TablaOrden [] = new int [0];
		
		for (int elemento : Tabla) {
			
			if (Arrays.binarySearch(TablaOrden, elemento) < 0) {
				
				TablaOrden = Arrays.copyOf(TablaOrden, TablaOrden.length + 1);
				
				TablaOrden [TablaOrden.length-1]= elemento;
			}
		}
		
		return TablaOrden;
		
	}
	
}