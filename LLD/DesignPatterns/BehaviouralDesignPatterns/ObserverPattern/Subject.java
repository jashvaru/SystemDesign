package LLD.DesignPatterns.BehaviouralDesignPatterns.ObserverPattern;

public interface Subject {

    public void attachDevice(Observer obs);
    public void detachDevice(Observer obs);
    public void notifyObservers();
    
}
