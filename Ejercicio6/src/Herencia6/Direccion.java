package Herencia6;

public class Direccion extends Nombre {
	private String calle;
	private String ciudad;
	private String provincia;
	private int codigoPostal;
	
	public Direccion() {
		super();
	}

	public Direccion(String nombre, String primerApellido, String segundoApellido, String calle, String ciudad,
			String provincia, int codigoPostal) {
		super(nombre, primerApellido, segundoApellido);
		this.calle = calle;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public void nuevaDireccion(String calle, String ciudad, String provincia, int codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }

    
    public void nuevoNombre(String nombre, String primerApellido, String segundoApellido) {
        setNombre(nombre);
        setPrimerApellido(primerApellido);
        setSegundoApellido(segundoApellido);
    }
	
	@Override
	public String toString() {
		return "Nombre: "+getNombre()+", Primer Apellido: "+getPrimerApellido()+", Segundo Apellido: "+getSegundoApellido()+
				" --- Direccion: calle=" + calle + ", ciudad=" + ciudad + ", provincia=" + provincia + ", codigoPostal="
				+ codigoPostal;
	}
	
	
	
	
}
