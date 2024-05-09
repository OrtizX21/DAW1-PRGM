package Pruebas_Arrays;

public class Ciudades_Mapa {
	
	static boolean tour (String tabla [][], int columna, int fila , String city) {
				
		if(tabla[columna][fila] == city) {	
			return true;
		}
		else if(tabla[fila][columna] == city){
			return true;
		}
		
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ciudades [][] = { 
				{"Armenia", "Armenia", "Madrid", "Armenia"  },
				{"Valencia", "Armenia", "Armenia", "Armenia"},
				{"Armenia", "Milan", "Armenia", "Armenia"   },
				{"Armenia", "Armenia", "Armenia", "Armenia" }
				};
		
		int fila = 2;
		int columna= 1;
		String ciudad = "Milan";
		
		if(tour(ciudades, fila, columna, "Milan")) {
			System.out.println("El viaje esta incluido en el tour: " + ciudad + "\n");
		}
		else {
			System.out.println("El viaje no esta incluido en el tour." + "\n");
		}
		
		columna = 2;
		fila = 0;
		ciudad = "Madrid";
		
		if(tour(ciudades, columna, fila, "Madrid")) {
			System.out.println("El viaje esta incluido en el tour: " + ciudad + "\n");
		}
		else {
			System.out.println("El viaje no esta incluido en el tour." + "\n");
		}

	}

}
