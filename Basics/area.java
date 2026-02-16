public class area {
	public static void main(String[] args) {
		final float pi = 3.14f;
		
		// calculating area of rectangle
		int length = 4;
		int width = 6;
		int area = length*width;
		System.out.println("Length is: " + length);
		System.out.println("Width is: " + width);
		System.out.println("Area of rectangle is: " + area);
		
		// calculating area of circle
		int radius = 10;
		float carea = radius*radius*pi;
		System.out.println("Radius is: " + radius);
		System.out.println("Area of Circle is: " + carea);
	}
}
