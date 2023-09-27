package Herencia2;

public class Staff extends Person{
	private String school;
	private double pay;
	
	//constructor
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	
	//getters and setters
	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public double getPay() {
		return pay;
	}


	public void setPay(double pay) {
		this.pay = pay;
	}


	public void printStaff() {
		System.out.println("SCHOOL: "+ school);
		System.out.println("PAY: "+ pay);
	}

	@Override
	public String toString() {
		return "Staff [school=" + school + ", pay=" + pay + "]";
	}
	
	
	
}
