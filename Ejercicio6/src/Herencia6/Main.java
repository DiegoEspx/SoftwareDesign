package Herencia6;
import java.util.Scanner;
public class Main {
	private static Scanner teclado;
	public static void main(String[]args) {
		teclado = new Scanner(System.in);
		//String nombre, String primerApellido, String segundoApellido, String calle, String ciudad,
		//String provincia, String codigoPostal
		Direccion direccion= new Direccion();
		
		System.out.println("ingrese su nombre: " );
		direccion.setNombre(teclado.nextLine());
		
		System.out.println("ingrese su primer apellido: ");
		direccion.setPrimerApellido(teclado.nextLine());
		
		System.out.println("ingrese su segundo apellido: ");
		direccion.setSegundoApellido(teclado.nextLine());
		
		System.out.println("ingrese el nombre de la calle: ");
		direccion.setCalle(teclado.nextLine());
		
		System.out.println("ingrese la ciudad donde esta: ");
		direccion.setCiudad(teclado.nextLine());
		
		System.out.println("ingrese la provincia: ");
		direccion.setProvincia(teclado.nextLine());
		
		System.out.println("ingrese el codigo postal: ");
		direccion.setCodigoPostal(teclado.nextInt());
		
		
		System.out.println(direccion.toString());
		
		System.out.println("_________________________________________________________________________");
		
		Direccion Newdireccion = new Direccion();

        Newdireccion.nuevaDireccion("334 calle12", "Cali", "edificio", 122245);

        Newdireccion.nuevoNombre("Homero", "España", "Thompson");

        System.out.println(Newdireccion.toString());
		
	}

}
