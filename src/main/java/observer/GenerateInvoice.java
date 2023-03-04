package observer;

import java.util.List;

public class GenerateInvoice implements OrderSubscriber{

    public GenerateInvoice() {
        Amazon.registerSubscriber(this);
    }

    @Override
    public void runOnCreateOrder(List<String> orderDetails) {
        System.out.println("I am generate invoice");
    }
}
