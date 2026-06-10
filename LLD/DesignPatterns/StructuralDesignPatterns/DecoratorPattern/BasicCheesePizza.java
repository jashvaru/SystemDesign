package LLD.DesignPatterns.StructuralDesignPatterns.DecoratorPattern;

/* 
The issue is class explosion for each type of topping combination we need
to create a new class with the required topic
*/
public class BasicCheesePizza extends BasicPizza {

    @Override
    public Double getCost() {
        return super.getCost() + 1.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", cheese";
    }
    

}
