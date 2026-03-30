import java.io.IOException;

class Parent{
	void readFile () throws IOException{
		System.out.println("Reading file in parent");
	}
}

class Child extends Parent{
	@Override
	void readFile () throws IOException{
		System.out.println("Reading file in child");
	}
}

public class CheckedExceptionInheritance {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		p.readFile();
		c.readFile();
	}
}
