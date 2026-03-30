public class ChainedExceptions {
	public static void main(String[] args) {
		try {
			int [] n = new int[5];
			int divisor = 0;

			for (int i = 0; i < n.length; i++) {
				int res = n[i] / divisor;
				System.out.println(res);
			}
		} catch (ArithmeticException e) {
			// creating a new exception with the original as the cause
			try {
				throw new RuntimeException ("Error: Division by zero occurred", e);
			} catch (Exception error) {
				System.out.println("Caught exceptions: " + error.getMessage());
			}
		}
	}
}
