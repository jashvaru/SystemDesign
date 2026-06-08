package LLD.DesignPatterns.CreationalDesignPatterns.FactoryPattern;

public class Bike implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivers by Bike");
    }
    
}
