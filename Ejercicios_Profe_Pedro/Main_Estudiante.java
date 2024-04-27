package Ejercicios_Profe_Pedro;

public class Main_Estudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante est1 = new Estudiante();
		est1.nombre = "Valeria Rojas";
		est1.edad = 18;
		est1.ingresarNota(0, 10);
		est1.ingresarNota(1, 9.5);
		est1.ingresarNota(2, 8.7);
		System.out.println(est1.mostrarDatos());
		System.out.println("Promedio de Valeria: " + est1.promedioCalificaciones());
		System.out.println();
		
		Estudiante est2 = new Estudiante("Juanjo Rojas", 21);
		est2.ingresarNota(0, 10);
		est2.ingresarNota(1, 10);
		est2.ingresarNota(2, 10);
		System.out.println(est2.mostrarDatos());
		System.out.println("Promedio de Valeria: " + est2.promedioCalificaciones());


	}

}
