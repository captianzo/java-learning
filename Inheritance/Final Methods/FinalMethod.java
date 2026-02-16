final class FinalGrandparent{
	final void display(){
		System.out.println("I am a grandparent haha");
	}
}

class Parent{
	final void display(){
		System.out.println("Final Method in parent class");
	}
}

class Child extends Parent{
	// void display (){
	// 	System.out.println("hello");
	// }
}

public class FinalMethod {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}
}
