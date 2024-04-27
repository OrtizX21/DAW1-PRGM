package Examen1;

public class Funciones_Resta {

	static int Resta(int Num1, int Num2) {

		
		int Operacion = Num1 - Num2;
		
		System.out.println("El Resultado Es: " + Operacion);

		return Operacion;
	}

	static double Resta(double Num1, double Num2) {

		
		double calculo = Num1 - Num2;
		
		System.out.println("Funcion Sobrecarga Double: " + calculo);

		return calculo;
	}

	static long Resta(long Num1, long Num2) {

		
		long Resultado = Num1 - Num2;
		
		System.out.println("Funcion Sobrecarga Long: " + Resultado);

		return Resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Resta(55, 44);


		/////////////////////////////////////////////////////////////

		
		
		Resta(11.01, 9.70);


		/////////////////////////////////////////////////////////////

		
		
		Resta(11000000, 7000000);


	}

}