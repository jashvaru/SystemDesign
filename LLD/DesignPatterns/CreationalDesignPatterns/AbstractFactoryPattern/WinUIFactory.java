package LLD.DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class WinUIFactory implements UIFactory {

    @Override
    public Button createButton() {
       return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }
    
}
