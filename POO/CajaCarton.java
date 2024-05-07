package POO;

public class CajaCarton extends Caja {

	CajaCarton(int anchura, int altura, int fondo) {
		super(anchura, altura, fondo, Unidad.CM);
		// TODO Auto-generated constructor stub
	}
	
	double volumenCarton() {
		
		double volumen = (super.getVolumen() / 0.8);
		return volumen;
	}
	
	double superficieCarton() {
		
		double superficie = (2 * (super.getAncho() * super.getFondo() + super.getFondo() * super.getAlto() + super.getAncho() * super.getAlto()));
		return superficie;
	}
}
