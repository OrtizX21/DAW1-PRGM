package POO;

public class Persona {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		class persona {
			
			int edad;
			double estatura;
			String apellido;
			
			//static String pelo;
			// CON EL STATIC ES UN VALOR PRIVADO QUE SE COMPARTE PARA TODOS LOS OBJETOS
			
			public void saludar() {
				// TODO Auto-generated method stub
				
				System.out.println("Hola mi apellido es: " + apellido);
				System.out.println("Encantado");
			}
			
			public void birthday (int cumpleaños) {
				
				cumpleaños = cumpleaños + edad;
				System.out.println("Ahora tengo estos años: " + cumpleaños);
			}
			
			public void crecer (double incremento) {
				
				estatura = estatura + incremento;
				System.out.println("Mi estatura ha aumentado: " + estatura);
			}
			
		}
		
		persona Felipe = new persona();
		
		Felipe.edad = 18;
		Felipe.estatura = 1.69;
		Felipe.apellido = "Ortiz";
		
		System.out.println(Felipe.edad);
		System.out.println(Felipe.estatura);
		System.out.println(Felipe.apellido);
		
		Felipe.saludar();
		Felipe.birthday(2);
		Felipe.crecer(0.05);
		

		
	}

}