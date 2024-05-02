package Clases_Abstractas;

public class Campana extends Instrumento {
	
	public Campana () {
		super();
	}
	// DESARROLLAMOS EL METODO ABSTRACTO INTERPRETAR DEL INSTRUMENTO PARA LA CAMPANA.

	@SuppressWarnings("incomplete-switch")
	@Override
	void interpretar() {

		for (notaMusical nota : melodia) {
			
			switch (nota) {
			
			case FA:
				
			System.out.println("fa");
			
			break;
			
			case MI:
				
			System.out.println("mi");
			
			break;
			
			case SOL:
				
			System.out.println("sol");
			
			break;
			
			case DO:
				
			System.out.println("do");
			
			break;
			
			}
			System.out.println();
		}
	}
	
	

}
