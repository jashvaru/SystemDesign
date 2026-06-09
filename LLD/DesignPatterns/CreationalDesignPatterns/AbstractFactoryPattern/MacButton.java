package LLD.DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class MacButton implements Button{

    @Override
    public void press() {
        System.out.println("MacOS button is pressed");
    }
    
}
