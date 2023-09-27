
package Ejemplo1;

import java.util.Scanner;

public class MainCircle {
	private static Scanner teclado;
	public static void main(String[]args) {
		teclado = new Scanner(System.in);
		
		Circle circleone=new Circle();
		
		System.out.println("-----------------------------");
		System.out.println("Circulo 1:");
		System.out.println("ingrese el radio");
		circleone.setRadius(teclado.nextDouble());
		circleone.printCircle();
		System.out.println("-----------------------------");
		
	}
	
	
	
	
}
