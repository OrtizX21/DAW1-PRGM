package Clases_Abstractas;

public class Rectangulo extends Poligono {

	Rectangulo(double heigth, double weight) {
		super(heigth, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub		
		return (this.getBase() * this.getAltura());
	}
}
