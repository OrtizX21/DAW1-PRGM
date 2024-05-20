package Interfaces;
import java.util.*;

public class Main_Pila1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pila1 p1;
		
		p1 = new Pila1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Encolando numeros en la pila: " + "\n");
		Integer numeros = sc.nextInt();
		
		while(numeros >= 0) {
			p1.apilar(numeros);
			numeros = sc.nextInt();
		}
		sc.close();
		System.out.println("Despues de encolar la pila: " + p1.toString());
		
		Integer desocupar = p1.desapilar();
		
		while(desocupar != null) {
			System.out.println(desocupar + " ");
			p1.desapilar();
		}
	}
}