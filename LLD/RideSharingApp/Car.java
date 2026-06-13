package LLD.RideSharingApp;

public class Car extends Vehicle {

    public Car(String numberPlate) {
        super(numberPlate);
    }

    @Override
    protected double getFarePerKm() {
        return 20d;
    }

}
