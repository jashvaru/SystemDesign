package LLD.DesignPatterns.StructuralDesignPatterns.DecoratorPattern;

abstract class PizzaDecorator implements Pizza {

    protected Pizza decoratedPizza;

    PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public Double getCost() {
        return decoratedPizza.getCost();
    }
    
}
