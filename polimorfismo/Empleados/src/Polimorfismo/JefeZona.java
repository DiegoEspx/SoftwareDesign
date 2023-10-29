package Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class JefeZona extends Empleado{

	private String numDespacho;
	private Secretario secretario;
	private List<Vendedor> listaVendedor;
	private Coche coche;
	
	public JefeZona(String nombre, String Iapellido, String IIapellido, String dni, String puestoEmpresa,
			String direccion, int añosExp, String numTelefono, int salario, String numDespacho,Secretario secretario
			, Coche coche) {
		super(nombre, Iapellido, IIapellido, dni, null, direccion, añosExp, numTelefono, salario, null);
		this.numDespacho = numDespacho;
		this.secretario = secretario;
		this.coche = coche;
		this.listaVendedor=new ArrayList<>();
		
	}
	public String getNumDespacho() {
		return numDespacho;
	}
	public void setNumDespacho(String numDespacho) {
		this.numDespacho = numDespacho;
	}
	public Secretario getSecretario() {
		return secretario;
	}
	public void setSecretario(Secretario secretario) {
		this.secretario = secretario;
	}
	public List<Vendedor> getListaVendedor() {
		return listaVendedor;
	}
	public void setListaVendedor(List<Vendedor> listaVendedor) {
		this.listaVendedor = listaVendedor;
	}
	public Coche getCoche() {
		return coche;
	}
	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	public void cambiarSecretario(Secretario nuevoSecretario) {
        this.secretario = nuevoSecretario;
    }
	
	public void cambiarCoche(Coche nuevoCoche) {
        this.coche = nuevoCoche;
    }
	
	public void agregarVendedor(Vendedor vendedor) {
        listaVendedor.add(vendedor);
    }

	public void darDeBajaCliente(Vendedor Vendedor) {
        listaVendedor.remove(Vendedor);
    }
	
	public Coche mostrarSecretario() {
		System.out.println("Secretario del jefe: Nombre= " + secretario.getNombre() + ", primer apellido=" 
				+ secretario.getIapellido()+ ", DNI=" + secretario.getDni());
		return coche;
	}
	
	
	public Coche mostrarCoche() {
		System.out.println("Coche: matricula=" + coche.getMatricula() + ", marcaCoche=" + coche.getMarcaCoche()
		+ ", modelo=" + coche.getModelo());
		return coche;
	}
	
	@Override
	public String toString() {
		return "JefeZona: numDespacho=" + numDespacho + ", secretario=" + secretario + ", coche=" + coche 
				+ ", getAñosExp()=" + getAñosExp() + ", getNumTelefono()=" + getNumTelefono() + ", getSalario()="
				+ getSalario() + ", getNombre()=" + getNombre() + ", getIapellido()=" + getIapellido()
				+ ", getIIapellido()=" + getIIapellido() + ", getDni()="+ getDni() + ", getDireccion()=" 
				+ getDireccion();
	}
	
	
	
	
	

}
