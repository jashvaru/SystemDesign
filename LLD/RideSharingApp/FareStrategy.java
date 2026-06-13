package LLD.RideSharingApp;

public interface FareStrategy {

    double calcFare(Vehicle vehicle, double distance);
    
}

class StandardFareStrategy implements FareStrategy {

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * 10d;
    }
}

class SharedFareStrategy implements FareStrategy {

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm()*10d*0.5d;
    }
}

class LuxuryFareStrategy implements FareStrategy {

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm()*10d*2d;
    }

}