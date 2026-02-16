// Vector is similar to ArrayList but synchronized (thread-safe)
// Slower than ArrayList due to synchronized overhead
import java.util.Vector;

public class Vector {
	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>();

		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);

		System.out.println("Vector: " + numbers);
		numbers.remove(1); // removes element at index 1
		System.out.println("After removing at index 1: " + numbers);

		System.out.println("Size: " + numbers.size());
		System.out.println("Element at index 0: " + numbers.get(0));
	}	
}
