package EjercicioEnviar;

public class Acutangulo extends TrianguloBase {

    public Acutangulo(int lado, int hipotenusa) {
        super(lado, hipotenusa);
    }

    @Override
    public int perimetro() {
        int perimetro = getLado() + getLado() + getHipotenusa();
        return perimetro;
    }

    public void reaHipotenusa() {
        double area = (0.5 * getLado() * getHipotenusa());
        System.out.println("Area del triangulo acutangulo con hipotenusa: " + area);
    }
}
