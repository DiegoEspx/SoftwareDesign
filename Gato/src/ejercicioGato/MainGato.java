package ejercicioGato;

public class MainGato {

	public MainGato() {
		
	}
	public static void main(String[] args) {
		Gato miGato=new Gato();
		miGato.setName("elmiau");
		miGato.maullar();
		miGato.dormir(5);
		miGato.correr("mi casa");
		miGato.comer("pollo");
		System.out.println("nombre gato: "+ miGato.getName());
	}

}


