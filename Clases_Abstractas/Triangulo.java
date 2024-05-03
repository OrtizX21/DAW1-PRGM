package Clases_Abstractas;

public class Triangulo extends Poligono {

	Triangulo(double heigth, double weight) {
		super(heigth, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		double formula = (this.base * this.altura / 2);
		System.out.println("Area del Tríangulo: " + formula + "\n");
	}
}