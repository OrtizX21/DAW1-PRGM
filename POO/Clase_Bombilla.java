package POO;

public class Clase_Bombilla {

	private boolean Interruptor;
	private static boolean InterruptorGenral = true;
	
	Clase_Bombilla(){
		Interruptor = false;
	}
	
	void Encender () {
		this.Interruptor = true;
	}
	void Apagar () {
		this.Interruptor = false;
	}
	public boolean Estado () {	
		return (Interruptor && InterruptorGenral);
	}
		String Informacion () {
		if (Estado() == true) {
			return "La Bombilla Esta Encendida.";
		}
		else {		
				return "La Bombilla Esta Apagada.";
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clase_Bombilla Bombilla1, Bombilla2;
		Bombilla1 = new Clase_Bombilla();
		Bombilla2 = new Clase_Bombilla();
		
		Bombilla1.Encender();
		System.out.println("Bombilla 1: " + Bombilla1.Informacion());
		
		Clase_Bombilla.InterruptorGenral = false;
		System.out.println("Bombilla 1: " + Bombilla1.Informacion());
		
		System.out.println();
		
		Clase_Bombilla.InterruptorGenral = true;
		System.out.println("Bombilla 2: " + Bombilla2.Informacion());		
		System.out.println("Bombilla 1: " + Bombilla1.Informacion());
		System.out.println("Bombilla 2: " + Bombilla2.Informacion());
	}

}
