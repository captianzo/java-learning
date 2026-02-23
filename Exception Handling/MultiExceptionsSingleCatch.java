public class MultiExceptionsSingleCatch {
	public static void main(String[] args) {
		try{
			String str = "123a";
			int num = Integer.parseInt(str);
			// int result = 10 / 0;
			int result = num/0;

		} catch (NumberFormatException | ArithmeticException e){
			System.out.println("Error: " + e.getClass().getSimpleName() + " occurred");
		} finally {
			System.out.println("The execution of the code has completed and the errors have been dealt with accordingly");
		}
	}
}
