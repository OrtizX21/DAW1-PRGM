package Examen2_Repaso;

public class Main_Cadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cadenas Mensaje1, Mensaje2;
		
		Mensaje1 = new Cadenas ("Hola Soy Felipe.");
		System.out.println(Mensaje1.MostrarMensaje());
		
		Mensaje2 = new Cadenas ("");
		Mensaje2.setCadena("Mi Apellido Es Ortiz.");
		System.out.println("El Apellido Del Objeto Mensaje 2 Es: " + Mensaje2.getCadena());
		
		Mensaje2.MostrarAlReves("Caballo");
	}

}
