package Examen2_Repaso;

public class Cadenas {

	private String Cadena;
	
	Cadenas (String Mensaje) {
		
		this.Cadena = Mensaje;
	}
	
	String setCadena (String Messagge) {
		
		Cadena = Messagge;
		return this.Cadena;
	}
	
	String getCadena () {
		
		return this.Cadena;
	}
	
	String MostrarAlReves (String Mensaje) {
		
		for (int i = Cadena.length() - 1; i >= 0; i--) {
			
			char Palabra = Cadena.charAt(i);
			System.out.print(Palabra);
		}
		
		return Mensaje;
	}
	
	String MostrarMensaje () {
		
		return "El Mensaje Incluye: " + this.Cadena;
	}
}
