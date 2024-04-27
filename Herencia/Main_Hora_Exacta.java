package Herencia;

public class Main_Hora_Exacta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hora_Exacta Hora1, Hora2;
		
		//PRUEBA HORA 1.
		Hora1 = new Hora_Exacta (11, 12, 25);
		
		//HORA 24 PASA A CERO.
		Hora1.setHora(24);
		
		//MINUTOS 60 AUMENTA HORA.
		Hora1.setMinuto(25);
		
		//SEGUNDOS 60 CAMBIO MINUTO.
		Hora1.setSegundo(65);
		System.out.println(Hora1);
		
		//INCREMENTANDO SEGUNDOS.
		Hora1.incrementar();
		System.out.println(Hora1);
		System.out.println();
		
		//USANDO GETTERS.
		System.out.println("Horas: " + Hora1.getHora());
		System.out.println("Minutos: " + Hora1.getMinutos());
		System.out.println("Segundos: " + Hora1.getSegundos());
		System.out.println();


		//PRUEBA HORA 2.
		Hora2 = new Hora_Exacta (22, 22, 22);
		System.out.println(Hora2);
		
		Hora2.setHora(11);
		Hora2.setMinuto(11);
		System.out.println(Hora2);
		
		//INCREMENTANDO LOS MINUTOS EN LOS SEGUNDOS.
		Hora2.setSegundo(60);
		System.out.println(Hora2);
		
		//INCREMENTANDO SEGUNDOS Y MOSTRANDOLOS.
		Hora2.incrementar();
		System.out.println(Hora2);
	}

}