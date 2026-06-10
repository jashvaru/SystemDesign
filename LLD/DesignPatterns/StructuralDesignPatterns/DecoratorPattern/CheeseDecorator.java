package LLD.DesignPatterns.StructuralDesignPatterns.DecoratorPattern;

public class CheeseDecorator extends PizzaDecorator {

    CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Double getCost() {
        return super.getCost() + 2.50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", cheese";
    }

    
    
}
