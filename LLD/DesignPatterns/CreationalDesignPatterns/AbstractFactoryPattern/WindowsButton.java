package LLD.DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class WindowsButton implements Button {

    @Override
    public void press() {
        System.out.println("Windows button is pressed");
    }
    
}
