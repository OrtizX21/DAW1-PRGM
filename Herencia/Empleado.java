package Herencia;

public class Empleado extends Persona {
	
	double salario;
	
	Empleado (String nombre, int edad, double estatura, double salario) {
		super(nombre, edad, estatura);
		this.salario = salario;
	}
	
	@Override
	void mostrarInfo () {	
		super.mostrarInfo();
		System.out.println(salario);
	}
}