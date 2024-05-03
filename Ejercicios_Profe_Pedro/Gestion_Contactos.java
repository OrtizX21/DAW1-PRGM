package Ejercicios_Profe_Pedro;
import java.util.*;

public class Gestion_Contactos {

	private Contacto[] _contactos, contacto1;
	private int _numContactos;
	private int _maxContactos;
	
	Gestion_Contactos(int longitud){
		this._contactos = new Contacto [longitud];
		this._maxContactos = longitud;
		this._numContactos = 0;
	}
	
	Contacto [] agregarContacto(Contacto agregar) {
		
		boolean agregado = false;
		if(this._contactos.length >= 0) {
			agregado = true;
			this._contactos = Arrays.copyOf(this._contactos, this._contactos.length + 1);
			this._contactos[_numContactos] = agregar;
			this._numContactos++;
			System.out.println("El contacto ha sido agregado al telefono? " + agregado + "\n");
		}
		else if (this._contactos.length < 0) {
			System.out.println("Espacio insuficiente? " + agregado + "\n");
		}
		return this.contacto1;
	}
	
	int eliminarContacto(int indice) {
		
		for(int i = indice + 1; i < this._contactos.length - 1; i++) {
			this._contactos[i - 1] = this._contactos[i];
		}
		this._contactos = Arrays.copyOf(this._contactos, this._contactos.length - 1);
		this._numContactos--;
		return indice;
	}
	
	String buscarContactoPorNombre(String name) {
		
		boolean encontrado = false;
		
		
		
		
		
		return name;
	}
	
	@Override
	public String toString() {
		return "Gestion_Contactos [_contactos = " + Arrays.toString(_contactos) + ", contacto1 = "
				+ Arrays.toString(contacto1) + ", _numContactos = " + _numContactos + ", _maxContactos = " + _maxContactos
				+ "]";
	}
	
	
}
