package Pruebas;
import java.util.*;

public class Prueba_Arrays {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int t [ ] = { 12, 27, 33, 33,  38, 72, 92 };
		@SuppressWarnings("resource")
		int aBorrar = new Scanner (System.in).nextInt(); 
		
		
		//usamos el algoritmo de búsqueda dicotómica
		int indiceBorrado = Arrays.binarySearch (t, aBorrar);
		if (indiceBorrado >= 0) {
		     //desplazamos los elementos posteriores a indeceBorrado
			
		     System.arraycopy (t, indiceBorrado + 1, t, indiceBorrado, t.length - indiceBorrado - 1);
		     t = Arrays.copyOf (t, t.length - 1); //disminuimos la longitud
		     System.out.println (Arrays.toString(t));  //mostramos
	}
	     System.out.println (Arrays.toString(t));  //mostramos

}
	}
