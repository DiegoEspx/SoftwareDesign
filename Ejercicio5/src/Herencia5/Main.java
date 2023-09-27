package Herencia5;
import java.util.Scanner;

public class Main {
	private static Scanner teclado;
	public static void main(String[]args) {
		teclado = new Scanner(System.in);
		
		Libro libro = new Libro(); 

		System.out.println("Ingrese nombre del libro: ");
		libro.setTitulo(teclado.next());

		System.out.println("Ingrese el precio del libro: ");
		libro.setPrecio(teclado.nextInt());

		System.out.println("Ingrese el número de páginas del libro: ");
		libro.setNumPaginas(teclado.nextInt());

		System.out.println("Ingrese el año de publicación del libro: ");
		libro.setAñoPublicacion(teclado.nextInt());

		
		System.out.println(libro.toString());
		
		Disco disco= new Disco();
		//String titulo, int precio, double duracion
		System.out.println("__________________________________________");
		System.out.println("Ingrese nombre del Disco: ");
		disco.setTitulo(teclado.next());

		System.out.println("Ingrese el precio del Disco: ");
		disco.setPrecio(teclado.nextInt());

		System.out.println("Ingrese la duracion del Disco: ");
		disco.setDuracion(teclado.nextDouble());
		
		System.out.println(disco.toString());
		
		teclado.close();
	}
	

}
