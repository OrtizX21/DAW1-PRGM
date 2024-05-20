package Interfaces;

public class Pila1 {

	Lista1 li1;
	
	Pila1 () {
		
		li1 = new Lista1 ();
	}
	
	public Integer apilar (Integer numero) {
		li1.insertarFinal(numero);
		return numero;
	}
	
	public Integer desapilar () {
		return li1.eliminar(0);
	}

	@Override
	public String toString() {
		
		String cadena = "";
		
		for(int i = 0; i < li1.tabla.length; i++) {
			
			cadena = cadena + " " + li1.tabla[i];
		}
		return cadena;
	}
}