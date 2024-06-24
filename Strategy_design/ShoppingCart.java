public class ShoppingCart{
    PaymentStrategy paymentStrategy;

    ShoppingCart(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    void checkout(double amount){
        paymentStrategy.pay(amount);
    }
}
