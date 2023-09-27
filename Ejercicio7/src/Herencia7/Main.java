package Herencia7;

public class Main {

	public static void main(String[]args) {
		Circulo circulo= new Circulo(4);
		System.out.println(circulo.toString());
		
		Cilindro cilindro = new Cilindro(4,6);
		System.out.println(cilindro.toString());
		
		CilindroHueco hueco= new CilindroHueco(5,8,3);
		System.out.println(hueco.toString());
	}

}
