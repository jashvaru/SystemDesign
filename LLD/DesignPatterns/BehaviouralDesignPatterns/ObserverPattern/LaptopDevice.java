package LLD.DesignPatterns.BehaviouralDesignPatterns.ObserverPattern;

public class LaptopDevice implements Observer {

    @Override
    public void update(float temp) {
        System.out.println("Laptop temp is " + temp);
    }
    
}
