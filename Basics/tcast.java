public class tcast {
	public static void main(String[] args) {
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double [BINDING CASTING]

		System.out.println(myInt);
		System.out.println(myDouble);
		
		double newDouble = 10.01;
		int newInt = (int)newDouble; // manual casting: double to int [NARROWING CASTING]
		System.out.println(newInt);
		System.out.println(newDouble);		
	}
}
