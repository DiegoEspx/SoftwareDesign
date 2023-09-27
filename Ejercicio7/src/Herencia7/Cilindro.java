package Herencia7;

public class Cilindro extends Circulo{

		//atributos
		private double height;

		//constructor
		
		public Cilindro(double radius, double height) {
			super(radius);
			this.height=height;
		}
		
		//getters and setters

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}
		
		public double getArea() {
			double areaCilindro=2*Math.PI*this.getRadius()*this.height+2*Math.PI*(this.getRadius()*this.getRadius());
			return areaCilindro;
		}
		public double getVolume() {
	        double volumen=Math.PI*(this.getRadius()*this.getRadius())*this.height;
	        return volumen;
	    }
		
		
		//metodos
		@Override
	    public String toString() {
	        return "Cilindro: Radio=" + getRadius() + ", Altura=" + this.height +", Area: "+getArea() + 
	        		", Volumen: "+ getVolume();
	    }
}
