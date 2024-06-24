public class PaymentProcessorAdapter implements PaymentProcessor {
    ThirdPartyPaymentGateway thirdPartyPaymentGateway;

    public PaymentProcessorAdapter(ThirdPartyPaymentGateway thirdPartyPaymentGateway) {
        this.thirdPartyPaymentGateway = thirdPartyPaymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        thirdPartyPaymentGateway.makePayment(amount);
    }

}
