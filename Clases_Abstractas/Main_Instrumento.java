package Clases_Abstractas;
import Clases_Abstractas.Instrumento.notaMusical;

public class Main_Instrumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CREAMOS LAS NOTAS MUSICALES DEL PIANO.
		notaMusical musica[] = {notaMusical.DO, notaMusical.FA, notaMusical.RE, notaMusical.SOL};
		
		// CREAMOS EL OBJETO PIANO QUE HEREDA LOS METODOS DE INSTRUMENTO.
		Piano piano1 = new Piano();
		
		// MIENTRAS QUE EL CONTADOR SEA MENOR A LA LONGITUD DE LA TABLA USAREMOS EL METODO ADD DE INSTRUMENTO PARA INSERTAR LAS NOTAS MUSICALES.
		for(int i = 0; i < musica.length; i++) {
			piano1.add(musica[i]);
		}
		
		// MOSTRAMOS COMO SE TOCA EL PIANO.
		piano1.interpretar();
	}

}
