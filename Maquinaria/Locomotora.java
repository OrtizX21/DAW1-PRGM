package Maquinaria;
import java.util.Date;
import Personal.Mecanicos;

	class Locomotora {

	String Matricula;
	Double Potencia;
	Date AnioFabricacion;
	Mecanicos Mecanico1;
	
	Locomotora (String Id, Double Pot, Date Antiguedad, Mecanicos Fernando) {
		
		this.Matricula = Id;
		this.Potencia = Pot;
		this.AnioFabricacion = Antiguedad;
		this.Mecanico1 = Fernando;
	}
}