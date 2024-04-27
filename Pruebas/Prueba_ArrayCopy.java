package Pruebas;
import java.util.*;

public class Prueba_ArrayCopy {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int t1 [] = {1, 2, 5, 8, 3, 10, 6};
		
		int tablacopia [] = {1, 8, 9, 11, 7, 6, 4};
		
		System.arraycopy(t1, 0, tablacopia, 6, 1);
		
		System.out.println(Arrays.toString(tablacopia));
	
	
	}
}
