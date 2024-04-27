package Ejercicios_Profe_Pedro;

public class Main_Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo c1 = new Circulo();
		c1.radio = 15;
		c1.calcularPerimetro();
		c1.calcularArea();
		System.out.println();
		
		Circulo c2 = new Circulo(150);
		c2.calcularPerimetro();
		c2.calcularArea();
	}

}
