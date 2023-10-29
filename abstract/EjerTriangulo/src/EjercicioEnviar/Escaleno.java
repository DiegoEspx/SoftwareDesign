package EjercicioEnviar;

public class Escaleno extends TrianguloBase {

    public Escaleno(int lado, int hipotenusa) {
        super(lado, hipotenusa);
    }

    @Override
    public int perimetro() {
        int perimetro = getLado() + getLado() + getHipotenusa();
        return perimetro;
    }

    public void areaHipotenusa() {
        double area = (0.5 * getLado() * getHipotenusa());
        System.out.println("Area del triangulo escaleno con hipotenusa: " + area);
    }
}
