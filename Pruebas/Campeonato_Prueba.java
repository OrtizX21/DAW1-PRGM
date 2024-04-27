package Pruebas;

import java.util.*;

public class Campeonato_Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		     try (Scanner sc = new Scanner(System.in)) {
				int tablaTesoros[] = new int[1];
		        System.out.println("Hola indiana...");
		        int longitud = tablaTesoros.length;
		        int valor = 0;
		        
		        System.out.println("Valor del tesoro 0");
		        
		        valor = sc.nextInt();
		        tablaTesoros[0] = valor;
		        int[] NtablaTesoros=Arrays.copyOf(tablaTesoros,longitud); //Nueva tabla con los valores de la origianl
		            int i=1; //contador
		            while (valor != -1) {  
		                valor=sc.nextInt(); //ingresa un numero el usuario
		                if (valor==-1) {break;} // si es -1 salte del while para no guardarlo en la tabla
		                 NtablaTesoros = Arrays.copyOf(NtablaTesoros, i+1); //sobreescribe lo que hay en la nueva tabla con los datos que ya tenia y ponle de tamaño 1 mas
		                NtablaTesoros[i]=valor; // guarda en la posición del contador 
		                i++; // sumale 1 al contador
		  
		                
		            }
		            System.out.println(Arrays.toString(NtablaTesoros));
			}
		}
		  
	}
