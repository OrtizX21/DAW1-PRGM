package Ejercicios_Profe_Pedro;

/*1. *Crear una clase "Persona"*:
	   - Atributos: nombre, edad, género.
	   - Métodos: saludar(), cumplirAños().
	   - Crea un objeto de la clase Persona y prueba los métodos.
*/
public class Persona {

	String nombre;
	int edad;
	sexo Sexo;
	enum sexo {MASCULINO,FEMENINO};
	sexo hombre = sexo.MASCULINO;
	sexo mujer = sexo.FEMENINO;
	
	Persona(String name, int age, sexo sex){
		this.nombre = name;
		this.edad = age;
		this.Sexo = sex;
	}
	String setNombre(String name) {
		nombre = name;
		return nombre;
	}
	String getNombre() {
		return this.nombre;
	}
	int setEdad(int age) {
		edad = age;
		return this.edad;
	}
	String getEdad() {
		return "Edad: " + this.edad;
	}
	sexo setSexo (sexo sex) {
		Sexo = sex;
		return Sexo;
	}
	String getSexo() {
		return "Sexo: " + this.Sexo;
	}
	String saludar () {
		return"Hola mi nombre es: " + this.nombre;
	}
	int cumplirAños() {
		edad++;
		return this.edad;
	}
	void informacion() {
		System.out.println("Nombre de la persona: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Sexo: " + this.Sexo);
	}
}