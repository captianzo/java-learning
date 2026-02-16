class BankAccount{
	double getInterestRate(){
		return 0.0; // default interest rate
	}
}

class SavingsAccount extends BankAccount{
	double getInterestRate(){
		return 4.5; // savings account inerest rate
	}
}

class CurrentAccount extends BankAccount{
	double getInterestRate(){
		return 3.0; // current account interest rate
	}
}

public class Overriding {
	public static void main(String[] args) {
		BankAccount sa = new SavingsAccount();
		BankAccount ca = new CurrentAccount();
		System.out.println(sa.getInterestRate());
		System.out.println(ca.getInterestRate());
	}
}
