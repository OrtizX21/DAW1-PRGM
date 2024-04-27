package POO;
import java.util.*;

public class Main_Hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		Hora Hora1 = new Hora ();
		
		System.out.println("Introduce La Hora: ");
		int Datos = sc.nextInt();
		Hora1.setHor(Datos);
		System.out.println("\n");

		
		System.out.println("Introduce Los Minutos: ");
		Datos = sc.nextInt();
		Hora1.setMin(Datos);
		System.out.println("\n");

		
		System.out.println("Introduce Los Segundos: ");
		Datos = sc.nextInt();
		Hora1.setSeg(Datos);
		System.out.println("\n");

		System.out.println("Ingresa Cuantos Segundos Quieres Incrementar: ");
		int A = sc.nextInt();
		System.out.println("\n");
		
		System.out.println("Hora Actual Con Los Segundos Incrementados:");
		System.out.println();
		
		for (int i = 0; i <= A; i++) {
			
			System.out.println(Hora1.getHor() + ":" + Hora1.getMin() + ":" + Hora1.getSeg());
			
			Hora1.Segundos();
		}
		
		sc.close();
	}

}