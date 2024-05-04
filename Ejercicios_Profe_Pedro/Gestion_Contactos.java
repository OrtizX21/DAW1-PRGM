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
		if(this._numContactos < this._maxContactos) {
			agregado = true;
			this._contactos = Arrays.copyOf(this._contactos, this._contactos.length + 1);
			this._contactos[this._numContactos] = agregar;
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
	
	String buscarContactoPorNombre (String nombre) {
		
		for(int i = 0; i <= this._numContactos - 1;  i++) {
			if(this._contactos[i].getNombre().equals(nombre)) {
				System.out.println("Buscando por nombre: " + this._contactos[i] + " Encontrado en la posicion: " + i + "\n");
			}
			else if (this._numContactos > this._maxContactos) {
				Contacto vacio[] = new Contacto[0];
				System.out.println("No se encontro el apellido: " + Arrays.toString(vacio));
			}
		}
		return nombre;
	}
	
	String buscarContactoPorApellido (String apellido) {
		
		int posicion = 0;
		while(posicion < this._contactos.length && this._contactos.equals(apellido)) {
			posicion++;
		}
		if(posicion <= this._contactos.length) {
			System.out.println("Buscando por apellido: " + this._contactos[posicion] + " Encontrado en la posicion: " + posicion + "\n");
		}
			else {
				Contacto vacio[] = new Contacto[0];
				System.out.println("No se encontro el apellido: " + Arrays.toString(vacio));
			}
		return apellido;
	}

	Contacto [] actualizarContacto(Contacto actualizar, int posicion) {
		this._contactos[posicion] = actualizar;
		System.out.println("Contacto actualizado: " + Arrays.toString(this._contactos) + "\n");
		return this._contactos;
	}
	
	@Override
	public String toString() {
		return "Gestion_Contactos [_contactos = " + Arrays.toString(_contactos) + ", contacto1 = "
				+ Arrays.toString(contacto1) + ", _numContactos = " + _numContactos + ", _maxContactos = " + _maxContactos
				+ "]";
	}	
}
