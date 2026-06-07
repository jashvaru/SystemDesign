package LLD.DesignPatterns.BehaviouralDesignPatterns.StatePattern;

public class Client {
    
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new Walking());
        directionService.getETA();
        directionService.getDirections();

        directionService.setTransportationMode(new Cycling());
        directionService.getETA();
        directionService.getDirections();
    }

}
