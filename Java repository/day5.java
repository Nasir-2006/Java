class ATM{
    private double balance;
    public void setbalance(double balance)
    {
        if(balance>0)
        {
            System.out.println("Invalid Amount!");
        }
        this.balance = balance;
        }
    public double getbalance()
    {
        return balance;
    }
    
}
public class day5 {

    public static void main(String[] args) {
        ATM atm = new ATM();
        
        atm.setbalance(0);
        
    }
}