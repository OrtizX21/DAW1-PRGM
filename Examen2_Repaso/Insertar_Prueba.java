package Examen2_Repaso;

import java.util.Arrays;

public class Insertar_Prueba {

int Tabla1 [];
	
	Insertar_Prueba () {
		
		Tabla1 = new int [7];
		
	}

	
	int Posicion1 (int Valor) {
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[0] = Valor;
		return Valor;
	}
	
	int Posicion2 (int Valor) {
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[1] = Valor;
		return Valor;
	}

	int Posicion3 (int Valor) {
	
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[2] = Valor;
		return Valor;
	}
	
	int Posicion4 (int Valor) {
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[3] = Valor;
		return Valor;
	}
	
	int Posicion5 (int Valor) {
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[4] = Valor;
		return Valor;
	}
	
	int Posicion6 (int Valor) {
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[5] = Valor;
		return Valor;
	}
	
	int Posicion7 (int Valor) {
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length - 1);
		Tabla1[6] = Valor;
		return Valor;
	}
	
	String Valores () {
		
		return "Valores De La Tabla: " + Arrays.toString(Tabla1);
	}	
}
