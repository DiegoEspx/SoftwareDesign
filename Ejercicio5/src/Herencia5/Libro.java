package Herencia5;

public class Libro extends DenominadaPublicacion{

	private int numPaginas;
	private int añoPublicacion;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	public Libro(String titulo, int precio, int numPaginas, int añoPublicacion) {
		super(titulo, precio);
		this.numPaginas = numPaginas;
		this.añoPublicacion = añoPublicacion;
		
	}
	
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	 @Override
	    public String toString() {
	        // Incluye título y precio en la representación de cadena
	        return "Libro: Título=" + getTitulo() + ", Precio=" + getPrecio() + 
	               ", Número de Páginas=" + this.getNumPaginas() + ", Año de Publicación=" + this.getAñoPublicacion();
	    }
	

}
