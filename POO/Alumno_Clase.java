package POO;

public class Alumno_Clase {

	private String Dni;
	private String Nombre;
	private double Notas [] = new double [0];
	
	
	Alumno_Clase(String Doc) {
		
		this.Dni = Doc;
		this.Notas = new double [3];
	}
	
	Alumno_Clase (String Name, String Doc) {
		
		this.Nombre = Name;
		this.Dni = Doc;
		this.Notas = new double [3];
	}
	
	String setNombre(String Name) {
		
		Nombre = Name;
		return Name;
	}
	
	String getNombre(){
		
		return Nombre;
	}
	
	String getDni() {
		
		return this.Dni;
	}
	
	void IngresarNotas(int Posicion, Double Nota) {
		
		this.Notas[Posicion]= Nota;
	}
	
	String getNotas () {
		
		return "Notas Del Alumno Son: " + Notas[0] + ", " + Notas[1] + ", " + Notas[2] + "";
	}
	
	void MostrarInformacion () {
		
		System.out.println("Nombre Del Alumno Es: " + Nombre);
		System.out.println("Dni Del Alumno: " + Dni);
		System.out.println("Notas Del Alumno Son: " + Notas[0] + ", " + Notas[1] + ", " + Notas[2]);
	}
}
