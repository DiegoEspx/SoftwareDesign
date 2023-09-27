package herencia;

public class Empleado extends Persona{
	public int numLegado;
	public String cargo;
	public double sueldo;
	
	public Empleado(int id, String dni, String nombre, String apellido,
			String domicilio, String telefono,
			int numLegado, String cargo, double sueldo) {
		super(id, dni, nombre, apellido, domicilio, telefono);
		this.numLegado = numLegado;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	public int getNumLegado() {
		return numLegado;
	}

	public void setNumLegado(int numLegado) {
		this.numLegado = numLegado;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
}
