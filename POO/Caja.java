package POO;

public class Caja {

	private int ancho;
	private int alto;
	private int fondo;
	private String etiqueta;
	Unidad unidad;
	
	Caja(int anchura, int altura, int capacidad, Unidad medida){
		this.ancho = anchura;
		this.alto = altura;
		this.fondo = capacidad;
		this.unidad = medida;
		this.etiqueta = "";
	}

	double getVolumen() {
		double volumen = (this.ancho * this.alto * this.fondo / 1000);
		System.out.println("Volumen de la caja: " + volumen + " " + this.unidad + "\n");
		return volumen;
	}
	
	void setEtiqueta(String etiqueta) {
		etiqueta = this.etiqueta;
	}

	@Override
	public String toString() {
		return "Caja [ancho = " + ancho + ", alto = " + alto + ", fondo = " + fondo + ", etiqueta = " + etiqueta + ", unidad = "
				+ unidad + "]" + "\n";
	}
}