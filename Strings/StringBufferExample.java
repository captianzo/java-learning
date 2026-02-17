// difference between string and stringbuffer is that stringbuffer is mutable (it can be modified)

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");

		System.out.println("Before append: " + sb);
		sb.append("World");
		System.out.println("Afer append: " + sb);

		System.out.println("Before insert: " + sb);
		sb.insert(6, "Java");
		System.out.println("Afer insert: " + sb);
		
		System.out.println("Before replace: " + sb);
		sb.replace(0, 5, "Hi");
		System.out.println("Afer replace: " + sb);

		System.out.println("Before delete: " + sb);
		sb.delete(2,5);
		System.out.println("Afer delete: " + sb);

		System.out.println("Before append: " + sb);
		sb.append("World");
		System.out.println("Afer append: " + sb);
	}
}
