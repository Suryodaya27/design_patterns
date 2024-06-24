public class Main {
    public static void main(String[] args) {
        CustomPaymentProcessor paymentProcessor = new CustomPaymentProcessor();
        paymentProcessor.processPayment(100.0);

        ThirdPartyPaymentGatewayImpl thirdPartyImpl = new ThirdPartyPaymentGatewayImpl();
        thirdPartyImpl.makePayment(2000.0);

        PaymentProcessorAdapter paymentProcessorAdapter = new PaymentProcessorAdapter(thirdPartyImpl);
        paymentProcessorAdapter.processPayment(3000.0);

    }
}
