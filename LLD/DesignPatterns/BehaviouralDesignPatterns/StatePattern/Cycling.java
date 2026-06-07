package LLD.DesignPatterns.BehaviouralDesignPatterns.StatePattern;

public class Cycling implements TransportationMode{

    @Override
    public void getETA() {
        System.out.println("Cycling ETA 5mins");
    }

    @Override
    public void getDirections() {
        System.out.println("Cycling go left");
    }
    
}
