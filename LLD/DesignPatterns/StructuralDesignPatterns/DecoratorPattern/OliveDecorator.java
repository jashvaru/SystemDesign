package LLD.DesignPatterns.StructuralDesignPatterns.DecoratorPattern;

public class OliveDecorator extends PizzaDecorator {

    OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", olive";
    }

}
