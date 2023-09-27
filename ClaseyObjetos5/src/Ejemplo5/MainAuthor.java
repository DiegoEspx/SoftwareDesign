package Ejemplo5;

public class MainAuthor {
	public static void main (String[]args) {
		//String name, String email, char gender
		Author authorone=new Author("Diego", "d.alejo@gmail.com",'m');
		
		 // Imprimir la información del autor
		System.out.println("information author one: ");		
        System.out.println(authorone.toString());
	}
}
