package POO;

public class Pila1 {

	Lista lista1;
	
	Pila1 () {
		
		lista1 = new Lista ();
	}
	
	Integer apilar (Integer numero) {
		
		lista1.InsertarFinal(numero);
		return numero;
	}
	
	void desapilar () {
		
		lista1.Eliminar(lista1.Tabla1.length - 1);
		lista1.Mostrar();
	}
	
	void mostrar () {
		
		lista1.Mostrar();
	}
}