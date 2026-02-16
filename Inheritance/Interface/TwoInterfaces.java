interface Device{
	void start();
}

interface Printer{
	void print();
}

interface Scanner{
	void scan();
}

class Machine implements Printer, Scanner{
	// public void start(){
	// 	System.out.println("Starting the machine");
	// }
	// public void print(){
	// 	System.out.println("Printing Document");
	// }
	// public void scan(){
	// 	System.out.println("Scanning Document");
	// }
	
}

public class TwoInterfaces {
	public static void main(String[] args) {
		Machine m = new Machine();
		m.start();
		m.print();
		m.scan();
	}
}
