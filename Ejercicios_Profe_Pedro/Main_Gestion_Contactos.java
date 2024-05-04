package Ejercicios_Profe_Pedro;

public class Main_Gestion_Contactos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CREANDO EL CONTACTO Y AÑADIENDO LOS CONTACTOS.
		Gestion_Contactos contacto1 = new Gestion_Contactos(4);
		
		Contacto novia = new Contacto("Milena", "Sanchez", "115180", "Milenita@sa11");
		Contacto bro1 = new Contacto("Úrbez", "Modrego", "1995180", "Sirmodrego@s77");
		Contacto bro2 = new Contacto("Jose", "Rojas", "148180", "SirOreje@s777");
		
		contacto1.agregarContacto(novia);
		contacto1.agregarContacto(bro1);
		contacto1.agregarContacto(bro2);
		System.out.println(contacto1 + "\n");
		
		//ELIMINANDO CONTACTO.
		contacto1.eliminarContacto(0);
		System.out.println("Despues de eliminar un contacto: " + contacto1 + "\n");
		
		//ACTUALIZANDO CONTACTO Y BUSCANDO POR NOMBRE Y APELLIDO
		contacto1.actualizarContacto(novia, 0);
		contacto1.buscarContactoPorNombre("Jose");
		contacto1.buscarContactoPorApellido("Sanchez");
	}	
}
