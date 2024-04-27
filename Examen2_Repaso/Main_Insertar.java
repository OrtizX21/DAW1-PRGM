package Examen2_Repaso;

public class Main_Insertar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Insertar Insertar1;
		
		int Tabla2 [] = {90, 91, 92, 93, 94, 95 ,96};
		
		Insertar1 = new Insertar(Tabla2);
		
		//Insertar1.Posicion1(11);
		//Insertar1.Posicion2(7);
		//Insertar1.Posicion3(99);
		Insertar1.Posicion4(14);
		//Insertar1.Posicion5(5);
		//Insertar1.Posicion6(4);
		//Insertar1.Posicion7(16);
		System.out.println(Insertar1.Valores());
	}
}