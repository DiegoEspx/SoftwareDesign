package Polimorfismo;

public class Vehiculo {
	protected String matricula;
	protected double velocidad;
	
	
	public Vehiculo() {
		velocidad=0.0;
	}
	
	public Vehiculo(String matricula, double velocidad ) {
		this.matricula= matricula;
		this.velocidad=velocidad;
			
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getVelocidad() {
		return velocidad;	
	}


	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}


	@Override
	public String toString() {
		return "Vehiculo: matricula=" + matricula + ", velocidad=" + velocidad;
	}
	
	public void  acelerar (double velocidad ){
		this.velocidad=velocidad;
		System.out.println("Estoy acelerando rum rum fium");
	}
	
}