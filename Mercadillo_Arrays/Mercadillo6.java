package Mercadillo_Arrays;

public class Mercadillo6 {

	//CREAMOS UNA METODO PARA PASAR LA TABLA DE DOS DIMENSIONES BOOLEANA Y DESDE QUE COLUMNA Y FILA QUIERO BUSCAR
	// Y VICEVERSA.
	
	static boolean paseo (boolean mapa[][], int fila, int columna) {

		if(mapa[fila][columna]) {
			return true;
		}
		else if(mapa[columna][fila]) {
			return true;
		}
		else{
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CREAMOS LA TABLA DE DOS DIMENSIONE
		boolean mapa [][] = {{false, false, true, false },
							 {true, false, false, true  },
							 {false, true, false, false },
							 {false, false, false, false}};

		// 1. PRIMERO PASANDO FILA Y LUEGO LA COLUMNA.
		int fila = 1;
		int columna = 3;

		if (paseo(mapa, fila, columna)) {
			System.out.println("Es posible viajar de la fila: " + fila + " a la columna: " + columna + "\n");
		} else {
			System.out.println("No es posible viajar de la fila: " + fila + " a la columna: " + columna + "\n");
		}
		
		// 2. PASAMOS PASANDO LA COLUMNA Y LUEGO LA FILA.
		columna = 1;
		fila = 2;
				
		if(paseo(mapa, columna, fila)) {
			System.out.println("Es posible viajar de la columna: " + columna + " a la fila: " + fila + "\n");
		} else {
            System.out.println("No es posible viajar de la columna: " + columna + " a la fila: " + fila + "\n");
        }
	}

}
