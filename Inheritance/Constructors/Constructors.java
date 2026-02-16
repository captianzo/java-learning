class Animal{
    Animal() {
		System.out.println("This is animal");
    }

	void display(){
		System.out.println("This is animal's method");
	}
}

class Dog extends Animal{
	Dog() {
		System.out.println("This is Dog");
    }

	void show(){
		System.out.println("This is dog's method");
	}
}

public class Constructors{
	public static void main(String[] args) {
		// Dog d = new Dog();
		new Dog();
		// d.display();
		// d.show();
	}
}