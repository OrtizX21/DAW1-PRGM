package POO;

public class Main_Pila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Pila pila1;
		pila1 = new Pila ();
		
		pila1.apliar(Integer.valueOf(11));
		pila1.apliar(Integer.valueOf(12));
		pila1.apliar(Integer.valueOf(13));
		pila1.apliar(Integer.valueOf(14));
		pila1.apliar(Integer.valueOf(15));
		
		System.out.println(pila1.mostrar());
		
		pila1.desapilar();
		pila1.desapilar();
		pila1.desapilar();
		pila1.desapilar();
		pila1.desapilar();
		pila1.desapilar();

	
	}
}
