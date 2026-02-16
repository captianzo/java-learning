// abstract classes can have both normal and abstract methods
abstract class Shape{
	abstract void draw();

	void message(){
		System.out.println("This is a shape");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("Drawing a circle");
	}

	// void message(){
	// 	System.out.println("This is a circle");
	// }
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("Drawing a rectangle");
	}
}

// Its used to define classes or methods that are incomplete and must be implemented by a subclass
// An abstract class can't be instantiated
// An abstract method has no body and must be implemented in a sublcass
public class AbstractClass {
	public static void main(String[] args) {
		// Circle c = new Circle();
		// c.draw();
		// c.message();
		Shape s = new Circle();
		s.draw();
		s.message();
	}
}
