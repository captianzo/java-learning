class Student{
	String name;

    public Student(String name) {
		this.name = name;
		System.out.println("Name set to: " + this.name);
    }

	void display(){
		System.out.println("Name: " + this.name);
	}
}

public class This {
	public static void main(String[] args) {
		Student s = new Student("Alice");
		s.display();
	}
}
