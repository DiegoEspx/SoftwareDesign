package Herencia7;

public class CilindroHueco extends Cilindro{
	private double radioExterior;
	private double radioInterior;
	public CilindroHueco(double height, double radioExterior, double radioInterior) {
		super(height, height);
		this.radioExterior = radioExterior;
		this.radioInterior = radioInterior;
	}
	public double getRadioExterior() {
		return radioExterior;
	}
	public void setRadioExterior(double radioExterior) {
		this.radioExterior = radioExterior;
	}
	public double getRadioInterior() {
		return radioInterior;
	}
	public void setRadioInterior(double radioInterior) {
		this.radioInterior = radioInterior;
	}
	
	public double getLongitud() {
		double longitud=2*Math.PI*((Math.pow(this.radioExterior,2))-(Math.pow(radioInterior, 2)))+2
				*Math.PI*this.radioExterior*getHeight()+2*Math.PI*getHeight()*this.radioInterior;
		return longitud;
	}
	public double getVolume() {
		double volumenHueco=Math.PI*((Math.pow(this.radioExterior,2))-(Math.pow(radioInterior, 2)))
				* this.getHeight();
		return volumenHueco;
	}
	
	public double getArea() {
		double areaHueca=2*Math.PI*this.getHeight()*(this.radioExterior+this.radioInterior)
				+2*Math.PI*((Math.pow(this.radioExterior,2))-(Math.pow(radioInterior, 2)));
		return areaHueca;
	}
	@Override
	public String toString() {
		return "CilindroHueco: radioExterior=" + this.radioExterior + ", radioInterior=" 
				+ this.radioInterior + ", altura: "+this.getHeight()+ ", Longitud: "
				+ this.getLongitud()+", Volumen: "+this.getVolume()+ ", Area: "+this.getArea();
	}
	
	
	

}
