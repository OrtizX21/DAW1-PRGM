package Ejercicios_Profe_Pedro;

import Ejercicios_Profe_Pedro.Persona.sexo;

public class Main_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona ("", 0, sexo.MASCULINO);
		
		p1.setNombre("Laura Maria");
		p1.setEdad(21);
		p1.setSexo(sexo.FEMENINO);
		p1.cumplirAños();
		p1.informacion();
		System.out.println();
		
		System.out.println("Obteniendo Nombre: " + p1.getNombre());
		System.out.println("Obteniendo Edad: " + p1.getEdad());
		System.out.println("Obteniendo Sexo: " + p1.getSexo());

	}

}
