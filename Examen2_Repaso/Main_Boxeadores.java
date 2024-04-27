package Examen2_Repaso;
import Examen2_Repaso.Boxeadores.Estilos;

public class Main_Boxeadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boxeadores Box1, Box2, Box3, Box4, Box5;
		
		Box1 = new Boxeadores ("Ippo Makunouchi", 19, "Dios Del Viento", Estilos.PEEK_ABO);
		System.out.println(Box1 + "\n");
		Box1.LicenciaProfesional();
		System.out.println();
		
		Box2 = new Boxeadores ("Ryo Mashiba", 21, "La Parca", Estilos.HITMAN);
		Box2.LicenciaProfesional();
		System.out.println();
		
		Box3 = new Boxeadores ("Ichirou Myata", 19, "Dios Del Trueno", Estilos.COUNTER);
		System.out.println("Nombre: " + Box3.getNombre());
		System.out.println("Edad: " + Box3.getEdad());
		System.out.println("Apodo: " + Box3.getApodo());
		System.out.println("Estilo: " + Box3.getEstilo());
		System.out.println();

		
		Box4 = new Boxeadores ("Mamoru Takamura", 31, "Halcón Japones",  Estilos.SLUGGER);
		Box4.setEstilo(Estilos.GHOST);
		Box4.LicenciaProfesional();
		System.out.println();
		
		Box5 = new Boxeadores ("Ricardo Martinez", 35, "Dios Del Sol", Estilos.GHOST);
		System.out.println("Nombre Del GOAT Del Boxeo: " + Box5.getNombre());
		System.out.println("Edad Del GOAT: " + Box5.getEdad());
		System.out.println("Apodo Del GOAT: " + Box5.getApodo());
		System.out.println("Estilo Del GOAT: " + Box5.getEstilo());

	}

}
