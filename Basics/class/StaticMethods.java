class Calculator{
	static int add(int a, int b){
		return a + b;
	}
}

public class StaticMethods {
	public static void main(String[] args) {
		System.out.print("Sum: " + Calculator.add(5,10));
	}
}
