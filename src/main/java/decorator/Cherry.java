package decorator;

public class Cherry implements IceCream{
    private IceCream iceCream;
    public Cherry(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return "Cherry + "+ iceCream.getDescription();
    }

    @Override
    public int getCost() {
        return 10 + iceCream.getCost();
    }
}
