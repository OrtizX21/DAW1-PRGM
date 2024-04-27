package Ejercicios_Profe_Pedro;
import java.util.Arrays;

public class Gestor_Alarmas {
	
	private Alarma _alarmas[], alarma1;
	private int num_alarmas;
	
	Gestor_Alarmas(int cantidadMaxima){
		this._alarmas = new Alarma [cantidadMaxima];
		this.num_alarmas = 0;
	}
	
	boolean crearAlarma(int horas, int minutos) {
		
		boolean espacio = false;
		alarma1 = new Alarma (horas, minutos);
		
		if (this.num_alarmas >= this._alarmas.length) {
			System.out.println("Nos queda espacio en el array para insertar mas valores? " + espacio + "\n");
		}
		else if(this.num_alarmas >= 0 && this._alarmas.length >= 0) {
			this._alarmas[num_alarmas]= alarma1;
			this.num_alarmas++;
			espacio = true;
			System.out.println("Podemos insertar valores en el array de alarmas? " + espacio + "\n");
		}
		return espacio;
	}
	
	int eliminarAlarma(int posicion) {
		for(int i = posicion  + 1; i < this._alarmas.length; i ++) {
			this._alarmas[i - 1] = this._alarmas[i];
		}
		this._alarmas = Arrays.copyOf(this._alarmas, this._alarmas.length - 1);
		System.out.println("Despues de eliminar una alarma: " + Arrays.toString(this._alarmas));
		return posicion;
	}
	
	boolean ActivarAlarma(int indice) {
		
		int posicion = 0;
		
		while(posicion < this._alarmas.length && this.num_alarmas != indice) {
			posicion++;
		}
		 if (indice > this._alarmas.length) {
			Alarma.atributo_hora = false;
			System.out.println("La alarma a encender esta en la posición adecuada? " + Alarma.atributo_hora + "\n");
		}
		 else if(posicion <= this._alarmas.length) {
			Alarma.atributo_hora = true;
			System.out.println("Se encendio la alarma? " + Alarma.atributo_hora + "\n");
		}
		return Alarma.atributo_hora;
	}
	
	boolean desactivarAlarma(int indice) {
		
		int posicion = 0;
		
		while(posicion < this._alarmas.length && this.num_alarmas != indice) {
			posicion++;
		}
		 if (indice > this._alarmas.length) {
			Alarma.atributo_hora = true;
			System.out.println("La alarma no se puede apagar fuera de rango: " + Alarma.atributo_hora + "\n");
		}
		 else if(posicion <= this._alarmas.length) {
			Alarma.atributo_hora = false;
			System.out.println("Alarma activada? " + Alarma.atributo_hora + "\n");
		}
		return Alarma.atributo_hora;
	}
	
	int AvanzarTiempo(int cantidad) {

		for(Alarma minutos : this._alarmas) {
			minutos.avanzarTiempo(cantidad);
		}
		return cantidad;
	}
	
	int retrocederTiempo(int cantidad) {
		for(Alarma minutos: this._alarmas) {
			minutos.retrocederTiempo(cantidad);
		}
		return cantidad;
	}
	
	String MostrarAlarmas() {
		return this.alarma1.infoAlarma();
	}
	
	@Override
	public String toString() {
		return "Gestor_Alarmas [_alarmas=" + Arrays.toString(_alarmas) +", num_alarmas="
				+ num_alarmas + "]";
	}	
}