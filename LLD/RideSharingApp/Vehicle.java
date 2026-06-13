package LLD.RideSharingApp;

abstract class Vehicle {

    private String numberPlate;

    public Vehicle(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    protected abstract double getFarePerKm();

}
