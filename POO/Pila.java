package POO;
import java.util.*;

public class Pila {

	Integer Pila[];
	
	Pila () {
		
		this.Pila = new Integer [0];
	}
	
	Integer apliar (Integer numero) {
		
		Pila = Arrays.copyOf(Pila, Pila.length + 1);
		System.arraycopy(Pila, 0, Pila, 0, Pila.length);
		Pila [Pila.length - 1] = numero;
		
		return numero;
	}
	
	void desapilar () {
		
		Pila = Arrays.copyOf(Pila, Pila.length);
		System.arraycopy(Pila, 0, Pila, 0, Pila.length - 1);
		Pila = Arrays.copyOf(Pila, Pila.length - 1);
		System.out.println("Desapilando: " + Arrays.toString(Pila));
	}
	
	String mostrar () {
		
		return "Mostrando La Pila: " + Arrays.toString(Pila);
	}
}
