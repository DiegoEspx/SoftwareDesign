package Polimorfismo;

public class Cliente {
    private String nombreCliente;
    private String direccionCliente;
    private String telefonoCliente;

    // Constructor
    public Cliente(String nombreCliente, String direccionCliente, String telefonoCliente) {
    	
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
    }

	public String getNombre() {
		return nombreCliente;
	}

	public void setNombre(String nombre) {
		this.nombreCliente = nombre;
	}

	public String getDireccion() {
		return direccionCliente;
	}

	public void setDireccion(String direccion) {
		this.direccionCliente = direccion;
	}

	public String getTelefono() {
		return telefonoCliente;
	}

	public void setTelefono(String telefono) {
		this.telefonoCliente = telefono;
	}

    
}