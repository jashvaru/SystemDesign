package LLD.RideSharingApp;

public class Bike extends Vehicle {

    public Bike(String numberPlate) {
        super(numberPlate);
    }

    @Override
    protected double getFarePerKm() {
        return 10d;
    }

}
