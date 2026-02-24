public class Throw {
	static void fun() throws Exception {
		// try {
		// 	throw new NullPointerException("Demo");
		// 	// System.out.println("Fun Code Block");
		// } catch (NullPointerException e) {
		// 	System.out.println("Caught inside fun(): " + e.getMessage());
		// 	throw e;
		// }
		throw new NullPointerException("Demo explicit Exception thrown inside Fun");
	}

	public static void main(String[] args) throws Exception{
		try {
			fun();
		} catch (NullPointerException e) {
			System.out.println("Caught in main: " + e.getMessage());
		}
	}
}
