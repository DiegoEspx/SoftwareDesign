package Polimorfismo;

public class MainSimulador {
	public static void main(String[] args) {
		
		Coche coche=new Coche(4,"XDF6", 0);
		System.out.println(coche.toString());
		coche.numPuertas();
		coche.setPuerta(7);
		coche.numPuertas();
		
		System.out.println("_____________________________________________");
		Camion camion=new Camion("XDFRW",10);
		Remolque remolque=new Remolque(22);
		camion.ponRemolque(remolque);
		System.out.println(camion.toString());		
		camion.acelerar(11212);
		
		System.out.println("_____________________________________________");
		camion.quitaRemolque();
		camion.acelerar(20000);
		System.out.println(camion.toString());
				
	}

}
