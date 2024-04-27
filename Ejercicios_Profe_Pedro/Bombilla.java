package Ejercicios_Profe_Pedro;

public class Bombilla {

	private boolean Interruptor;
	static boolean InterruptorGeneral = true;
	
	Bombilla(){
		Interruptor = false;
	}
	
	void Encender () {
		this.Interruptor = true;
	}
	void Apagar () {
		this.Interruptor = false;
	}
	boolean Estado () {	
		return (Interruptor && InterruptorGeneral);
	}
		String Informacion () {
		if (Estado() == true) {
			return "La Bombilla Esta Encendida.";
		}
		else {		
				return "La Bombilla Esta Apagada.";
			}
	}
}