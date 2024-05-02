package Clases_Abstractas;

import Clases_Abstractas.Instrumento.notaMusical;

public class Main_Campana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CREAMOS LAS NOTAS MUSICALES DE LA CAMPANA.
		notaMusical musicaCampana [] = {notaMusical.FA, notaMusical.MI, notaMusical.FA, notaMusical.SOL, notaMusical.MI, notaMusical.DO};
		
		// CREAMOS EL OBJETO CAMPANA QUE HEREDA LOS METODOS DE INSTRUMENTO.
		Campana campana1 = new Campana ();
		
		// MIENTRAS QUE EL CONTADOR SEA MENOR A LA LONGITUD DE LA TABLA USAREMOS EL METODO ADD DE INSTRUMENTO PARA INSERTAR LAS NOTAS MUSICALES.
		for (int j = 0; j < musicaCampana.length; j++) {
			campana1.add(musicaCampana[j]);
		}
		
		// MOSTRAMOS COMO SE TOCA LA CAMPANA.
		campana1.interpretar();
	}

}
