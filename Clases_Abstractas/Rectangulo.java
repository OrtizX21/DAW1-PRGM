package Clases_Abstractas;

public class Rectangulo extends Poligono {

	Rectangulo(double heigth, double weight) {
		super(heigth, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		double formula = (this.base * this.altura);
		System.out.println("Area del Rectángulo: " + formula + "\n");
	}

}
