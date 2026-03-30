import java.util.Scanner;

public class ScannerErrorHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int myInt = sc.nextInt();
		String myString = sc.next();
		String mySentence = sc.nextLine();
		System.out.println(myInt + myString + mySentence);
	}	
}
