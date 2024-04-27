package Herencia;

public class Main_Hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PRUEBA HORA 2.
		Hora hora1;
		hora1 = new Hora(11,0);
		System.out.println(hora1 + "\n");
		
		//DANDOLE VALOR A LA HORA (HORA Y MINUTOS).
		hora1.setHora(245);
		hora1.setMinuto(100);
		System.out.println();
		System.out.println(hora1);
		
		//INCREMENTAMOS LOS MINUTOS.
		hora1.incrementar();
		System.out.println(hora1);
		System.out.println();
		
		//MOSTRANDO HORA.
		System.out.println("Horas: " + hora1.getHora());
		System.out.println("Minutos:" + hora1.getMinutos());
	}
}