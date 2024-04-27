package Ejercicios_Profe_Pedro;

public class Main_Alarma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alarma alarma1 = new Alarma (11, 51);
		Alarma.atributo_hora = true;
		alarma1.activarAlarma();
		System.out.println(alarma1 + " " + alarma1.infoAlarma());
		
		Alarma.atributo_hora = false;
		alarma1.avanzarTiempo(59);
		alarma1.avanzarTiempo(11);
		alarma1.retrocederTiempo(5);
		alarma1.desactivarAlarma();
		System.out.println(alarma1 + " " + alarma1.infoAlarma());
	}
}
