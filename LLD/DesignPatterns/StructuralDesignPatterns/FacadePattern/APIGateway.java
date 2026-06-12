package LLD.DesignPatterns.StructuralDesignPatterns.FacadePattern;

public class APIGateway {
    
    private OrderService orderService;
    private PaymentService paymentService;
    private UserService userService;

    APIGateway() {
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
        this.userService = new UserService();
    }

    public String getAllDetails(String orderId, String paymentId, String userId) {
        String orderDetail = orderService.getOrder(orderId);
        String paymentDetail = paymentService.getPayment(paymentId);
        String userDetail = userService.getUser(userId);

        return orderDetail + " " + paymentDetail + " " + userDetail;


    }
}
