package decorator;

public class OrangeCone implements IceCream{

    private IceCream iceCream;
    public OrangeCone() {
    }
    public OrangeCone(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return "Orange Cone";
        }else{
            return "Orange Cone + " + iceCream.getDescription();
        }
    }

    @Override
    public int getCost() {
        if(iceCream == null){
            return 100;
        }else{
            return 100 + iceCream.getCost();
        }
    }
}
