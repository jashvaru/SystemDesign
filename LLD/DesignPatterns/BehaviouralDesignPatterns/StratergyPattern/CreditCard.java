package LLD.DesignPatterns.BehaviouralDesignPatterns.StratergyPattern;

public class CreditCard implements PaymentStratergy {

    @Override
    public void processPayment() {
        System.out.println("Payment done via credit card");
    }
    
}
