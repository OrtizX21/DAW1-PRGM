package POO;

public class Main_Caja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caja armenia = new Caja (100, 45, 135, Unidad.CENTIMETROS);
		armenia.setEtiqueta("MADE IN ARMENIA");
		System.out.println(armenia);
		armenia.getVolumen();
	}
}