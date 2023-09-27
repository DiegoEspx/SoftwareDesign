package Ejemplo4;

public class MainAccount {
	public static void main (String[]args) {
		//(String id, String name, int balance) 
		Account accountOne = new Account("0010", "Cuenta Diego", 1000);
        Account accountTwo = new Account("0020", "Cuenta Cristian", 200);

        accountOne.credit(100);
        accountTwo.credit(100);

        accountOne.debit(100);
        accountTwo.debit(100);
        
        
        //la cuenta 1 le pasa 100 a la cuenta 2
        accountOne.transferTo(accountTwo, 100);

        System.out.println(accountOne);
        System.out.println(accountTwo);
	}
	
}
