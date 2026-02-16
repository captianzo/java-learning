abstract class Animal{
	abstract void sound();
}

class Dog extends  Animal{
	public void sound(){
		System.out.println("Dog Barks.");
	}
}

public class Abstract {
	public static void main(String[] args) {
		Animal a;
		a = new Dog();
		a.sound();
	}
}
