package ArraysList;
import java.util.ArrayList;
import java.util.Collections;

public class Main_Persona {
	
	public static void main(String[] args) {
		
	ArrayList<Persona> lista = new ArrayList<Persona>();
	
	lista = Persona.listaPersonas(7);
	System.out.println("Antes de ordenar la lista con Sort: " + "\n");
	lista.sort(null);
	
	for(Persona sort : lista) {
		System.out.println(sort);
		}
	
	System.out.println();
	Collections.sort(lista);
	
	System.out.println("Despues de ordenar la lista con Collections: " + "\n");
	for(Persona collections : lista) {
		System.out.println(collections);
		}
	}
}
