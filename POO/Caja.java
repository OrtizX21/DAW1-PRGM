package POO;

public class Caja {

	private int ancho;
	private int alto;
	private int fondo;
	private String etiqueta;
	private Unidad unidad;
	
	Caja(int anchura, int altura, int fondo, Unidad medida){
		this.ancho = anchura;
		this.alto = altura;
		this.fondo = fondo;
		this.unidad = medida;
		this.etiqueta = "";
	}
	
	int getAncho() {
		return this.ancho;
	}
	
	int getAlto() {
		return this.alto;
	}
	
	int getFondo() {
		return this.fondo;
	}

	@SuppressWarnings("static-access")
	double calcularVolumen() {
		
		double volumenCubico = 0.0;
		
		if(this.unidad == this.unidad.CM) {
			volumenCubico = (this.ancho * this.alto * this.fondo / 1000);
		}
			else if (this.unidad == this.unidad.M) {
				volumenCubico = (this.ancho * this.alto * this.fondo);
			}
			return volumenCubico;
	}
	
	double getVolumen() {
		return this.calcularVolumen();
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
