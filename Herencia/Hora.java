package Herencia;

public class Hora {

	protected int hora;
	protected int minutos;
	
	Hora (int hour, int min) {
		this.hora = hour;
		this.minutos = min;
	}
	
	void incrementar () {
		if (this.minutos == 60) {
			this.hora++;
			this.minutos = 0;
		}
		this.minutos++;
	}
	
	boolean setHora (int hour) {
		
		boolean comprobar = false;
		
		if (hour > 24) {
			comprobar = false;
			System.out.println(comprobar);
		}
		else if (hour == 24) {
			this.hora = 0;
			comprobar = true;
			System.out.println(comprobar);
		}
		else if (hour >= 0 || hour <= 23) {
			this.hora = hour;
			comprobar = true;
			System.out.println(comprobar);
		}
		return comprobar;
	}
	
	int getHora () {
		return this.hora;
	}
	
	boolean setMinuto (int min) {
		
		boolean comprobar = false;
		
		if (min == 60) {
			this.hora++;
			this.minutos = 0;
			comprobar = true;
			System.out.println(comprobar);
		}
		else if (min > 61) {
			comprobar = false;
			System.out.println(comprobar);
		}
		else if (min >= 0 || min <= 59) {
			this.minutos = min;
			comprobar = true;
			System.out.println(comprobar);
		}	
		return comprobar;
	}
	
	int getMinutos () {
		return this.minutos;
	}
	
	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minutos=" + minutos + "]";
	}
}