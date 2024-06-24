public class Main {
    public static void main(String[] args) {
        ShoppingCart sc1 = new ShoppingCart(new CreditCardPayment("John Doe", "1234 5678 9012 3456", "12/23", "123"));
        sc1.checkout(1000);

        ShoppingCart sc2 = new ShoppingCart(new UPIPayment("johndoe@upi"));
        sc2.checkout(1000);
    }
}
