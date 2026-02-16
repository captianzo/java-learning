// Abstract methods are declared without and implementation (no body)
// declared using abstract keyword
// subclasses are required to provide implementation for all abstract methods
// They are desgined to define a blueprint for subclasses

abstract class Animal{
	abstract void sound();

	void eat(){
		System.out.println("This animal eats food");
	}
}

class Dog extends Animal{
	void sound(){
		System.out.println("Dog Barks");
	}
	void sleep(){
		System.out.println("Dog Sleeps");
	}
}

public class AbstractMethod {
	public static void main(String[] args) {
		Animal animal = new Dog();
		// when defining object of abstract class pointing to child class ex- Animal animal = new Dog(); 
		// we can only access methods of the parent class and if they are overriden in the child class, then the overriden version will be called
		// but if we try to call a method specific to the child class in this case, then we will get error
		animal.sound();
		animal.eat();
		// animal.sleep();
	}
}
