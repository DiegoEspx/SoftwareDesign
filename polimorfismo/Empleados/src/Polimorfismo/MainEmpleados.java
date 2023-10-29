package Polimorfismo;

public class MainEmpleados {

	public static void main(String[]args) {
		//String nombre, String iapellido, String iIapellido, String dni, String puestoEmpresa, String direccion, int añosExp,
		//String numTelefono, int salario, String supervisor
		Empleado supervisor = new Empleado("jose", "enriquez", "valdez","123456789", "Supervisor", "Calle Supervisor"
				, 10, "555-555-5555", 2000, null);
		Empleado empleado= new Empleado("Diego","Guerrero","España","1080691994", "Gerente","carrera 6e", 5,"312726132"
				,1000,supervisor);
		System.out.println(empleado.toString());
		empleado.incrementarSalario(200);
		
		Empleado nuevoSupervisor = new Empleado("nuevo supervisor", "Apellido1", "Apellido2",
		        "987654321", "Nuevo Supervisor", "Nueva Calle", 5, "999-999-9999", 2500, null);

		empleado.cambiarSupervisor(nuevoSupervisor);
		
		

		System.out.println("________________________________________________________________________________________");
		
		Secretario secretario= new Secretario("Diego","Guerrero","España","1080691994", "Gerente","carrera 6e", 5,"312726132"
				,1000,"32132");
		System.out.println(secretario.toString());
		secretario.incrementarSalario();
		
		System.out.println("________________________________________________________________________________________");
		
		/*String nombre, String iapellido, String IIapellido, String dni, String puestoEmpresa,
				String direccion, int añosExp, String numTelefono, int salario, String matricula,
				String marcaCarro, String modelo, String areaDeVenta, List<Cliente> listaClientes,
				double porcentajeComisiones */
		Coche coche1= new Coche("ZRK","MICHUCVICHI","2019");
		Vendedor vendedor= new Vendedor("Diego","JJ","ordoñez","1080691994", "Gerente","carrera 6e", 4, "123", 1000
				, "sucursal 2",0.5,coche1);
		
		System.out.println(vendedor.toString());
		vendedor.incrementarSalario();
		vendedor.mostrarCoche();
		Cliente cliente1 = new Cliente("jose", "acalle 1", "111-111-1111");
        Cliente cliente2 = new Cliente("juan2", "calle 2", "222-222-2222");
        vendedor.agregarCliente(cliente1);
        vendedor.agregarCliente(cliente2);
        
        vendedor.mostrarClientes();
        
        
        System.out.println("___________________________________________________________________________________________");
        
        
        /*String nombre, String Iapellido, String IIapellido, String dni, String puestoEmpresa,
			String direccion, int añosExp, String numTelefono, int salario, String numDespacho,Secretario secretario
			, Coche coche*/
        
        Secretario secretarioJefe=new Secretario("Cristian","Guerrero","España","1080691994", "Gerente","carrera 6e"
        		, 5,"312726132", 500, "33322");
        Coche cocheJefe= new Coche("WWW","Chevrolet","2023");
        JefeZona jefe= new JefeZona("Juan","Espinoza", "España","3123123","sada","carrera 9",2,"32123",2000
        		,"312",secretarioJefe,cocheJefe);
        
        System.out.println(jefe.toString());
        jefe.mostrarCoche();
        jefe.mostrarSecretario();
        
        
		
	}

}
