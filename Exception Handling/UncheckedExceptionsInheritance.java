// Unchecked exceptions are sublcasses of RuntimeException
// They are not part of the method signature, so the overriding method can throw any unchecked exception

class Parent{
	void display(){
		System.out.println("Parent display");
	}
}

class Child extends Parent{
	@Override
	void display(){
		throw new java.lang.NullPointerException("Unchecked exception allowed");
	}
}

public class UncheckedExceptionsInheritance {
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Child();
		c.display();
		p.display();
	}
}
