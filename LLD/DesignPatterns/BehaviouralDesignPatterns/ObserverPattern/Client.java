package LLD.DesignPatterns.BehaviouralDesignPatterns.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        LaptopDevice laptopDevice = new LaptopDevice();
        MobileDevice mobileDevice = new MobileDevice();

        weatherStation.attachDevice(laptopDevice);
        weatherStation.attachDevice(mobileDevice);

        weatherStation.setTemp(26);

        weatherStation.notifyObservers();
    }
}
