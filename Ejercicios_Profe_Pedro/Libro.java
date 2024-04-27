package Ejercicios_Profe_Pedro;

public class Libro {

	/*
	 * 2. *Crear una clase "Libro"*: - Atributos: título, autor, páginas. - Métodos:
	 * mostrarInfo(), aumentarPáginas(). - Crea varios objetos de la clase Libro y
	 * prueba los métodos.
	 */

	String nombreLibro;
	String nombreAutor;
	int paginas;
	
	Libro(){
		nombreLibro = "";
		nombreAutor = "";
		paginas = 0;
	}
	Libro(String name, String author, int pages) {
		this.nombreLibro = name;
		this.nombreAutor = author;
		this.paginas = pages;
	}
	int aumentarPaginas(int cantidad) {
		paginas += cantidad;
		return paginas;
	}
	void mostrarInfo() {
		System.out.println("Nombre del libro: " + nombreLibro + " , " + "Nombre del autor: " + nombreAutor +  " ," + " Cantidad de paginas: " + paginas);
	}
}