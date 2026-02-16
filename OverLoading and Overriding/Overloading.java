class Calculator{
	int add(int a, int b){
		return a+b;
	}
	int add(int a, int b, int c){
		return a+b+c;
	}
	double add(double a, double b){
		return a+b;
	}
	int sub(int a, int b){
		return a-b;
	}
	double sub(double a, double b){
		return a-b;
	}
	int mul(int a, int b){
		return a*b;
	}
	double mul(double a, double b){
		return a*b;
	}
	int div(int a, int b){
		return a/b;
	}
	double div(double a, double b){
		return a/b;
	}
}

public class Overloading {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Sum");
		System.out.println(calc.add(5,6));
		System.out.println(calc.add(5,6, 7));
		System.out.println(calc.add(5421.124,6421.4124));

		System.out.println("Subtraction");
		System.out.println(calc.sub(6,5));
		System.out.println(calc.sub(6421.124,5421.4124));
		
		
		System.out.println("Multiplication");
		System.out.println(calc.mul(5,6));
		System.out.println(calc.mul(5421.124,6421.4124));
		
		System.out.println("Division");
		System.out.println(calc.div(5,6));
		System.out.println(calc.div(5421.124,6421.4124));
	}
}