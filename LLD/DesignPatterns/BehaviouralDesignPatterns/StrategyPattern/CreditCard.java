package LLD.DesignPatterns.BehaviouralDesignPatterns.StrategyPattern;

public class CreditCard implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("Payment done via credit card");
    }
    
}
