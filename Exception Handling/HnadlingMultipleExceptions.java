public class HnadlingMultipleExceptions {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		} // catch (NullPointerException e) {
		// 	System.out.println("Error: Null Pointer Exception! : " + e.getMessage());
		// }
		catch(Exception e){
			System.out.println("Some other error occured : " + e.getMessage());
		}
	}
}
