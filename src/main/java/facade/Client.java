package facade;

public class Client {

    public static void main(String[] args) {
        BankingFacade bankingFacade = new BankingFacade();
        bankingFacade.createOrder();
    }

}
