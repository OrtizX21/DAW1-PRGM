package POO;

import java.util.*;

public class Lista {

	Integer Tabla1[];
	int Insertados = 0;

	Lista() {

		Tabla1 = new Integer[0];
	}

	void InsertarPrincipio(Integer Nuevo) {

		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, 0, Tabla1, 0, Tabla1.length);
		Tabla1[0] = Nuevo;
		Insertados++;
		
	}

	void InsertarFinal(Integer Nuevo) {

		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		Tabla1[Tabla1.length - 1] = Nuevo;
		Insertados++;

	}

	void InsertarFinalLista(Lista otraLista) {

		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + otraLista.Tabla1.length);
		System.arraycopy(otraLista.Tabla1, 0, Tabla1, Tabla1.length - otraLista.Tabla1.length, otraLista.Tabla1.length);

	}

	void InsertarDeseado(int Posicion, Integer Nuevo) {

		if (Posicion < 0 || Posicion > Tabla1.length) {
			
			System.out.println("Valor A Insertar Fuera De Rango.");
			System.exit(0);
		}
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length + 1);
		System.arraycopy(Tabla1, Posicion, Tabla1, Posicion, Tabla1.length - Posicion);
		Tabla1[Posicion] = Nuevo;
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length - 1);
		Insertados++;

	}

	Integer Eliminar(int Indice) {

		Integer Eliminar = null;
		int LongitudTabla = Tabla1.length;

		
		if (Indice >= 0 && Indice <= LongitudTabla) {

			Eliminar = Tabla1[Indice];

			for (int i = Indice; i < LongitudTabla - 1; i++) {

				Tabla1[i - 1] = Tabla1[i];
			}
		}
		
		else if (Indice < 0 || Indice > LongitudTabla) {

			System.out.println("NO SE PUEDE ELIMINAR ESTE VALOR.");
		}
		
		Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length - 1);
		Insertados--;
		
		return Eliminar;
	}

	Integer getIndice(int Valor) {

		int Indice = 0;

		while (Indice < Tabla1.length && Tabla1[Indice] != Valor) {
			
			Indice++;
		}

		if (Indice < Tabla1.length) {

			System.out.println("Posicion Del Valor Buscado: " + Indice + ".");
		}

		else {

			System.out.println("No Se Encontro El Valor.");
		}

		return Indice;
	}

	int Buscar(Integer claveBusqueda) {

		int Posicion = 0;
		int Elementos = Tabla1.length;
		int Insertar = -Posicion - 1;

		while (Posicion < Elementos && Tabla1[Posicion] != claveBusqueda) {

			Posicion++;
		}

		if (Posicion < Elementos) {

			System.out.println("El Valor Que Busca Esta En La Posicion: " + Posicion + ".");
		}

		else {

			System.out.println("No Se Encontro El Valor En La Tabla: " + Insertar + ".");
		}

		return claveBusqueda;
	}

	static Lista concatena(Lista lista1, Lista lista2) {

		Lista lista3;
		
		lista3 = new Lista();
		lista3.Tabla1 = Arrays.copyOf(lista1.Tabla1, lista1.Tabla1.length + lista2.Tabla1.length);
		System.arraycopy(lista2.Tabla1, 0, lista3.Tabla1, lista1.Tabla1.length, lista2.Tabla1.length);
		System.out.println("Lista Concatenada: " + Arrays.toString(lista3.Tabla1));
		return lista3;
	
	}

	public int numeroElementos() {

		System.out.println("Numero De Elementos De La Lista: " + Tabla1.length + ".");
		return Tabla1.length;
	}

	public void Mostrar() {

		System.out.println("Valores De La Lista: " + Arrays.toString(Tabla1));
		System.out.println("Longitud De La Tabla: " + Tabla1.length);
		System.out.println("Elementos Insertados En La Lista: " + Insertados);
	}
}