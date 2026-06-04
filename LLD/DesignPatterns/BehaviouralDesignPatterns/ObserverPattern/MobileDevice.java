package LLD.DesignPatterns.BehaviouralDesignPatterns.ObserverPattern;

public class MobileDevice implements Observer {

    @Override
    public void update(float temp) {
        System.out.println("Mobile Temp is " + temp);
    }
    
}
