package POO;

public class Caja {

	private int ancho;
	private int alto;
	private int fondo;
	private String etiqueta;
	private Unidad unidad;
	
	Caja(int anchura, int altura, int capacidad, Unidad medida){
		this.ancho = anchura;
		this.alto = altura;
		this.fondo = capacidad;
		this.unidad = medida;
		this.etiqueta = "";
	}

	@SuppressWarnings("static-access")
	double getVolumen() {
		
		double volumenCubico = 0.0;
		
		if(this.unidad == this.unidad.CM) {
			volumenCubico = (this.ancho * this.alto * this.fondo / 1000000);
		}
			else if (this.unidad == this.unidad.M) {
				volumenCubico = (this.ancho * this.alto * this.fondo);
			}
			return volumenCubico;
	}
	
	void setEtiqueta(String etiqueta) {
		
		if(etiqueta.length() <= 50) {
			this.etiqueta = etiqueta;
		}
			else {
				this.etiqueta = etiqueta.substring(0, 50);
			}
	}

	@Override
	public String toString() {
		return "Caja [ancho = " + ancho + ", alto = " + alto + ", fondo = " + fondo + ", etiqueta = " + etiqueta + ", unidad = "
				+ unidad + "]" + "\n";
	}
}
