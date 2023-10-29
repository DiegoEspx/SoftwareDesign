package Polimorfismo;

public class Remolque {

	private int peso;

	public Remolque(int peso) {
		super();
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Remolque: peso=" + peso;
	}
	public int getPesoDelRemolque() {
        return peso;
    }
	
	

}
