package ArraysList;

import java.util.ArrayList;

public class Persona implements Comparable<Object> {

	private int edad, peso, altura;
	private String nif;
	
	public Persona(int edad, int peso, int altura, String nif) {
		super();
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.nif = nif;
	}

	public Persona(int edad, int peso, int altura) {
		super();
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public static ArrayList <Persona> listaPersonas (int n) {
		
		ArrayList<Persona> gestionPersonas = new ArrayList<Persona>();
		
		for(int i = 0; i < n; i++) {
			Persona p1 = new Persona(i, i, i);
			gestionPersonas.add(p1);
		}
		return gestionPersonas;
	}
	
	@Override
	public String toString() {
		return "Persona [ edad = " + edad + ", peso = " + peso + ", altura = " + altura + ", nif = " + nif + " ]";
	}

	@Override
	public int compareTo(Object o) {
		
		Persona p1 = (Persona)o;
		return this.edad - p1.edad;
	}
}