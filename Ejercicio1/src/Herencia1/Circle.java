package Herencia1;

public class Circle {
	//atributos
	
	private double radius;
	private String color;
	//constructores
	
	public Circle(){
		this.radius=1.0;
		this.color="red";	
	}
	public Circle(double radius){
		this.radius=radius;
		this.color="red";
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	//getters and setters
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	
	public void printCircle() {
        System.out.println("Radio: " + radius);
        System.out.println("Area: "+ this.getArea());
        System.out.println("Color: " + color);
    }
	
	//metodos
	
	@Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
	
	

}
