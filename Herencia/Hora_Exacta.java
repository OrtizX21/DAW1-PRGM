package Herencia;

public class Hora_Exacta extends Hora {

	protected int segundos;
	
	Hora_Exacta (int hora, int minutos, int segundos) {
		super(hora, minutos);
		this.segundos =segundos;
	}
	
	void incrementar () {
		if (this.segundos == 60) {
			this.minutos++;
			this.segundos = 0;
		}
		this.segundos++;;
	}
	
	boolean setSegundo (int seg) {
		
		boolean comprobar = false;
		
		if (seg == 60) {
			this.segundos = 0;
			this.minutos++;
			comprobar = true;
			System.out.println(comprobar);
		}
		else if (seg > 60) {
			comprobar = false;
			System.out.println(comprobar);
		}
		else if (seg >= 0 || seg <= 59) {
			this.segundos = seg;
			comprobar = true;
			System.out.println(comprobar);
		}
		return comprobar;
		}
	
	int getSegundos () {
		return this.segundos;
	}
	
	@Override
	public String toString() {
		return "Hora_Exacta [hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + "]";
	}	
}