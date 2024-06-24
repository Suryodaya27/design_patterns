public class CreditCardPayment implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    CreditCardPayment(String name, String cardNumber, String expiryDate, String cvv){
        this.name = name;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount){
        System.out.println(amount + " paid with credit/debit card");
        System.out.println("Cardholder: " + name);
        System.out.println("Card number: " + cardNumber);
        System.out.println("Expiry date: " + expiryDate);
        System.out.println("CVV: " + cvv);
    }
    
}
