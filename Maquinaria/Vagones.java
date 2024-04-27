package Maquinaria;

	class Vagones {

	Integer Identificador;
	Double CargaActual;
	Double CargaMaxima;
	String TipoMercancia;
	
	Vagones (Integer Id, Double Actual, Double Maximo, String Tipo) {
		
		this.Identificador = Id;
		this.CargaActual = Actual;
		this.CargaMaxima = Maximo;
		this.TipoMercancia = Tipo;
	}
}