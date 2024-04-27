package POO;


//CON EL PUBLIC SE PUEDEN VER ATRIBUTOS Y METODOS DESDE CUALQUIER CLASE
	// (CARPETA O PAQUETE).
	
	// CON EL PRIVATE SOLO SE PUEDEN VER METODOS Y ATRIBUTOS DENTRO DESDE ESE MISMA
	// RUTA O CARPETA.
	// Y SIN NINGUNO DE ELLOS SE VEN SOLO DENTRO DE ESE MISMO PAQUETE.


public class Cuenta_Corriente {

	String Dni; // DNI TITULAR.

	public String NombreD; // NOMBRE TITULAR.

	public String NombreP; // NOMBRE PERSONA.

	private double Saldo; // SALDO INCIAL DE LA CUENTA.

	static String Banco = "BBVA"; // BANCO PREDETERMINADO NOMBRE DEL BANCO DEL TITULAR Y PERSONA.

	static private String BancoNuevo; // METODO PARA CAMBIARLE EL NOMBRE AL BANCO PREDETERMINADO.

	Gestor_Cuenta gestor;
	
	
	public Cuenta_Corriente() { // ASIGNACION VALORES CONSTRUCTOR.

		Dni = "";
		NombreD = "";
		Saldo = 0;
		Banco = "";

	}
		
	
	Cuenta_Corriente(String Dni, String Nombre, Gestor_Cuenta gestor) { // CONSTRUCTOR PADRE (CUENTA BANCARIA CON GESTOR).

		this.Dni = Dni;
		this.NombreD = Nombre;
		this.gestor = gestor;
	}
	
	Cuenta_Corriente(String Dni, String Nombre, double Saldo) { // CONSTRUCTOR SOBRECARGADO (UTILIZADO PARA MAIN CUENTA CORRIENTE).

		this.Dni = Dni;
		this.NombreD = Nombre;
		this.Saldo = Saldo;
	}
	
	Cuenta_Corriente(String Dni, String Nombre) { // CONSTRUCTOR SOBRECARGADO (UTILIZADO PARA CUENTA CORRIENTE CON GESTOR (MAIN_GESTOR)).

		this.Dni = Dni;
		this.NombreD = Nombre;
	}
	
	public void setGestor(Gestor_Cuenta Asigna) {

		this.gestor = Asigna;

	}
	
	void informacionG () {
		
		if (gestor == null) {
			
			System.out.println("Cuenta Sin Gestor");
			
			System.out.println("Nombre Del Titular De La Cuenta: " + NombreD);
			 
			System.out.println("Dni Del Titular: " + Dni);
						
		}
		
		else {
			
			System.out.println("Nombre Del Titular De La Cuenta: " + NombreD);
			 
			System.out.println("Dni Del Titular: " + Dni);
			
			System.out.println("Informacion Del Gestor: ");
			
			gestor.DatosG();
			
			System.out.println();
		
	
		}
	}
	
	// METODO PARA INGRESAR DINERO.

	public double Ingresar (double Cantidad) {
		
		Saldo = Saldo + Cantidad;
		
		return Saldo;
	}
	
	// METODO PARA RETIRAR DINERO.
	
	boolean Retirar (double Cantidad) {
		
		boolean Operacion = false;
		
		if (Saldo >= Cantidad) {
			
			Saldo = Saldo - Cantidad;
			
			Operacion = true;
		}
		
		else {
			
			System.out.println("Lo Sentimos No Se Puede Realizar La Operación Saldo Insifuciente.");
		}
		
		return Operacion;
	}

	// METODO PARA DARLE VALOR A EL BANCO.

	public void setBanco(String Banco) {

		BancoNuevo = Banco;
	}

	// METODO PARA RECIBIR EL VALOR DE BANCO.

	public String getBanco() {

		System.out.println("Cambio De Banco Ahora Perteneces: " + BancoNuevo + ".");

		return Banco;

	}
	
	// 	METODO PARA OBTENER EL SALDO.
	
	public double getSaldo() {
		
		System.out.println("El Saldo De Tu Cuenta Es: " + Saldo + " €");
		
		return Saldo;
	}
	
	
	public void Datos() {// FUNCION PARA VER LOS VALORES ASIGNADOS EN LA OTRA CLASE (CONSTRUCTOR
		// SOBRECARGADO).

		System.out.println("Nombre: " + NombreD + ".");

		System.out.println("Dni: " + Dni + ".");

		System.out.println("Saldo Incial De La Cuenta: " + Saldo + " €" + " .");

		System.out.println("Nombre Del Banco Predeterminado: " + Banco + ".");

	}
	
}