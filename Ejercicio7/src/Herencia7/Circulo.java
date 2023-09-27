package Herencia7;

public class Circulo {
	//atributos
	private double radius;
	//constructor
	public Circulo(double radius) {
		this.radius = radius;
		
	}
	//getters and setters
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	
	public double getCircunferencia() {
		double circunferencia= 2* Math.PI*this.radius;
		return circunferencia;
		
	}
	//metodos
	@Override
    public String toString() {
        return "Circulo: Radio=" + getRadius() +  ", Area: "+ getArea()+", Circunferencia: "+ getCircunferencia();
    }

	
	

}
