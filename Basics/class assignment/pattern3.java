public class pattern3 {
	public static void main(String[] args) {
		for (int i = 3; i > 0; i--){
			for (int j = i; j > 0; j--){
				System.out.print(" ");
			}
			System.out.print("*");
			if (i == 3){
				System.out.println("");
				continue;
			}
			for(int j = i; j > 0; j--){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
	}
}
//    *
//   * *
//  *   *
// *     *