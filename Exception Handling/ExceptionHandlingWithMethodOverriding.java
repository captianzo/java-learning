class SuperClass{
	void method(){
		System.out.println("SuperClass method executed");
	}
}

// Subclass declaring unchecked exception
class SubClass extends SuperClass{
	@Override
	void method() throws ArithmeticException {
		System.out.println("SubClass method executed");
		throw new ArithmeticException("Exception in SubClass");
	}
}
public class ExceptionHandlingWithMethodOverriding {
	public static void main(String[] args) {
		SuperClass s = new SubClass();
		try {
			s.method();
		} catch (ArithmeticException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}
