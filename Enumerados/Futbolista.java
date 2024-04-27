package Enumerados;

public class Futbolista {

	private String Nombre;
	private int dorsal;
	private Posiciones Posicion;
	private Equipos Club;

	public Futbolista() {
	}

	public Futbolista(String nombre, int dorsal, Posiciones Rol, Equipos Equipo) {
		this.Nombre = nombre;
		this.dorsal = dorsal;
		this.Posicion = Rol;
		this.Club = Equipo;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Posiciones getPosicion() {
		return Posicion;
	}

	public void setPosicion(Posiciones posicion) {
		Posicion = posicion;
	}

	public Equipos getEquipo() {
		return Club;
	}

	public void setEquipo(Equipos equipo) {
		Club = equipo;
	}

	@Override
	public String toString() {
		return this.Club.getNombreClub() + " - " + this.Nombre + " - " + this.getDorsal() + " - " + this.getPosicion();
	}

	public enum Posiciones {
		DELANTERO, MEDIOCENTRO, DEFENSA, PORTERO
	}

	Posiciones Delantero = Posiciones.DELANTERO;
	Posiciones Mediocentro = Posiciones.MEDIOCENTRO;
	Posiciones Defensa = Posiciones.DEFENSA;
	Posiciones Portero = Posiciones.PORTERO;

	public enum Equipos {

		BARCA("Fc Barcelona", 20, 5), REAL_MADRID("Fc Real Madrid", 1, 13), SEVILLA("Sevilla Fc", 5, 0),
		MALAGA("Malaga Fc", 2, 9);

		String NombreClub;
		int PosicionClub;
		int ChampionsLeague;

		private Equipos(String Nombre, int Posicion, int CopasEuropa) {

			this.NombreClub = Nombre;
			this.PosicionClub = Posicion;
			this.ChampionsLeague = CopasEuropa;
		}

		public String getNombreClub() {

			return this.NombreClub;
		}

		public int getPosicionClub() {

			return this.PosicionClub;
		}

		public int getChampionsLeague() {

			return this.ChampionsLeague;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Equipos Real_Madrid = Equipos.REAL_MADRID;

		System.out.println();
		System.out.println("Nombre Del Equipo: " + Real_Madrid.getNombreClub());
		System.out.println("Posición En Liga Española Del Equipo: " + Real_Madrid.getPosicionClub());
		System.out.println("Champions League Que Posee El Equipo: " + Real_Madrid.getChampionsLeague() + "\n");

		Futbolista Rodrygo = new Futbolista("Rodrygo Goes", 21, Posiciones.DELANTERO, Equipos.REAL_MADRID);
		Futbolista Bellingham = new Futbolista("Jude Bellingham", 5, Posiciones.MEDIOCENTRO, Equipos.REAL_MADRID);
		Futbolista Carvajal = new Futbolista("Daniel Carvajal", 2, Posiciones.DEFENSA, Equipos.REAL_MADRID);
		Futbolista Lunin = new Futbolista("Andriy Lunin", 13, Posiciones.PORTERO, Equipos.REAL_MADRID);

		System.out.println(Rodrygo.toString());
		System.out.println(Bellingham.toString());
		System.out.println(Carvajal.toString());
		System.out.println(Lunin.toString());

	}

}
