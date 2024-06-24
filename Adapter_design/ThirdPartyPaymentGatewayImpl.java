public class ThirdPartyPaymentGatewayImpl implements ThirdPartyPaymentGateway{
    @Override
    public void makePayment(double amount) {
        System.out.println("Making payment of amount int ThirdPartyPaymentGateway: " + amount);
    }
}
