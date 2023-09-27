package Ejemplo1;

public class Circle {
	private double radius;
	
	//constructor
	public Circle(){
		radius=1.0;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	//getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//methods
	public double getArea() {
		double areacalculada=Math.PI * this.radius* this.radius;
		return areacalculada;
	}
	public double getCircumference() {
		
		double circunferencia= 2 * Math.PI * this.radius;
		return circunferencia;
	}
	
	
	public void printCircle() {
		System.out.println("El Radio es: "+ this.radius);
		System.out.println("el area es: "+ this.getArea());
		System.out.println("la circunferencia es: "+ this.getCircumference());
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
