package Ejercicios_Profe_Pedro;

public class Main_Cuenta_Bancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta_Bancaria cuenta1 = new Cuenta_Bancaria();
		cuenta1.titular = "Pedro el profe";
		cuenta1.saldo = 100000;
		cuenta1.depositar(15000);
		System.out.println(cuenta1.consultarSaldo());
		cuenta1.retirar(115000);
		System.out.println(cuenta1.consultarSaldo());
		System.out.println();
		
		Cuenta_Bancaria cuenta2 = new Cuenta_Bancaria("Daniela alvarez", 100000);
		cuenta2.retirar(9999);
		System.out.println(cuenta2.consultarSaldo());
	}
}