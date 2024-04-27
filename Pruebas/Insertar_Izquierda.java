package Pruebas;
import java.util.*;

public class Insertar_Izquierda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla1 [] = {11, 12, 13, 14, 15, 16, 17, 18,};
		
		 int copia [] = Arrays.copyOf(tabla1, tabla1.length);
		 
		 System.arraycopy(tabla1, 2, copia, 0, 3);
		System.out.println(Arrays.toString(copia));
		
	}

}
