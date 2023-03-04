package decorator;

public class ChocolateCone implements IceCream{

    private IceCream iceCream;
    public ChocolateCone() {
    }
    public ChocolateCone(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return "Chocolate Cone";
        }else{
            return "Chocolate Cone + " + iceCream.getDescription();
        }
    }

    @Override
    public int getCost() {
        if(iceCream == null){
            return 200;
        }else{
            return 200 + iceCream.getCost();
        }
    }
}
