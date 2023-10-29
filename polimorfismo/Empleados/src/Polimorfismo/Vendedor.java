package Polimorfismo;
import java.util.ArrayList;
import java.util.List;
public class Vendedor extends Empleado{
	
		private Coche coche;
	    private String areaDeVenta;
	    private List<Cliente> listaClientes;
	    private double porcentajeComisiones;

	    // Constructor
	    public Vendedor(String nombre, String Iapellido, String IIapellido, String dni, String puestoEmpresa,
				String direccion, int añosExp, String numTelefono, int salario,String areaDeVenta,double porcentajeComisiones
				, Coche coche) {
			super(nombre, Iapellido, IIapellido, dni, puestoEmpresa, direccion, añosExp, numTelefono, salario,null);
			
			this.areaDeVenta = areaDeVenta;
			this.porcentajeComisiones = porcentajeComisiones;
			this.coche = coche;
			this.listaClientes=new ArrayList<>();
		}
	    
	    public void agregarCliente(Cliente cliente) {
	        listaClientes.add(cliente);
	    }

		public void darDeBajaCliente(Cliente cliente) {
	        listaClientes.remove(cliente);
	    }
		
		
		public String getAreaDeVenta() {
			return areaDeVenta;
		}

		public void setAreaDeVenta(String areaDeVenta) {
			this.areaDeVenta = areaDeVenta;
		}

		public List<Cliente> getListaClientes() {
			return listaClientes;
		}

		public void setListaClientes(List<Cliente> listaClientes) {
			this.listaClientes = listaClientes;
		}

		public double getPorcentajeComisiones() {
			return porcentajeComisiones;
		}

		public void setPorcentajeComisiones(double porcentajeComisiones) {
			this.porcentajeComisiones = porcentajeComisiones;
		}
		
		public void cambiarCoche(Coche nuevoCoche) {
	        this.coche = nuevoCoche;
	    }
		
		public void incrementarSalario() {
	        double incremento=0.1;
	        double nuevoSalario=(this.getSalario()*incremento)+this.getSalario();
	        System.out.println("su incremento de salario anual es: "+nuevoSalario);
	    }

		public Coche mostrarCoche() {
			System.out.println("Coche: matricula=" + coche.getMatricula() + ", marcaCoche=" + coche.getMarcaCoche()
			+ ", modelo=" + coche.getModelo());
			return coche;
		}
		
		public void mostrarClientes() {
		    System.out.println("Lista de Clientes del Vendedor:");
		    for (Cliente cliente : listaClientes) {
		        System.out.println("Nombre: " + cliente.getNombre() + ", Dirección: " + cliente.getDireccion()
		                + ", Teléfono: " + cliente.getTelefono());
		    }
		}
		
		@Override
		public String toString() {
			return "Vendedor: "+ "areaDeVenta=" + areaDeVenta + ", porcentajeComisiones="
					+ porcentajeComisiones + ", Años Exp=" + getAñosExp() + ", Num Telefono()=" + getNumTelefono()
					+ ", Salario()=" + getSalario() + ", Nombre()=" + getNombre() + ", Iapellido()="
					+ getIapellido() + ", IIapellido()=" + getIIapellido() + ", Dni()=" + getDni()
					+ ", PuestoEmpresa()=" + getPuestoEmpresa() + ", Direccion()=" + getDireccion() + "]";
		}

		
		
}
