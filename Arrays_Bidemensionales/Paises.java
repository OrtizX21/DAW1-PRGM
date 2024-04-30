package Arrays_Bidemensionales;
import java.util.*;

public class Paises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		País: Argentina
//		Ciudades: La Plata
//		Buenos Aires
//		Belgrano
//		País: España
//		Ciudades: Madrid
//		Valencia
//		Barcelona
//		País: Francia
//		Ciudades: Lyon
//		Paris 
//		Marsella
//		País: Italia
//		Ciudades: Roma 
//		Milan
//		Venecia

		System.out.println("Introduce los datos de los paises y sus ciudades: ");
		Scanner datos = new Scanner(System.in);		
		String Paises [][] = new String [4][4];
		
		for(int i = 0; i < Paises.length; i++) {
			for(int j = 0; j < Paises[0].length; j++) {
				Paises[i][j] = datos.nextLine();
			}
		}
		for(String [] countries: Paises) {
			System.out.println(Arrays.deepToString(countries));
		}
		
		datos.close();
	}
}