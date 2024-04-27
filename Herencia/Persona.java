package Herencia;

public class Persona {

	protected String nombre;
	int edad;
	double estatura;
	
	Persona (String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	void mostrarInfo () {
		System.out.println(nombre);		
		System.out.println(edad);
		System.out.println(estatura);
	}
}