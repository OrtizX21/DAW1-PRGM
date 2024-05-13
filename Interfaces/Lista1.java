package Interfaces;
import java.util.*;

public class Lista1 implements ICola {
	
	private Integer tabla [];
	int insertados = 0;
	
	Lista1() {
		tabla = new Integer[0];
	}
	
	void insertarPrincipio(Integer numero) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[0] = numero;
		insertados++;
	}
	
	void insertarFinal(Integer numero) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = numero;
		insertados++;
	}
	
	void insertarDeseado(int posicion, Integer numero) {
		
		if(posicion < 0 && posicion > tabla.length) {
			
			System.out.println("Posicion Invalida");
		}
		else if(posicion >= 0 && posicion <= tabla.length) {
			
			tabla = Arrays.copyOf(tabla, tabla.length + 1);
			System.arraycopy(tabla, posicion, tabla, posicion, tabla.length - posicion);
			tabla[posicion] = numero;
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
			insertados++;
		}
	}
	
	void insertarfinalLista(Lista1 nueva) {
		tabla = Arrays.copyOf(tabla, tabla.length + nueva.tabla.length);
		System.arraycopy(nueva.tabla, 0, tabla, tabla.length - nueva.tabla.length, nueva.tabla.length);
	}
	
	Integer getIndice(int indice) {
		return tabla[indice];
	}
	
	Integer eliminar(int indice) {
		
		Integer eliminado = tabla[0];
		
		for(int i = indice + 1; i < tabla.length; i++) {
			
				tabla[i - 1] = tabla[i];
		}
		tabla = Arrays.copyOf(tabla, tabla.length - 1);
		return eliminado;
	}
	
	int buscar(Integer claveBusqueda) {
		
		int indiceBusqueda = -1;
		
		for(int i = 0; i < tabla.length && indiceBusqueda == -1; i++) {
			
			if(tabla[i].equals(claveBusqueda)) {
				indiceBusqueda = i;
			}
		}
		return indiceBusqueda;
	}
	
	public int numeroElementos() {
		return tabla.length;
	}
	
	static Lista1 contatena(Lista1 lista1, Lista1 lista2) {
		
		Lista1 lista3 = new Lista1 () ;
		lista3.tabla = Arrays.copyOf(lista1.tabla, lista1.tabla.length + lista2.tabla.length);
		System.arraycopy(lista2.tabla, 0, lista3.tabla, lista1.tabla.length, lista2.tabla.length);
		System.out.println("Lista concatenada: " + Arrays.toString(lista3.tabla) + "\n");
		return lista3;
	}

	@Override
	public String toString() {
		
		String cadena = "";
		
		for(int i = 0; i < tabla.length; i++) {
			cadena = cadena + " " + tabla[i];
		}
		return cadena;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean iguales = true;
		
		Lista1 listaAuxiliar = new Lista1 ();
		listaAuxiliar = (Lista1) (obj);
		
		for(int i = 0; i < listaAuxiliar.tabla.length; i++) {
			
			if((listaAuxiliar.tabla[i] != this.tabla[i])) {
				iguales = false;
				i = listaAuxiliar.tabla.length;
			}
		}
		return iguales;
	}
	
	public Integer encolar(Integer numero) {
		insertarFinal(numero);
		return numero;
	}
	
	public Integer desencolar() {
		return eliminar(0);
	}
}
