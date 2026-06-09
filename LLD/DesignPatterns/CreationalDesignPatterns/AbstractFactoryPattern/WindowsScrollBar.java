package LLD.DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class WindowsScrollBar implements ScrollBar {
    
    @Override
    public void render() {
        System.out.println("Windows scrollbar is rendered");
    }
}
