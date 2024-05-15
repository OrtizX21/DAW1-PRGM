package ArraysList;

public class Socio {
	
	private int id;
	private String nombre;
	
	public Socio(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Socio [id = " + id + ", nombre = " + nombre + "]" + "\n";
	}
	
	
}
