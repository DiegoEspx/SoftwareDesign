package Polimorfismo;


public class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula,double velocidad) {
        super(matricula, velocidad);
        this.remolque = null; 
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(double cantidad) {
        if (remolque != null && velocidad + cantidad > 100) {
            System.out.println("Baja la velocidad, muy rapido!!");
        } else {
            super.acelerar(cantidad);
            System.out.println("su velocidad es: "+this.getVelocidad());
        }
    }

    @Override
    public String toString() {
        if (remolque != null) {
            return "Camion - " + super.toString() + ", " + remolque.toString();
        } else {
            return "Camion - " + super.toString() + ", Sin remolque";
        }
    }
}