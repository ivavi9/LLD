package factory;

public class GetFactory {
    public static UIFactory getUI(String factoryName){
        if(factoryName.equals("Windows")){
            return new WindowsUIFactory();
        }else{
            return new MacUIFactory();
        }

    }
}
