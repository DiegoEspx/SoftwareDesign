package EjercicioEnviar;

public class Main {
    public static void main(String[] args) {
    	//int lado, int hipotenusa
        Escaleno Escaleno = new Escaleno(5, 22);
        
        System.out.println("Perimetro del triangulo escaleno: " + Escaleno.perimetro());
        
        Escaleno.areaHipotenusa();
        
        Acutangulo Acutangulo = new Acutangulo(5, 22);
        
        
        System.out.println("Perimetro del triangulo acutangulo: " + Acutangulo.perimetro());
        
        Acutangulo.areaHipotenusa();
    }
}
