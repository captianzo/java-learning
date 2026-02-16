public class dataTypes {
	public static void main(String[] args) {
		// used for numeric values
		int i = 89;

		// use bye and short if memory is a constraint
		byte b = 4;

		// this will give error as number is larger than byte range
		// byte b1 = 7888888888955;

		short s = 56;

		// this will give error as number is larger than short range
		// short s1 = 878787878787;

		// for float use 'f' as suffix as standard
		float f = 4.7676f;

		// need to hold big range of numbers then we need this data type
		long l = 12121;

		// System.out.print("char: " + a);
		System.out.println("integer: " + i);
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("float: " + f);
		System.out.println("long: " + l);
	}
}
