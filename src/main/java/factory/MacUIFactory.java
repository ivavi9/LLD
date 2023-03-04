package factory;

import factory.helper.Button;
import factory.helper.MacButton;
import factory.helper.MacScreen;
import factory.helper.Screen;

public class MacUIFactory implements UIFactory{

    private Button button = new MacButton();
    private Screen screen = new MacScreen();

    @Override
    public void paintScreen() {
        button.displayButton();
        screen.displayScreen();
    }
}
