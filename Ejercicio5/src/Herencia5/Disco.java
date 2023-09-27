package Herencia5;

public class Disco extends DenominadaPublicacion{
	private double duracion;
	
	public Disco() {
		super();
	}
	
	public Disco(String titulo, int precio, double duracion) {
		super(titulo, precio);
		this.duracion = duracion;
	}
	
	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Disco: Titulo="+getTitulo()+", Precio= "+getPrecio()+", Duracion=" + duracion;
		
	}
	
}
