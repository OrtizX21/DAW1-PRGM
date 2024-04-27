package Ejercicios_Profe_Pedro;

public class Cuenta_Bancaria {

	/*
	 * 3. *Crear una clase "Cuenta Bancaria"*: - Atributos: titular, saldo. -
	 * Métodos: depositar(), retirar(), consultarSaldo(). - Crea varios objetos de
	 * la clase Cuenta Bancaria y prueba los métodos.
	 */
	
	String titular;
	double saldo;
	
	Cuenta_Bancaria(String name, double dinero) {
		titular = name;
		saldo = dinero;
	}
	Cuenta_Bancaria() {
		titular = "";
		saldo = 0;
	}
	double depositar(double cantidad) {
		saldo += cantidad;
		return saldo;
	}
	double retirar(double importe) {
		if(saldo <= 0) {
			System.out.println("No se puede retirar sin dinero en la cuenta: " + saldo);
			saldo = 0;
		}
		if (saldo == importe) {
			System.out.println("Sacaste toda la pasta");
			saldo = 0;
		}
		else if (saldo > 0 && importe <= saldo) {
			saldo -= importe;
			System.out.println("Se retiro la cantidad de: " + importe);
		}
		return saldo;
	}
	String consultarSaldo() {
		return"Nombre del titular de la cuenta: " + titular + " Saldo actual: " + saldo;
	}
}
