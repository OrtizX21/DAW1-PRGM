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
	
	Persona p1 = new Persona(18, 84, 173);
	lista.add(4, p1);
	p1.setNif("AX445532");
	Persona p2 = lista.get(4);
	
	System.out.println("Esta en la lista? " + lista.contains(p1) + ", Posicion : " + lista.indexOf(p1) + ", Posicion final: " + lista.lastIndexOf(p1) + "\n" );
	System.out.println("Esta en la lista? " + lista.contains(p2) + ", Posicion : " + lista.indexOf(p2) + ", Posicion final: " + lista.lastIndexOf(p2) + "\n" );
	
	System.out.println("Despues de ordenar la lista con Collections: " + "\n");
	
	for(Persona collections : lista) {
		System.out.println(collections);
		}
	}
}
