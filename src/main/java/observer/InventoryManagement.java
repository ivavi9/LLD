package observer;

import java.util.List;

public class InventoryManagement implements OrderSubscriber{

    public InventoryManagement() {
        Amazon.registerSubscriber(this);
    }

    @Override
    public void runOnCreateOrder(List<String> orderDetails) {
        System.out.println("I am inventory management");
    }
}
