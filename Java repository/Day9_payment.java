abstract class Payment{
    abstract public void pay(double amount);
    public void showReceipt()
    {
        System.out.println("----Payment Receipt----");
        System.out.println("Bankai!!!!!!");
    }
}
class creditcard extends Payment{
    @Override
    public void pay(double amount)
    {
        double Total = amount + (amount * 2 / 100);
        System.out.println("Payment via Credit card: "+Total);
    }
}
class CashONDeliebery extends Payment{
@Override
public void pay(double amount){
    System.out.println("Payment Cash on Delievry: "+amount);
}
}
public class Day9_payment {
    public static void main(String[] args) {
        Payment Credit = new creditcard();
        Payment Cash = new CashONDeliebery();
        Credit.pay(5000);
        Cash.pay(1000);
        
    }
}
