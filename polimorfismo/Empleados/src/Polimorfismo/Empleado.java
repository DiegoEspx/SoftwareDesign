package Polimorfismo;

public class Empleado {

	private String nombre;
	private String Iapellido;
	private String IIapellido;
	private String dni;
	private String puestoEmpresa;
	private String direccion;
	private int añosExp;
	private String numTelefono;
	private int salario;
	private Empleado supervisor;
	
	public Empleado(String nombre, String Iapellido, String IIapellido, String dni, String puestoEmpresa, String direccion, int añosExp,
			String numTelefono, int salario, Empleado supervisor) {
		super();
		this.nombre = nombre;
		this.Iapellido = Iapellido;
		this.IIapellido = IIapellido;
		this.dni = dni;
		this.puestoEmpresa=puestoEmpresa;
		this.direccion = direccion;
		this.añosExp = añosExp;
		this.numTelefono = numTelefono;
		this.salario = salario;
		this.supervisor = supervisor;
	}


	public int getAñosExp() {
		return añosExp;
	}


	public void setAñosExp(int añosExp) {
		this.añosExp = añosExp;
	}


	public String getNumTelefono() {
		return numTelefono;
	}


	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	public Empleado getSupervisor() {
		return supervisor;
	}


	public void setSupervisor(Empleado supervisor) {
		this.supervisor = supervisor;
	}
	
	
	public void cambiarSupervisor(Empleado nuevoSupervisor) {
        this.supervisor = nuevoSupervisor;
        System.out.println("nuevo supervisor: nombre= "+supervisor.getNombre()+", primer apellido= "+supervisor.getIapellido()
        + ", segundo apellido: "+ supervisor.getIIapellido());
    }
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIapellido() {
		return Iapellido;
	}


	public void setIapellido(String iapellido) {
		Iapellido = iapellido;
	}


	public String getIIapellido() {
		return IIapellido;
	}


	public void setIIapellido(String iIapellido) {
		IIapellido = iIapellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getPuestoEmpresa() {
		return puestoEmpresa;
	}


	public void setPuestoEmpresa(String puestoEmpresa) {
		this.puestoEmpresa = puestoEmpresa;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public void incrementarSalario(double cantidad) {
        if (cantidad > 0) {
            salario += cantidad;
            System.out.println("El salario de " + nombre + " ha sido incrementado en " + cantidad);
            
        } else {
            System.out.println("La cantidad de incremento debe ser mayor que cero.");
        }
    }


	@Override
	public String toString() {
		return "Empleado: nombre=" + nombre + ", Iapellido=" + Iapellido + ", IIapellido=" + IIapellido + ", dni=" + dni
				+ ", puestoEmpresa=" + puestoEmpresa + ", direccion=" + direccion + ", añosExp=" + añosExp
				+ ", numTelefono=" + numTelefono + ", salario=" + salario + ", supervisor=" + supervisor;
	}

}
