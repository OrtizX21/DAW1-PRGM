package Mercadillo_Arrays;
import java.util.*;

public class Mercadillo5 {
	
	static int [] LeeNotas (int t[]) {
		
		@SuppressWarnings("resource")
		Scanner Datos = new Scanner (System.in);
		for (int i = 1; i < t.length; i++) {
			System.out.println("Introduce Las Notas Del Alumno: " + i);
			t[i] = Datos.nextInt(); 
		}
		return t;
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5.- Debes crear una aplicación que ayude a gestionar las notas de un centro
		 * educativo. Los alumnos se organizan en grupos compuestos por 5 personas. leer
		 * las notas (números enteros) del primer, segundo y tercer trimestre de un
		 * grupo. Debes mostrar al final la nota media del grupo en cada trimestre y la
		 * media del alumno que se encuentra en una posición dad ( que el usuario
		 * introduce por teclado).
		 */

		final int RecogeNotas = 6;
		double Media = 0;
				
		int [] NotasPrimero = new int [RecogeNotas];	
		int [] NotasSegundo = new int [RecogeNotas];
		int [] NotasTercero = new int [RecogeNotas];
		
		
		System.out.println("Introduce Las Notas Del Primer Trimestre Del Grupo 1: \n");
		LeeNotas(NotasPrimero);
		
		System.out.println();
		System.out.println("Introduce Las Notas Del Segundo Trimestre Del Grupo 1: \n");
		LeeNotas(NotasSegundo);
		
		System.out.println();
		System.out.println("Introduce Las Notas Del Tercer Trimestre Del Grupo 1:  \n");
		LeeNotas(NotasTercero);


		int MediaPrimero = 0;
		int MediaSegundo = 0;
		int MediaTercero = 0;

		for (int i = 0; i < RecogeNotas; i++) {
			
			MediaPrimero += NotasPrimero[i];
			MediaSegundo += NotasSegundo[i];
			MediaTercero += NotasTercero[i];
			
		}
		

		System.out.println("Media Del Primer Trimestre: " + (double) MediaPrimero / RecogeNotas);	
		System.out.println("Media Del Segundo Trimestre: " + (double) MediaSegundo / RecogeNotas);
		System.out.println("Media Del Tercer Trimestre: " + (double) MediaTercero / RecogeNotas);
		

		Scanner Ps = new Scanner (System.in);
		
		System.out.println("");
		System.out.println("Seleccione El Número Del Estudiante Del Cual Quiere Saber La Media De Sus Notas: ");
		
		int Posic = Ps.nextInt();
		
		Media = (double) (NotasPrimero[Posic] + NotasSegundo[Posic] + NotasTercero[Posic]);
		
		System.out.println("");
		System.out.println("La Media Del Alumno En Todo El Curso Es De: " + Media);

		Ps.close();
		
	}

}