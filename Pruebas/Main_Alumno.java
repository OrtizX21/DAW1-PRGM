package Pruebas;

public class Main_Alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Alumno_Clase Alumno1, Alumno2;
		
		//10
		Alumno1 = new Alumno_Clase("1111111111T");
		Alumno1.MostrarInformacion();
		
		System.out.println();
		
		//11
		Alumno1.setNombre("Federico Pain Pain");
		
		//13
		Alumno1.IngresarNotas(0, 9.9);
		Alumno1.IngresarNotas(1, 8.0);
		Alumno1.IngresarNotas(2, 8.9);
		Alumno1.MostrarInformacion();
		
		//15
		System.out.println("Nombre Del Paisano: " + Alumno1.getNombre());
		
		//12
		Alumno2 = new Alumno_Clase ("Pepe Garcia Sanz", "2222222222W");
		
		//14
		Alumno2.getDni();
		Alumno2.getNombre();
		Alumno2.getNotas();
		
		Alumno2.MostrarInformacion();
		
		//16
		
		Alumno2.getDni();
	}

}
