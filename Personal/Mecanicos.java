package Personal;

public class Mecanicos {

	String Nombre;
	String Telefono;
	enum Especialidad {FRENOS,HIDRAULICA,MOTOR,ELECTRICIDAD};
	Especialidad Especial;
	
	Mecanicos (String Name, String Tel, Especialidad Esp) {
		
		this.Nombre = Name;
		this.Telefono = Tel;
		this.Especial = Esp;
	}
}