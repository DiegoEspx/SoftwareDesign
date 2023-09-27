	package Ejemplo6;

public class MainBook {
	public static void main(String[]args) {
		//String name, double price,int qty, Author author
		Author authorone=new Author("España","sdsa.@gmail.com",'m');
		
		Book bookone=new Book("Diego",55000,2,authorone);
		
		System.out.println("information author:");
		
		System.out.println(bookone.toString());
		System.out.println("--------------------------------------------");
		
	}
}
