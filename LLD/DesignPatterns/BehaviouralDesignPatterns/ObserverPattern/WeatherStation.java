package LLD.DesignPatterns.BehaviouralDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temp;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    @Override
    public void attachDevice(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void detachDevice(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp);
        }
    }
    
}
