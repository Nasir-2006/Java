import java.util.Scanner;
abstract class BankAccount{
    private int acc_num;
    private String Holdername;
    private double bal;
    BankAccount(int acc_num,String Holdername,double bal){
        this.acc_num = acc_num;
        this.Holdername = Holdername;
        this.bal = bal;
    }
    public double getbal() {
        return bal;
    }
    public String getHoldername(){
        return Holdername;
    }
    public int getacc_num(){
        return acc_num;
    }
    public void setbal(double bal)
    {
        this.bal = bal;
    }
    public void setHoldername(String Holdername){
        this.Holdername = Holdername;
    }
    public void setacc_num(int acc_num)
    {
        this.acc_num = acc_num;
    }
    public void Deposit(double amount){
        System.out.println("Deposited Amount:"+amount);
    }
    abstract void withdraw(double amount);
    }
interface taxable{
    double calculatetax(double amount);
}
class SavingAccount extends BankAccount{

    SavingAccount(int acc_num, String Holdername, double bal) {
        super(acc_num, Holdername, bal);
    }
    @Override
    public void withdraw(double amount){
        if(getbal()>=amount)
        {
            setbal(getbal()-amount); 
        }
    }
}
class BusinessAccount extends BankAccount implements taxable{
    BusinessAccount(int acc_num, String Holdername, double bal) {
        super(acc_num, Holdername, bal);
    }
    public double calculatetax(double amount)
    {
        double tax = amount * 0.2;
        return tax;
    }
    @Override
    public void withdraw(double amount){
        double taxed = calculatetax(amount);
        double total = amount + taxed;
        if(getbal() - total >= -50000)
        {
            setbal(total);
        }
        else
        {
            System.out.println("Limit Exceed!");
        }
    }
}
class Try_Catch{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        BankAccount Custumer = null;
        try{
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter Id:");
            int id = sc.nextInt();
            System.out.println("Enter balance:");
            double Balance = sc.nextDouble();
             Custumer = new BusinessAccount(id,name,Balance); 
        }
        
        catch(Exception e)
        {
            System.out.println("Sorry there is mistake in your data check again!");
        }
        
        System.out.println("Which option yu want (1. Deposit | 2. Withdraw | 3. Check Balance");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                
                System.out.println("Enter Amount:");
                double amt = sc.nextDouble();
               Custumer.Deposit(amt);
               break;
            case 2:
                try{
                    System.out.println("Enter Amount:");
                double wd = sc.nextDouble();
                Custumer.withdraw(wd);}
                catch(Exception e)
                {
                    System.out.println("Invalid Input!");
                }
                break;
            case 3:
                Custumer.getbal();
                break;

        }
    }
}