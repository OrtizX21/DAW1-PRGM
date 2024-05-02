package Clases_Abstractas;
import java.util.*;

public abstract class Instrumento {
	
	public enum notaMusical {DO, RE, MI, FA, SOL, LA, SI};
	protected notaMusical[] melodia;
	
	public Instrumento() {
		melodia = new notaMusical [0];
	}
	
	void add(notaMusical nota) {
		melodia = Arrays.copyOf(melodia, melodia.length + 1);
		melodia[melodia.length - 1] = nota;
	}
	
	abstract void interpretar();
}