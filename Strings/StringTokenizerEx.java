import java.util.StringTokenizer;

// Used for splitting a string into tokens (word, numbers, etc)
// defined in java.util package
// faster than split() method of String class

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "Java,Python,C,C++,JavaScript";
		StringTokenizer st = new StringTokenizer(str);

		while (st.hasMoreTokens()) { 
			System.out.println(st.nextToken());
		}
	}
}
