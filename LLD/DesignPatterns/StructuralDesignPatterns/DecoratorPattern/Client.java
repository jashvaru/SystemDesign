package LLD.DesignPatterns.StructuralDesignPatterns.DecoratorPattern;

public class Client {
    
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        Pizza cPizza = new BasicCheesePizza();
        System.out.println(cPizza.getDescription());
        System.out.println(cPizza.getCost());
    }

    

}
