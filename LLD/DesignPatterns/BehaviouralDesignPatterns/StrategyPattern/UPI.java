package LLD.DesignPatterns.BehaviouralDesignPatterns.StrategyPattern;

public class UPI implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("Payment done via UPI");
    }
    
}
