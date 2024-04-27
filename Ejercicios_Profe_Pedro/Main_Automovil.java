package Ejercicios_Profe_Pedro;

import Ejercicios_Profe_Pedro.Automovil.Marca;

public class Main_Automovil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automovil auto1 = new Automovil();
		System.out.println(auto1.mostrarInfo());
		System.out.println();
		
		Automovil auto2 = new Automovil(Marca.HONDA, "Civic", 2023, 0.0);
		auto2.acelerar(150.0);
		System.out.println(auto2.mostrarInfo());
		auto2.frenar(150.0);
		System.out.println();
		
		Automovil auto3 = new Automovil(Marca.CUPRA, "Formentor", 2021, 50.0);
		System.out.println(auto3.mostrarInfo());
		auto3.acelerar(300.0);


	}

}
