package Ejercicios_Profe_Pedro;

public class Estudiante {

	/*
	 * 5. *Crear una clase "Estudiante"*: - Atributos: nombre, edad, calificaciones
	 * (array de double). - Métodos: calcularPromedio(), mostrarDatos(). - Crea
	 * varios objetos de la clase Estudiante y prueba los métodos.
	 */
	
	String nombre;
	int edad;
	double calificaciones[];
	
	Estudiante(){
		nombre = "";
		edad = 18;
		calificaciones = new double[3];
	}
	Estudiante(String name, int age) {
		this.nombre = name;
		this.edad = age;
		calificaciones = new double[3];
	}
	void ingresarNota (int posicion, double calif) {
		calificaciones[posicion]=calif;
	}
	double promedioCalificaciones() {
		double promedio = (calificaciones[0] + calificaciones[1] + calificaciones[2] / 3);
		return promedio;
	}
	String mostrarDatos() {
		return"Nombre del alumno: " + nombre + " ,Edad: " + edad + ", Calificaciones: " + calificaciones[0] + " ," + calificaciones[1] + " ," + calificaciones[2];
	}

}
