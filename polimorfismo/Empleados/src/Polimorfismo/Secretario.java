package Polimorfismo;

public class Secretario extends Empleado{

	private String numFax;

	public Secretario(String nombre, String Iapellido, String IIapellido, String dni, String puestoEmpresa,
			String direccion, int añosExp, String numTelefono, int salario, String numFax) {
		super(nombre, Iapellido, IIapellido, dni, puestoEmpresa, direccion, añosExp, numTelefono, salario, null);
		this.numFax = numFax;
	}

	
	public void incrementarSalario() {
        double incremento=0.05;
        double nuevoSalario=(this.getSalario()*incremento)+this.getSalario();
        System.out.println("su incremento de salario anual es: "+nuevoSalario);
    }

	@Override
	public String toString() {
		return "Secretario [numFax=" + numFax + ", getAñosExp()=" + getAñosExp() + ", getNumTelefono()="
				+ getNumTelefono() + ", getSalario()=" + getSalario() + ", getNombre()=" + getNombre()
				+ ", getIapellido()=" + getIapellido() + ", getIIapellido()=" + getIIapellido() + ", getDni()="
				+ getDni() + ", getPuestoEmpresa()=" + getPuestoEmpresa() + ", getDireccion()=" + getDireccion() + "]";
	}
	
	
	
}
