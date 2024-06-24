public class CustomPaymentProcessor implements PaymentProcessor {
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Making payment of amount: " + amount);
    }
}
