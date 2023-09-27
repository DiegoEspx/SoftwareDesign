package Ejemplo2;

public class Employee {
	private  int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	
	//constructor
	public Employee() {
		
	}
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	//getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	//metodos
	
	public String getName() {
		return this.firstName+" "+this.lastName;
	}
	
	public int getAnnualSalary() {
		return salary*12;
	}
	public int getRaiseSalary(int percent) {
		
		double increaseAmount = (percent /100.0)* this.salary; 
		
		this.salary +=increaseAmount;
		
		return this.salary;
		}
	public void printEmployee(){
		System.out.println("ID: "+this.id);
		System.out.println("Firstname: "+this.firstName);
		System.out.println("Last name: "+this.lastName);
		System.out.println("Salary: "+this.salary);
		System.out.println("su salario anual es de: "+this.getAnnualSalary());
		System.out.println("el incremento de su salario en un 20% seria de: "+this.getRaiseSalary(20));
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
	
	
	
	
}
