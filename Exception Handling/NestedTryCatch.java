public class NestedTryCatch {
	public static void main(String[] args) {
		try {
			// Outer try block
			System.out.println("Outer try block started");

			try {
				// Inner try block
				System.out.println("Inner try block started");
				int result = 10 / 0; // ArithmeticException error
			} catch (ArithmeticException e) {
				// catch block for inner try
				System.out.println("Caught ArithmeticException in inner try block: " + e.getMessage());
			}

			String str = null;
			System.out.println(str.length()); // causes NullPointerException
		} catch (NullPointerExcep e) {
			// catch block for outer try
			System.out.println("Caught NullPointerException in outer try block: " + e.getMessage());
		} finally {
			// Finally block
		}
		System.out.println("Program continues afger nested try-catch blocks");
	}
}
