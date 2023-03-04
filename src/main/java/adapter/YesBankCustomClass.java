package adapter;

public class YesBankCustomClass implements PaymentInterface{

    YesBankAPI api;

    public YesBankCustomClass() {
        api = new YesBankAPI();
    }

    @Override
    public boolean makePayment(double paymentAmount, double debitAccount, double creditAccount) {

        double debitAccountBalance = api.findBalance(debitAccount);
        if(debitAccountBalance > paymentAmount){
            api.doPayment(debitAccount,-paymentAmount);
            api.doPayment(creditAccount,paymentAmount);
            return true;
        }
        return false;
    }

    @Override
    public double getBalance(double bankAccount) {
        return api.findBalance(bankAccount);
    }
}
