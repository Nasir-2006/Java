import java.util.Scanner;
class ATM{
    private double balance;
    ATM(double amount){
        if(amount>0)
        {
            System.out.println("Your initial deposit "+amount);
            balance = amount;
        }
        else{
            System.out.println("Can't open account with initial deposit!");
        }
    }
    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Your Balance: "+balance);
    }
    public void withdraw(double amount)
    {
        balance-=amount;
        System.out.println("Your Balance: "+balance);
    }
    public double getbalance()
    {
        return balance;
    }
}
public class prac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(5000);
        System.out.println("Enter Money to deposit:");
        double money = sc.nextDouble();
        atm.deposit(money);
        System.out.println("Enter Money to withdraw!:");
        double withdraw = sc.nextDouble();
        atm.withdraw(withdraw);
    }
}