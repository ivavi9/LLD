package observer;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        GenerateInvoice generateInvoice = new GenerateInvoice();
        
        amazon.createOrder(List.of("Something","Order","Avi"));

    }
}
