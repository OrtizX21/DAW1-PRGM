package Clases_Abstractas;

public abstract class Poligono {
	
	protected double base;
	protected double altura;
	
	Poligono(double heigth, double weight){
		this.altura = heigth;
		this.base = weight;
	}
	abstract double area ();
}
