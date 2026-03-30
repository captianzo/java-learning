// An interface is a blueprint of a class that contains abstarct methods
// using interface keyword
// supports multiple inheritance
// classes implement interfaces using the implements command

interface Animal{
	void sound(); // abstract method
}

class Dog implements Animal{
	public void sound(){
		System.out.println("Dog Barks.");
	}
}
class Cat implements Animal{
	public void sound(){
		System.out.println("Cat Meows.");
	}
}

public class Interfaces {
	public static void main(String[] args) {
		Animal a = new Dog();
		Animal c = new Cat();
		a.sound();
		c.sound();
	}
}
