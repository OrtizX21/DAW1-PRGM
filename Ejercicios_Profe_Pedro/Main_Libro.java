package Ejercicios_Profe_Pedro;

public class Main_Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro();
		
		libro1.nombreLibro = "Cien Años De Soledad";
		libro1.nombreAutor = "Gabriel Garcia Márquez";
		libro1.paginas = 375;
		libro1.aumentarPaginas(15);
		libro1.mostrarInfo();
		System.out.println();
		
		Libro libro2 = new Libro("Meditaciones De Marco Aurelio", "James Rodriguez", 10);
		libro2.nombreAutor = "Marco Aurelio";
		libro2.paginas = 371;
		libro2.aumentarPaginas(15);
		libro2.mostrarInfo();
	}

}
