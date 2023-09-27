package herencia;

public class Main {
	public static void main(String[]args) {
		//id, 
		Empleado empleado1=new Empleado(32,"2312r124", "Diego", "guerrero", "lorenzo",
				"3123125123", 32, "gerente", 3231344);
		
		System.out.println("Empleado 1 information: ");
		
		System.out.println("Nombre: "+ empleado1.getNombre());
		System.out.println("Id: "+empleado1.getId());
		System.out.println("Cargo: "+empleado1.getCargo());
		
	
	
	}
}
