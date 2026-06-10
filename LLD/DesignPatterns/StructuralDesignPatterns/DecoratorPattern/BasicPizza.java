package LLD.DesignPatterns.StructuralDesignPatterns.DecoratorPattern;

public class BasicPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public Double getCost() {
        return 5.00;
    }
    
}
