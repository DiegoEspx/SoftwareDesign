package Ejemplo2;
import java.util.Scanner;


public class MainEmployee {
	private static Scanner teclado;
	public static void main(String[]args) {
		//int id, String firstName, String lastName, int salary
		
		//Employee employeeone=new Employee(820,"Diego","España",3000000);
		
		teclado = new Scanner(System.in);
		
		
		Employee employeeone=new Employee();
		
		System.out.println("_______________________________");
		
		System.out.println("por favor ingrese la id: ");
		employeeone.setId(teclado.nextInt());

		System.out.println("por favor ingrese el primer nombre:  ");
		employeeone.setFirstName(teclado.next());
		
		System.out.println("por favor ingrese el primer apellido: ");
		employeeone.setLastName(teclado.next());
		
		System.out.println("por favor ingrese el salario: ");
		employeeone.setSalary(teclado.nextInt());
		
		employeeone.printEmployee();
		
		System.out.println("_______________________________");
		
	}
	
}

