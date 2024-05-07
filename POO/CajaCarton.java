package POO;

public class CajaCarton extends Caja {
	
	CajaCarton(int anchura, int altura, int fondo) {
		super(anchura, altura, fondo, Unidad.CM);
	}
	
	double volumenCaja() {
		
		double volumenReal;
		volumenReal = (super.getVolumen() * 0.8);
        return volumenReal;		 
	}
	
	double superficieTotal() {
		
		double superficie;
		superficie = (super.getAncho() + super.getFondo() + super.getFondo() + super.getAlto() + super.getAlto() + super.getAncho() * 2); 
		return superficie;
	}
}
