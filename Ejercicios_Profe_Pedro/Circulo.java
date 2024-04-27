package Ejercicios_Profe_Pedro;

public class Circulo {

	/*
	 * 4. *Crear una clase "Círculo"*: - Atributos: radio. - Métodos:
	 * calcularÁrea(), calcularPerímetro(). - Crea varios objetos de la clase
	 * Círculo y prueba los métodos.
	 */
	
	double radio;
	
	Circulo(){
		radio = 0;
	}
	Circulo(double radius){
		radio = radius;
	}
	void calcularArea() {
		double area = (radio * radio);
		System.out.println("Area del circulo: " + area);
	}
	void calcularPerimetro() {
		double perimetro = (radio * 2);
		System.out.println("Perimetro del circulo: " + perimetro);
	}
}
