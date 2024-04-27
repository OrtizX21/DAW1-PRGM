package POO;

public class Main_Gestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta_Corriente C1, C2, C3;

		Gestor_Cuenta G1 = new Gestor_Cuenta("Jose Luis", "+34 546 78 96 12");
		Gestor_Cuenta G2 = new Gestor_Cuenta("Maria Jose", "+34 546 78 96 12");

		C1 = new Cuenta_Corriente("AC234367", "Marco Asensio", G1);

		C2 = new Cuenta_Corriente("AZ234367", "Julian Dominguez", G2);

		C3 = new Cuenta_Corriente("AR234367", "Laura Ochoa");


		C1.informacionG();

		System.out.println();

		C2.informacionG();
		
		System.out.println();

		C3.informacionG();
		
		System.out.println();
		
		C1.setGestor(G2);
		
		System.out.println();

		C1.informacionG();

	}

}