package LLD.DesignPatterns.BehaviouralDesignPatterns.StratergyPattern;

public class PaymentService {

    private PaymentStratergy paymentStratergy;

    public void setPaymentStratergy(PaymentStratergy paymentStratergy) {
        this.paymentStratergy = paymentStratergy;
    }
    
    public void pay() {
        paymentStratergy.processPayment();
    }
}
