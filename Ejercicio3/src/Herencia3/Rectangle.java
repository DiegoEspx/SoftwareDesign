package Herencia3;

public class Rectangle extends Shape{
	
	private double width;
	private double length;
	
	public Rectangle() {
		width=1.0;
		length=1.0;	
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		double area=this.width*this.length;
		return area;
	}
	public double getPerimeter() {
		double perimetro=2*(this.width+this.length);
		return perimetro;
	}

	@Override
	public String toString() {
		return "Rectangle["+super.toString()+", width=" + width + ", length=" + length + "]";
	}
	
	

}
