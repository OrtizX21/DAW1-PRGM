package POO;

public class Main_Pila1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pila1 p1;
		
		p1 = new Pila1();
		
		p1.apilar(Integer.valueOf(11));		
		p1.apilar(Integer.valueOf(12));
		p1.apilar(Integer.valueOf(13));
		p1.apilar(Integer.valueOf(14));
		p1.apilar(Integer.valueOf(15));
		
		p1.mostrar();
		System.out.println();
		
		p1.desapilar();
		System.out.println();
		
		p1.desapilar();
		System.out.println();

		p1.desapilar();
		System.out.println();
		
		p1.desapilar();
		System.out.println();
	}
}