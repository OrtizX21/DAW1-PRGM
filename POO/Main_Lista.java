package POO;

public class Main_Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista Lista1, Lista2, Lista3;
		Lista1 = new Lista();
		Lista2 = new Lista();
		Lista3 = new Lista();

		//INSERTANDO AL PRINCIPIO.
		Lista1.InsertarPrincipio(Integer.valueOf(99));
		Lista1.Mostrar();
		System.out.println();
		
		//INSERTANDO AL FINAL.
		Lista1.InsertarFinal(Integer.valueOf(77));
		Lista1.Mostrar();
		System.out.println();
		
		//INSERTANDO EN LA POSICION DESEADA.
		Lista1.InsertarDeseado(0, 10);
		Lista1.InsertarDeseado(1, 55);
		Lista1.Mostrar();
		System.out.println();
		
		//BUSCANDO UN NUMERO QUE NO ESTA EN LA TABLA.
		Lista1.Buscar(Integer.valueOf(99));
		System.out.println();
		
		//BUSCANDO UN NUMERO QUE ESTA EN LA TABLA
		Lista1.Buscar(Integer.valueOf(10));
		
		//BORRAR UN ELEMENTO DE LA TABLA PASANDO LA POSICION COMO PARAMETRO.
		Lista1.InsertarPrincipio(Integer.valueOf(7));
		Lista1.Eliminar(Integer.valueOf(1));
		System.out.println();
		Lista1.Mostrar();
		System.out.println();
		
		//MOSTRANDO LA CANTIDAD DE ELEMENTOS DE LA TABLA.
		Lista1.numeroElementos();
		System.out.println();
		
		//MOSTRAR EL INDICE DEL VALOR EXISTENTE QUE BUSCAMOS.
		Lista1.getIndice(1);
		System.out.println();
		
		//MOSTRAR EL INDICE DEL VALOR QUE NO EXISTE.
		Lista1.getIndice(18);
		System.out.println();
		
		//INSERTANDO UNA LISTA EN OTRA.
		Lista1.InsertarFinalLista(Lista2);
		Lista1.InsertarFinal(Integer.valueOf(11));		
		Lista1.InsertarFinal(Integer.valueOf(13));
		System.out.println();
		
		//METODO LISTA CONCATENADA LISTA2.
		Lista.concatena(Lista1, Lista2);
		
		//METODO TO STRING PARA MOSTRAR LAS LISTAS.
		System.out.println(Lista1);
		
		// CREO LA LISTA A COMPARAR.
		Lista3.InsertarPrincipio(55);
		Lista3.InsertarFinal(55);
		Lista3.InsertarFinal(11);
		Lista3.InsertarFinal(13);
		//Lista3.InsertarFinal(13);
		System.out.println(Lista3);
		
		//METODO PARA COMPARAR SI DOS LISTAS SON IGUALES.
		boolean resultado = Lista.iguales(Lista1, Lista3); System.out.println("Las listas son iguales? " + resultado);
	}
}
