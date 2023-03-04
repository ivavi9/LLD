package decorator;

public class Client {
    public static void main(String[] args) {
        IceCream myIceCream = new Vanilla(
                                new Cherry(
                                        new OrangeCone(
                                                new ChocolateCone()
                                        )
                                )
        );
        System.out.println(myIceCream.getCost());
        System.out.println(myIceCream.getDescription());
    }
}
