package LLD.DesignPatterns.CreationalDesignPatterns.FactoryPattern;

public class Car implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivers by Car");
    }
    
}
