package Examen2_Repaso;

public class Boxeadores {
	
	private String Nombre;
	private int Edad;
	private String Apodo;
	public enum Estilos {PEEK_ABO, HITMAN, COUNTER, SLUGGER, GHOST}
	Estilos Estilo;
	
	Estilos Agresivo = Estilos.PEEK_ABO;
	Estilos Jabs_Largos = Estilos.HITMAN;
	Estilos Estilista = Estilos.COUNTER;
	Estilos Ortodoxo = Estilos.GHOST;
	
	Boxeadores (String Name, int Age, String Subname, Estilos Estilo) {
		
		this.Nombre = Name;
		this.Edad = Age;
		this.Apodo = Subname;
		this.Estilo = Estilo;
	}
	
	String setNombre (String Name) {
		
		this.Nombre = Name;
		return Nombre;
	}
	
	String getNombre () {
		
		return this.Nombre;
	}
	
	int setEdad (int Age) {
		
		this.Edad = Age;
		return this.Edad;
	}
	
	int getEdad () {
		
		return this.Edad;
	}
	
	String setApodo (String Subname) {
		
		this.Apodo = Subname;
		return Apodo;
	}
	
	String getApodo () {
		
		return this.Apodo;
	}
	
	Estilos setEstilo (Estilos style) {
		
		this.Estilo = style;
		return this.Estilo;
	}
	
	Estilos getEstilo () {
		
		return this.Estilo;
	}
	
	@Override
	public String toString() {
		return "Boxeadores [Nombre=" + Nombre + ", Edad=" + Edad + ", Apodo=" + Apodo + ", Estilo=" + Estilo + "]";
	}

	void LicenciaProfesional () {
		
		System.out.println("Nombre Completo Del Boxeador: " + Nombre);
		System.out.println("Edad Del Boxeador: " + Edad);
		System.out.println("Apodo Del Boxeador " + Apodo);
		System.out.println("Estilo Del Boxeador: " + Estilo);

	}
}