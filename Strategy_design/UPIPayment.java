public class UPIPayment implements PaymentStrategy{
    String upiID;
    UPIPayment(String upiID){
        this.upiID = upiID;
    }

    @Override
    public void pay(double amount){
        System.out.println(amount + " paid with UPI");
        System.out.println("UPI ID: " + upiID);
    }
}
