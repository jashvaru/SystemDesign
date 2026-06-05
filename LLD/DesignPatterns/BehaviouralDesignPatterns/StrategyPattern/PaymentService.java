package LLD.DesignPatterns.BehaviouralDesignPatterns.StrategyPattern;

public class PaymentService {

    private PaymentStrategy paymentStratergy;

    public void setPaymentStratergy(PaymentStrategy paymentStratergy) {
        this.paymentStratergy = paymentStratergy;
    }
    
    public void pay() {
        paymentStratergy.processPayment();
    }
}
