package POO;


public class Gestor_Cuenta {

	public String NombGestor; // NOMBRE DEL GESTOR PREDETERMINADO.

	private String TelGestor; // NUMERO DE TELEFONO DEL GESTOR.

	double ImporteMax = 0; // IMPORTE MAXIMO DE LA CUENTA.
	

	public Gestor_Cuenta(String Nom, String Tel, double importe) {

		this.NombGestor = Nom;
		this.TelGestor = Tel;
		this.ImporteMax = importe;

	}
	
	
	public Gestor_Cuenta (String Nom, String Tel) {
		
		this (Nom, Tel, 100000.);
	}
	
	
	String getTel () {
		
		return TelGestor;
	}
	

	public void DatosG() {

		
		System.out.println("El Nombre Del Gestor De Tu Cuenta Es: " + NombGestor);

		System.out.println("El Numero De Tu Gestor Para Resolver Cualquier Incidencia Es: " + TelGestor);

		System.out.println("El Importe Maximo De Tu Cuenta Es: " + ImporteMax + " €");
	}
}