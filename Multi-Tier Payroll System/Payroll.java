class Employee {
	String name;
	double baseSalary;

    public Employee(String name, double salary) {
		baseSalary = salary;
    }

	double calculateSalary() {
		return baseSalary + 0.05*baseSalary;
	}
}

class Manager extends Employee {
	public Manager(String name, double salary) {
        super(name, salary);
    }

	@Override
	double calculateSalary() {
		double salary = super.calculateSalary() + 2000;
		return salary;
	}
}

class Executive extends Manager {
    public Executive(String name, double salary) {
        super(name, salary);
    }

	@Override
	double calculateSalary() {
		double salary = super.calculateSalary() + 0.1*baseSalary;
		return salary;
	}
}

public class Payroll {
	public static void main(String[] args) {
		// Employee emp = new Employee("Alive", 10000);
		// Manager emp = new Manager("Alive", 10000);
		Executive emp = new Executive("Alive", 10000);	
		double salary = emp.calculateSalary();
		System.out.println("Your salary is: " + salary);
	}
}
