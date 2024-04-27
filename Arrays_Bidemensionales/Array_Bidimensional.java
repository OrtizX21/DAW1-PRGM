package Arrays_Bidemensionales;
import java.util.Arrays;

public class Array_Bidimensional {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[][] matriz = new int[5][4];

		for (int n = 0; n < matriz.length; n++) {

			System.out.println();

			for (int m = 0; m < matriz[0].length; m++) {

				matriz[n][m] = (10 * n + m);

				System.out.print(matriz[n][m] + "\t");
			}

			System.out.print("\n");

		}

		
		System.out.println();
		System.out.println();

		System.out.print(Arrays.deepToString(matriz));

		
		for (int fila[] : matriz) {

			for (int columna : fila) {

				System.out.println(columna + " ");

			}
		}

	}

}