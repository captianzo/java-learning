public class Final {
	public static void main(String[] args) {
		try {
			final int a = 20;
			a = 22;
			System.out.print(a);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
