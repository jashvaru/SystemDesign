package LLD.DesignPatterns.BehaviouralDesignPatterns.StrategyPattern;

public class Client {
    
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStratergy(new CreditCard());
        paymentService.pay();
        paymentService.setPaymentStratergy(new UPI());
        paymentService.pay();
    }
}
