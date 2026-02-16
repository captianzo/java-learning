class Animal{
	void display(){
		System.out.println("Animal has 4 legs");
	}
}

class Dog extends Animal{
	void display(){
		super.display();
		System.out.println("Dog also barks");
	}
}

class Cat extends Animal{
	void display(){
		System.out.println("Cat also meows");
	}
}

class Car{
	void display(){
		System.out.println("This is a car");
	}
	void model(){
		System.out.println("Car model is new");
	}
}

class Door extends Car{
	void display(){
		System.out.println("I am a door of a car");
	}
	void model(){
		System.out.println("The model of this door is top notch");
	}
}

class Wheels extends Car{
	void display(){
		System.out.println("I am the wheels of a car");
	}
	void model(){
		System.out.println("The model of this wheels is the newest version released by the brand");
	}
}

public class OverridingAnimals {
	public static void main(String[] args) {
		Animal d = new Dog();
		Animal m = new Cat();
		d.display();
		m.display();

		Car c = new Car();
		Car dor = new Door();
		Car wheel = new Wheels();
		c.display();
		c.model();
		dor.display();
		dor.model();
		wheel.display();
		wheel.model();
	}
}