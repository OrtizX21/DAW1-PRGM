package POO;

public class Main_Caja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caja caja1 = new Caja (100, 45, 135, Unidad.CM);
		
		System.out.println(caja1);
		caja1.setEtiqueta("Dirección: Delicias, Destinatario: Luis Felipe, Teléfono: +34 611 11 11 11");
		System.out.println(caja1);
		System.out.println("Volumen de la caja de Centimetros: " + caja1.getVolumen() + " Cm3" + "\n");
		
		Caja caja2 = new Caja (100, 45, 135, Unidad.M);
		
		System.out.println();
		System.out.println(caja2);
		caja2.setEtiqueta("Dirección: Actur, Destinatario: Laura Rojas, Teléfono: +34 612 12 12 12");
		System.out.println(caja2);
		System.out.println("Volumen de la caja de Metros: " + caja2.getVolumen() + " Cm3");
	}
}
