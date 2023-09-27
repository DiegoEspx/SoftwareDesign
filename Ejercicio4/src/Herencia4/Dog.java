package Herencia4;

public class Dog extends Mammal {
	public Dog(String name) {
        super(name);
    }
	public void greets() {
		System.out.println("Woof");
	}
	
    @Override
    public String toString() {
        return "Dog [" + super.toString() + "]";
    }

}
