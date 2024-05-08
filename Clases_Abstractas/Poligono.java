package Clases_Abstractas;

public abstract class Poligono {
	
	private double base;
	private double altura;
	
	Poligono(double heigth, double weight){
		this.altura = heigth;
		this.base = weight;
	}
	
	double getBase() {
		return this.base;
	}
	
	double getAltura() {
		return this.altura;
	}
	
	abstract double area ();
}
