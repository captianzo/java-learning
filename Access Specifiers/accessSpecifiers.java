class Parent{
	public int i = 5;
	int j = 5;
	protected int k = 5;
	private int l = 5;
}

class Child extends Parent{
	void testAccess(){
		System.out.println("Public: " + i);
		System.out.println("Default: " + j);
		System.out.println("Protected: " + k);
		// System.out.println("Private: " + l);
	}
}

public class accessSpecifiers {
	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println("Public: " + c.i);
		System.out.println("Default: " + c.j);
		System.out.println("Protected: " + c.k);
		// System.out.println("Private: " + c.l);
	}
}
