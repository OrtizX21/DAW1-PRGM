package POO;

/*Escribir un programa que lea por teclado una hora cualquiera y un número n que representa una cantidad en segundos.
  El programa mostrará la hora introducida y las n siguientes, que se diferencian en un segundo. Para ello hemos de diseñar 
  previamente la clase Hora que dispone de los atributos hora, minuto, segundo. Los valores de los atributos se controlarán mediante métodos set/get.
*/

public class Hora {

	private int Hor;

	private int Min;

	private int Seg;

	
	public void Segundos () {

		Seg++;
		
		if (Seg == 59) {
			
			Seg = 0;
			Min ++;
		}
		
		if (Min == 59 && Seg == 59) {
			
			Hor ++;
			Min = 00;
			Seg = 00;
		}


		if (Hor == 24) {

			Hor = 0;
		}
	}

	void setHor(int Hor) {

		if (0 <= Hor && Hor <= 23) {
		this.Hor = (byte) Hor;
		
		}
		
		else {
			
			this.Hor = 0;
		}
	}

	public int getHor() {

		return Hor;
	}

	void setMin(int Min) {

		if (0 <= Min && Min <= 59) {
		this.Min = (byte) Min;
		}
		
		else {
			
			this.Min = 0;
		}

	}

	public int getMin() {

		return Min;
	}

	void setSeg(int Seg) {

		if (0 <= Seg && Seg <= 59) {
		this.Seg = (byte) Seg;
		}
		
		else {
			
			this.Seg = 0;
		}
	}

	public int getSeg() {

		return Seg;
	}
}