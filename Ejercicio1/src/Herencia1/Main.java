package Herencia1;

public class Main {
	public static void main(String[]args) {
		Circle circle1=new Circle();
		System.out.println("Circulo 1: ");
		circle1.printCircle();
		
		System.out.println("________________________________");
		//double radius, double height,String color
		Cylinder cylinder1=new Cylinder(2.3,2.1,"red");
		System.out.println("cilindro 1: ");
		System.out.println("radio: " + cylinder1.getRadius());
		System.out.println("color: " + cylinder1.getColor());
		cylinder1.printCylinder();
		System.out.println("Volumen: " + cylinder1.getVolume());
		
		
		
	}
	
	
	
}
