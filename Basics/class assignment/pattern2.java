public class pattern2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++){
			for (int j = 0; j < i-1; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 3; j >= i; j--){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
	}
}