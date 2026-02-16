public class simplecalc {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int add = sum(a,b);
		System.out.println(add);
		int diff = sub(a, b);
		System.out.println(diff);
		int prod = mul(a, b);
		System.out.println(prod);
		int divi = div(a, b);
		System.out.println(divi);

	}
	public static int sum(int a, int b){
		return a+b;
	}
	public static int sub(int a, int b){
		return a-b;
	}
	public static int mul(int a, int b){
		return a*b;
	}
	public static int div(int a, int b){
		return a/b;
	}
}
