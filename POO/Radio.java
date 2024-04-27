package POO;

public class Radio {

	private double Frecuencia;
	
	Radio () {
		
		this.Frecuencia = 80.0;
	}
	
	public void Up () {
		
		this.Frecuencia += 0.5;
		
		if (Frecuencia >= 108.1) {
			
			this.Frecuencia = 80;
		}
	}
	
	public void Down () {
			
		this.Frecuencia -= 0.5;
		
		if (Frecuencia <= 79.9) {
			
			this.Frecuencia = 108.0;
		}
	}
	
	public String Display () {
		
		if (this.Frecuencia < 80.0) {
			
			this.Frecuencia = 108.0;
			return "Frecuencia Del Radio : " + Frecuencia + " MHz";
		}
		
		if (this.Frecuencia > 108.0) {
			
			this.Frecuencia = 80.0;
			return "Frecuencia Del Radio: " + Frecuencia + " MHz";
		}
		
		else {
			
			return "Frecuencia Del Radio: " + Frecuencia + " MHz";
		}
	}
}