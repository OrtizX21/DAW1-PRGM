package Examen2_Repaso;
import java.util.*;

public class Insertar {

	int Tabla1 [] = new int [7];
	
	Insertar (int Tabla[]) {
		
		this.Tabla1 = Tabla;
		
	}

	
	int Posicion1 (int Valor) {
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[0] = Valor;
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length - 1);
		return Valor;
	}
	
	int Posicion2 (int Valor) {
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[1] = Valor;
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length - 1);
		return Valor;
	}

	int Posicion3 (int Valor) {
	
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[2] = Valor;
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length - 1);
		return Valor;
	}
	
	int Posicion4 (int Valor) {
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[3] = Valor;
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length - 1);
		return Valor;
	}
	
	int Posicion5 (int Valor) {
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[4] = Valor;
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length - 1);
		return Valor;
	}
	
	int Posicion6 (int Valor) {
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[5] = Valor;
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length - 1);
		return Valor;
	}
	
	int Posicion7 (int Valor) {
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[6] = Valor;
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length - 1);
		return Valor;
	}
	
	String Valores () {
		
		return "Valores De La Tabla: " + Arrays.toString(Tabla1);
	}	
}