package Clases_Abstractas;
import java.util.*;

// DEFINIMOS UNA CLASE ABSTRACTA LO CUAL ES UNA CLASE QUE ESTA EN DESARROLLO Y LA VAMOS A UTILIZAR PARA CREAR OBJETOS CON LO QUE 
// HAY DENTRO DE ESTA CLASE Y DESARROLLAREMOS EL METODO INTERPRETAR DEPENDIENDO DE LAS NOTAS DE LOS INSTRUMENTOS (CLASES QUE CREAREMOS Y HEREDAREMOS).
public abstract class Instrumento {
	
	//ARRAY DE TIPO NOTA MUSICAL, EL NOMBRE DE ESTE ES (MELODIA).
	public enum notaMusical {DO, RE, MI, FA, SOL, LA, SI};
	protected notaMusical[] melodia;
	
	public Instrumento() {
		melodia = new notaMusical [0];
	}
	
	void add(notaMusical nota) {
		melodia = Arrays.copyOf(melodia, melodia.length + 1);
		melodia[melodia.length - 1] = nota;
	}
	
	// METOOD ABSTRACTO QUE DESARROLLAREMOS EN CAMPANA Y PIANO PARA SABER COMO SE TOCA LA PARTITURA.
	abstract void interpretar();
}
