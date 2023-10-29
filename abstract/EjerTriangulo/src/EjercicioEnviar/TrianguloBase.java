package EjercicioEnviar;

public abstract class TrianguloBase {
	
    private int lado;
    private int hipotenusa;
    
    public TrianguloBase(int lado, int hipotenusa) {
        
        this.lado = lado;
        this.hipotenusa = hipotenusa;
    }

    //Getters and Setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(int hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    public abstract int perimetro(); 
    public void areaHipotenusa() {
    	
        double area = (0.5 * lado * hipotenusa);
        System.out.println("Área del triángulo con hipotenusa: " + area);
    }
}
