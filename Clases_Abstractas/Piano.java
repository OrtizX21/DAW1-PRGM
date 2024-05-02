package Clases_Abstractas;

public class Piano extends Instrumento {

	public Piano () {
		super();
	}
	
	@Override
	public void interpretar() {
		
		for (int i =0 ; i< melodia.length ; i++) {

			switch ( melodia[i] ) {

			case DO:

			System.out.print("do ");

			break;

			case RE:

			System.out.print("re ");

			break;

			case MI:

			System.out.print("mi ");

			break;

			case FA:

			System.out.print("fa ");

			break;

			case SOL:

			System.out.print("sol ");

			break;

			case LA:

			System.out.print("la ");

			break;

			case SI:

			System.out.print("si ");

			break;

			}

			}
			System.out.println("");

			}
}