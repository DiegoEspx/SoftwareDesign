package Polimorfismo;

public class Coche {
	private String matricula;
	private String marcaCoche;
	private String modelo;
	public Coche(String matricula, String marcaCoche, String modelo) {
		super();
		this.matricula = matricula;
		this.marcaCoche = marcaCoche;
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarcaCoche() {
		return marcaCoche;
	}
	public void setMarcaCoche(String marcaCoche) {
		this.marcaCoche = marcaCoche;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
