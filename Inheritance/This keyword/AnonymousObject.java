class Demo{
	Demo(){
		// this(10);
		this("Default Constructor");
	}

	Demo(String message){
		System.out.println(message);
	}

	Demo(int n){
		System.out.println(n);
	}
}

public class AnonymousObject {
	public static void main(String[] args) {
		new Demo();
		new Demo();
	}
}
