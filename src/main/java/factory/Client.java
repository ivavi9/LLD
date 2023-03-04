package factory;

public class Client {


    public static void main(String[] args) {
        UIFactory uiFactory = GetFactory.getUI("Windows");
        uiFactory.paintScreen();
    }

}
