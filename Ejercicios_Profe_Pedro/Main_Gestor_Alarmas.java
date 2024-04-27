package Ejercicios_Profe_Pedro;

public class Main_Gestor_Alarmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gestor_Alarmas alarma1 = new Gestor_Alarmas(3);
		
		//CREAR LOS VALORES DE LAS ALARMAS.
		alarma1.crearAlarma(11, 11);
		alarma1.crearAlarma(12, 12);
		alarma1.crearAlarma(13, 13);
		alarma1.ActivarAlarma(11);
		System.out.println(alarma1 + " " + alarma1.MostrarAlarmas());
		
		//COMPROBANDO LONGITUD Y INSERTAR VALORES EN LAS ALARMAS, ACTIVAR ALARMASS.
		alarma1.eliminarAlarma(0);
		System.out.println();
		alarma1.crearAlarma(14, 14);
		alarma1.ActivarAlarma(1);
		
		//AUMENTANDO TIEMPO Y DESACTIVANDO LA ALARMA.
		alarma1.desactivarAlarma(1);
		alarma1.AvanzarTiempo(33);
		System.out.println(alarma1 + " " + alarma1.MostrarAlarmas());
		
		//RETROCEDIENDO TIEMPO.
		alarma1.retrocederTiempo(33);
		System.out.println(alarma1 + " " + alarma1.MostrarAlarmas());
	}
}