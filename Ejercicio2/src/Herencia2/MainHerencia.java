package Herencia2;

public class MainHerencia {
	public static void main(String[]args) {
		//name, address, program, year, fee
		Student studentOne=new Student("Sebastian", "Lorenzo carr3", "Ing.Software",2023,4000000);
		
		System.out.println("Firs Student Information: ");
		studentOne.printPerson();
		studentOne.printStudent();
		
		System.out.println("----------------------");
		
		//String name, String address, String school, double pay
		Staff staffOne=new Staff("Diego","Marquetalia carr2", "Liceo Jose Felix Jimenez",1321233);
		System.out.println("Firs Staff Information: ");
		staffOne.printPerson();
		staffOne.printStaff();
		
	
	
	}
}
