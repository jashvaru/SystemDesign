package LLD.DesignPatterns.BehaviouralDesignPatterns.StatePattern;

public class DirectionService {
    private TransportationMode transportationMode;

    public DirectionService(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public void setTransportationMode(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public void getETA() {
        transportationMode.getETA();
    }

    public void getDirections() {
        transportationMode.getDirections();
    }
}
