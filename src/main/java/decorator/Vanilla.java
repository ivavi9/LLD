package decorator;

public class Vanilla implements IceCream{
    private IceCream iceCream;
    public Vanilla(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return "Vanilla + "+ iceCream.getDescription();
    }

    @Override
    public int getCost() {
        return 20 + iceCream.getCost();
    }
}
