package observer;

import java.util.List;

public class ShipOrder implements OrderSubscriber{

    public ShipOrder() {
        Amazon.registerSubscriber(this);
    }

    @Override
    public void runOnCreateOrder(List<String> orderDetails) {
        System.out.println("I am shipOrder");
    }
}
