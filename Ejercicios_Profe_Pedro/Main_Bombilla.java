package Ejercicios_Profe_Pedro;

public class Main_Bombilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bombilla Bombilla1, Bombilla2;
		Bombilla1 = new Bombilla();
		Bombilla2 = new Bombilla();
		
		Bombilla1.Encender();
		System.out.println("Bombilla 1: " + Bombilla1.Informacion());
		
		Bombilla.InterruptorGeneral = false;
		System.out.println("Bombilla 1: " + Bombilla1.Informacion());
		
		System.out.println();
		
		Bombilla.InterruptorGeneral = true;
		System.out.println("Bombilla 2: " + Bombilla2.Informacion());		
		System.out.println("Bombilla 1: " + Bombilla1.Informacion());
		System.out.println("Bombilla 2: " + Bombilla2.Informacion());

	}

}
