package Ejercicios_Profe_Pedro;

public class Main_Rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangulo Rec1 = new Rectangulo();
		System.out.println("Area del Rectangulo 1: " + Rec1.calcularArea());
		System.out.println("Area del Rectangulo 1: " + Rec1.calcularPerimetro());
		System.out.println();
		
		Rectangulo Rec2 = new Rectangulo(8.0, 16.0);
		System.out.println("Area del Rectangulo 2: " + Rec2.calcularArea());
		System.out.println("Area del Rectangulo 2: " + Rec2.calcularPerimetro());

		
	}

}
