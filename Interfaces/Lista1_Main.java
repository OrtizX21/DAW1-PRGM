package Interfaces;
import java.util.*;

public class Lista1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. CREAMOS LAS LISTAS CON LAS QUE VAMOS A UTILIZAR LOS METODOS.
		Lista1 l1 = new Lista1();
		Lista1 l2 = new Lista1();
		Lista1 l3 = new Lista1();
		Lista1 l4 = new Lista1();
		Lista1 l5 = new Lista1();

		
		l1.insertarPrincipio(11);
		l1.insertarFinal(55);
		l1.insertarFinal(55);
		System.out.println("Mostrando la lista: " + l1 + "\n");
		
		
		l2.insertarFinal(77);
		l2.insertarFinal(47);
		l1.insertarDeseado(1, 22);
		l1.insertarfinalLista(l2);
		l1.eliminar(1);
		System.out.println("Otra insertada Lista: " + l1 + "\n");
		
		System.out.println("Posicion donde se encuentra el valor: " + l1.buscar(11) + "\n");
		
		// 2. MOSTRAMOS LA LISTA CONCATEDANA.
		Lista1.contatena(l1, l2);
		
		
		// 3. CREAMOS DOS LISTAS IGUALES PARA COMPROBAR SIN SON IGUALES.
		l3.insertarPrincipio(99);
		l3.insertarFinal(0);
		l3.insertarFinal(9);
		
		l4.insertarPrincipio(99);
		l4.insertarFinal(0);
		l4.insertarFinal(9);
		
		boolean comprobar = l3.equals(l4);
		System.out.println("Las listas son iguales: " + comprobar + "\n");

		
		// 5. CREAMOS EL SCANNER PARA EMPEZAR A ENCOLAR LA LISTA CON LA INTERFAZ Y EL METODO QUE TENEMOS CREADO EN LISTA1.
		Scanner datos = new Scanner(System.in);
		System.out.println("Introduzca los numeros para agregarlos a la cola: " + "\n");
		Integer numeros = datos.nextInt();
		
		while(numeros >= 0) {
			l5.encolar(numeros);
			numeros = datos.nextInt();
		}
		datos.close();
		System.out.println("Encolando la lista: " + l5 + "\n");
		
		
		// 6. DESENCOLAMOS TODOS LOS VALORES DE LA LISTA1 QUE ES IMPRIMR TODOS LOS VALORES QUE LE INSTRODUCIMOS A ESTA.
		Integer vaciar = l5.desencolar();
		
		while(vaciar != null) {
			
			System.out.print(" " + vaciar);
			vaciar = l5.desencolar();
		}	
	}
}