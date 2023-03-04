package observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private static List<OrderSubscriber> listSubscriber = new ArrayList<OrderSubscriber>();
    public static void registerSubscriber(OrderSubscriber subscriber){
        listSubscriber.add(subscriber);
    }
    public static void deRegisterSubscriber(OrderSubscriber subscriber){
        listSubscriber.remove(subscriber);
    }

    public void createOrder(List<String> orderDetails){
        for(OrderSubscriber orderSubscriber: listSubscriber){
            orderSubscriber.runOnCreateOrder(orderDetails);
        }
    }


}
