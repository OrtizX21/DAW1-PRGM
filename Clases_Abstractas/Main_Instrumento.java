package Clases_Abstractas;

import Clases_Abstractas.Instrumento.notaMusical;

public class Main_Instrumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		notaMusical musica[] = {notaMusical.DO, notaMusical.FA, notaMusical.RE, notaMusical.SOL};
		
		Piano piano1 = new Piano();
		
		for(int i = 0; i < musica.length; i++) {
			piano1.add(musica[i]);
		}
		
		piano1.interpretar();
	}

}
