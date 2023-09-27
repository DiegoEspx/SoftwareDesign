package Herencia3;

public class Main {

	public static void main(String[]args) {
		Circle circulo= new Circle();
		System.out.println(circulo.toString());
		System.out.println("Area: "+ circulo.getArea());
		System.out.println("perimetro: "+circulo.getPerimeter());
		
		System.out.println("_____________________________________________________");
		
		Rectangle rectangulo= new Rectangle();
		System.out.println(rectangulo.toString());
		System.out.println("Area: "+ rectangulo.getArea());
		System.out.println("perimetro: "+rectangulo.getPerimeter());
		
		System.out.println("_____________________________________________________");
		
		Square cuadrado= new Square(5);
		System.out.println(cuadrado.toString());
	
	}

}
