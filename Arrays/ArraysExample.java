public class ArraysExample {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};

		// using normal for loop
		for (int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i]);
		}

		// using enhanced for loop
		for (int num : numbers){
			System.out.println(num);
		}
	}
}

