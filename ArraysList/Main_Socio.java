package ArraysList;

import java.util.ArrayList;

public class Main_Socio {
	
	static ArrayList<Socio> listaSocios = new ArrayList<>();

	public static void main(String[] args) {
		
		for(int i = 1; i < 16; i++) {	
			Socio socio1 = new Socio(i, "Marina:" + " " + i); 
			listaSocios.add(socio1);
		}		
		System.out.println("Mostrando la longitud del ArrayList: " + listaSocios.size() + "\n");
		
		for(int posicion = 0; posicion < listaSocios.size(); posicion++) {
			listaSocios.get(posicion);
		}
		System.out.println(listaSocios.toString());
	}

}
