package LLD.DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class MacUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }
    
}
