package Herencia5;

public class DenominadaPublicacion {
	private String titulo;
	private int precio;
	
	
	public DenominadaPublicacion() {
		super();
		
	}
	public DenominadaPublicacion(String titulo, int precio) {
		super();
		this.titulo = titulo;
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "DenominadaPublicacion titulo=" + titulo + ", precio=" + precio;
	}
	
	
}
