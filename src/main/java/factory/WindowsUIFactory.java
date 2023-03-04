package factory;

import factory.helper.Screen;
import factory.helper.WindowsButton;
import factory.helper.Button;
import factory.helper.WindowsScreen;

public class WindowsUIFactory implements UIFactory{

    private Button button = new WindowsButton();
    private Screen screen = new WindowsScreen();

    @Override
    public void paintScreen() {
        button.displayButton();
        screen.displayScreen();

    }
}
