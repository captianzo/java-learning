abstract class Payment {
    private String transactionId;
    private double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    abstract double processPayment();
}

class CreditCardPayment extends Payment {

    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    double processPayment() {
        double fee = 0.02 * getAmount();
        return getAmount() + fee;
    }
}

class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(String transactionId, double amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }

    @Override
    double processPayment() {
        if (upiId == null || !upiId.contains("@")) {
            System.out.println("Invalid UPI ID");
            return 0;
        }
        return getAmount();
    }
}

class PaymentProcessor {

    public static double processAllPayments(Payment[] payments) {
        double total = 0;

        for (Payment p : payments) {
            double result = p.processPayment();
            total += result;
        }

        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("TXN123", 1000);
        System.out.println("Credit Card Payment: " + p1.processPayment());

        Payment p2 = new UPIPayment("TXN456", 1000, "user@upi");
        System.out.println("UPI Payment: " + p2.processPayment());

        Payment[] payments = {p1, p2};

        double total = PaymentProcessor.processAllPayments(payments);
        System.out.println("Total: " + total);
    }
}
