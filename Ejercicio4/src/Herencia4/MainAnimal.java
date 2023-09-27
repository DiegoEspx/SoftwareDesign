package Herencia4;

public class MainAnimal {
	public static void main(String[]args) {
		Animal animal = new Animal("perro");
        Mammal mammal = new Mammal("gato");
        
        Cat cat = new Cat("Michi");
        Dog dog = new Dog("Firulais");

        
        
        System.out.println(animal.toString());
        System.out.println(mammal.toString());
        System.out.println(cat);
        cat.greets();
        System.out.println(dog);
        dog.greets();
	}
}
