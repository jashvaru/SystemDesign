package LLD.DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class MacScrollBar implements ScrollBar {
    
    @Override
    public void render() {
        System.out.println("MacOS scroll bar is rendered");
    }
    
}
