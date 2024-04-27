package Ejercicios_Profe_Pedro;

public class Automovil {

	/*
	 * 6. *Crear una clase "Automóvil"*: - Atributos: marca, modelo, año,
	 * velocidadActual. - Métodos: acelerar(), frenar(), mostrarInfo(). - Crea
	 * varios objetos de la clase Automóvil y prueba los métodos.
	 */
	Marca marca;
	enum Marca {HONDA,CUPRA,AUDI};
	String modelo;
	int anio;
	double velocidadActual;
	
	Automovil(){
		marca = Marca.AUDI;
		modelo = "R8";
		anio = 2018;
		velocidadActual = 80.0;
	}
	Automovil(Marca brand, String model, int year, double velActual){
		this.marca = brand;
		this.modelo = model;
		this.anio = year;
		this.velocidadActual = velActual;
	}
	double acelerar(double cantidad) {
		velocidadActual += cantidad;
		if(velocidadActual >= 180) {
			System.out.println("No estamos en la formula 1.");
		}
		return velocidadActual;
	}
	double frenar(double cantidad) {
		velocidadActual -= cantidad;
		if(velocidadActual == 0) {
			System.out.println("El coche esta apagado, o freno por completo: " + + velocidadActual + " Km/h.");
		}
		else if(velocidadActual < 0) {
			System.out.println("Velocidad invalidada: " + velocidadActual + "Km/h.");
		}
		else {
			System.out.println("Reduciendo velocidad: " + velocidadActual + "Km/h.");
		}
		return velocidadActual;
	}
	String mostrarInfo() {
		return"Marca del coche: " + marca + " ,Modelo del coche: " + modelo + " ,Año lanzamiento: " + anio + " ,Velocidad actual: " + velocidadActual + " Km/h.";
	}
}