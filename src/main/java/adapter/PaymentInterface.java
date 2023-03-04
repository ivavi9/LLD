package adapter;

public interface PaymentInterface {
    public boolean makePayment(double paymentAmount, double debitAccount, double creditAccount);
    public double getBalance(double bankAccount);
}
