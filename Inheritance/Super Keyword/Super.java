class Grandparent{

    public Grandparent() {
		System.out.println("The original parent of this family");
    }
	
	void display(){
		System.out.println("I am dadaji");
	}
}

class Parent{
    public Parent() {
		super();
		System.out.println("I am parent");
    }

	void display(){
		System.out.println("Parent class method");
	}
	void laugh(){
		System.out.println("Laughing hahaha");
	}
	void cry(){
		System.out.println("Crying sobsobsob");
	}
}

class Child extends Parent{
	void display(){
		super.display();
		super.laugh();
		super.cry();
		// super.super.display();
		System.out.println("Child class method");
	}
}

// super keyword used to access parent class methods and variables, also can be used to access and invoke parent class
public class Super {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();

	}
}
