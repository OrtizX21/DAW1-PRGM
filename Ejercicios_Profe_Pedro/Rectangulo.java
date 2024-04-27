package Ejercicios_Profe_Pedro;

public class Rectangulo {

	/*
	 * 7. *Crear una clase "Rectángulo"*: - Atributos: base, altura. - Métodos:
	 * calcularÁrea(), calcularPerímetro(). - Crea varios objetos de la clase
	 * Rectángulo y prueba los métodos.
	 */
	
	double altura;
	double base;
	
	Rectangulo(){
		altura = 8.0;
		base = 21.0;
	}
	Rectangulo(double alt, double anchura){
		altura = alt;
		base = anchura;
	}
	double calcularPerimetro() {
		double perimetro = (base + altura * 2);
		return perimetro;
	}
	double calcularArea() {
		double area = (altura * base);
		return area;
	}
}