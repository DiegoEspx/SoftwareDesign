package Polimorfismo;

public class Coche extends Vehiculo {

	private int puerta ;
	
	public Coche (int puerta,String matricula, double velocidad  ) {
		super(matricula, velocidad );
		this.puerta=puerta;
		
	}

	public int getPuerta() {
		return puerta;
	}

	public void setPuerta(int puerta) {
		this.puerta = puerta;
	}

	public void numPuertas() {
		System.out.println("el numero de puertas del carro es: "+this.getPuerta());
	}
	@Override
	public String toString() {
		return "Coche= puerta: " + puerta + ", matricula: "+ matricula + ", velocidad: "+ velocidad;
	}
	
	
	
	
}
