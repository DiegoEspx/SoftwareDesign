package Herencia3;

public class Circle extends Shape{

private double radius;
	
	//constructor
	public Circle() {
		
		radius=1.0;
	}
	
	public Circle(double radius) {	
		this.radius=radius;
	}
	


	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
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
	public double getPerimeter() {
		
		double circunferencia= 2 * Math.PI * this.radius;
		return circunferencia;
	}
	
	@Override
	public String toString() {
		return "Circle["+super.toString()+", radius=" + radius + "]";
	}
	
	

}
