class Account {
	double balance;

	double calculateInterest(){
		double interest = 0.02 * balance;
		return interest;
	}
}

class SavingsAccount extends Account {
    public SavingsAccount(double bal) {
		balance = bal;
    }
	@Override
	double calculateInterest(){
		double interest = 0.04 * balance;
		if (balance > 50000){
			balance += 500;
			System.out.println("Your bonus is 500");
		}
		return interest;
	}
}

class FixedDeposit extends SavingsAccount {
	public FixedDeposit(double bal) {
        super(bal);
    }
	@Override
	double calculateInterest() {
		double interest = super.calculateInterest();
		interest += 0.02 * balance;
		return interest;
	}
}

public class Interest {
	public static void main(String[] args) {
		// Account acc = new SavingsAccount(10000);
		// Account acc = new SavingsAccount(60000);
		Account acc = new FixedDeposit(60000);
		double interest = acc.calculateInterest();
		System.out.println("Your interest is: " + interest);
	}
}
