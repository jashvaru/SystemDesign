package LLD.DesignPatterns.BehaviouralDesignPatterns.StratergyPattern;

public class UPI implements PaymentStratergy {

    @Override
    public void processPayment() {
        System.out.println("Payment done via UPI");
    }
    
}
