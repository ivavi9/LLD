package adapter;

public class PhonePay {

    private PaymentInterface paymentInterface;

    public PhonePay(PaymentInterface paymentInterface){
        this.paymentInterface = paymentInterface;
    }
    double paymentBehavior(double accountDebit,double accountCredit, double paymentAmount){
        paymentInterface.makePayment(paymentAmount,accountDebit,accountCredit);
        return paymentInterface.getBalance(accountCredit);

    }

}
