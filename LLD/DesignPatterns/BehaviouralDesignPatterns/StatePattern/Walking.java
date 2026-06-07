package LLD.DesignPatterns.BehaviouralDesignPatterns.StatePattern;

public class Walking implements TransportationMode{

    @Override
    public void getETA() {
        System.out.println("Walking ETA 20mins");
    }

    @Override
    public void getDirections() {
        System.out.println("Walking go right");
    }
    
}
