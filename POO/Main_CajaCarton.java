package POO;

public class Main_CajaCarton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CajaCarton cajaCarton1 = new CajaCarton(30, 30, 80);
		
		System.out.println("Volumen de la caja: " + cajaCarton1.volumenCaja() + " Cm3" + "\n");
		System.out.println("Superficie total de la caja de carton: " + cajaCarton1.superficieTotal() + " Cm3" + "\n");
	}

}
