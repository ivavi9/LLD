package observer;

import java.util.List;

public interface OrderSubscriber {

    public void runOnCreateOrder(List<String> orderDetails);

}
