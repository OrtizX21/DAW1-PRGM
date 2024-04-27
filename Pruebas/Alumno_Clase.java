package Pruebas;

public class Alumno_Clase {

	private String Dni;
	private String Nombre;
	private Double Notas [] = new Double [3];
	
	
	Alumno_Clase(String Doc) {
		
		this.Dni = Doc;
	}
	
	Alumno_Clase (String Name, String Doc) {
		
		this.Nombre = Name;
		this.Dni = Doc;
	}
	
	String setNombre(String Name) {
		
		Name = Nombre;
		return Name;
	}
	
	String getNombre(){
		
		System.out.println("Nombre Del Alumno Es: " + Nombre);
		return Nombre;
	}
	
	String getDni() {
		
		System.out.println("Dni Del Alumno: " + Dni);
		return this.Dni;
	}
	
	void IngresarNotas(int Posicion, Double Nota) {
		
		this.Notas[Posicion]= Nota;
	}
	
	Double[] getNotas () {
		
		System.out.println("Notas Del Alumno Son: " + Notas[0] + " " + Notas[1] + " " + Notas[2]);
		return this.Notas;
	}
	
	void MostrarInformacion () {
		
		System.out.println("Nombre Del Alumno Es: " + Nombre);
		System.out.println("Dni Del Alumno: " + Dni);
		System.out.println("Notas Del Alumno Son: " + Notas[0] + " " + Notas[1] + " " + Notas[2]);
	}
}
