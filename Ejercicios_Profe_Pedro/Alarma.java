package Ejercicios_Profe_Pedro;

/*Define una clase Alarma con un atributo _hora, que es la hora a la que se debe activar la alarma. La clase dispondrá de los siguientes métodos:

- Alarma(int, int)
Constructor que recibe como parámetros la hora y los minutos de la alarma.
- avanzarTiempo(int)
Avanza el tiempo en la cantidad de minutos indicada.
- retrocederTiempo(int)
Retrocede el tiempo en la cantidad de minutos indicada.
- activarAlarma()
Activa la alarma si la hora actual coincide con la hora de la alarma.
- desactivarAlarma()
Desactiva la alarma.
- Método que nos permita mostrar la información de la alarma de la siguiente forma:
"Alarma activada a las HH:MM". Por ejemplo: "Alarma activada a las 08:30".*/

public class Alarma {

	private int hora;
	private int minutos;
	static boolean atributo_hora = true;

	Alarma(int hour, int minutes) {

		if(hour == 23 && minutes == 59) {
			this.hora = 0;
			this.minutos = 0;
		}
		else if(hour >= 0 || hour <= 22 && minutes >= 0 && minutes <= 58) {
			this.hora = hour;
			this.minutos = minutes;
		}
		else {
			System.out.println("Introduzca una hora y unos minutos validos (HORAS 0 Y 23), (MINUTOS 0 Y 59)" + "\n");

		}
	}
	
	int avanzarTiempo(int minutes) {
		
		if(minutes >= 0 || minutes <= 58) {
			this.minutos += minutes;
		}
		if (minutes == 59) {
			minutes = 0;
			this.hora++;
			this.minutos = minutes;
		}
		return this.minutos;
	}

	int retrocederTiempo(int minutes) {
		
		if(minutes >= 0 || minutes <= 58) {
			this.minutos -= minutes;
		}
		if (minutes == 59) {
			minutes = 0;
			this.hora--;
			this.minutos = minutes;
		}
		return this.minutos;
	}
	
	boolean activarAlarma() {
		return (atributo_hora);
	}
	
	boolean desactivarAlarma() {
		return (atributo_hora);
	}
	
	@Override
	public String toString() {
		return "Alarma [hora=" + hora + ", minutos=" + minutos + "]";
	}
	
	String infoAlarma() {
		if(activarAlarma() == true) {
			return "Activada" + "\n";
		}
		if(desactivarAlarma() == false) {
			return "Desactivada" + "\n";
		}
		else return "Sin programar" + "\n";
	}
}
