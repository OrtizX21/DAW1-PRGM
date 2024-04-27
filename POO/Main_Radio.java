package POO;

public class Main_Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Radio Radio1 = new Radio ();
		
		Radio1.Down();
		System.out.println("Radio 1: " + Radio1.Display() );
		
		Radio Radio2 = new Radio ();
		
		Radio2.Up();
		System.out.println("Radio 2: " + Radio2.Display() );


	}

}