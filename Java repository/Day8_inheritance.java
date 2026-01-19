class Employee{
    private String name;
    private double salary;
    Employee(String name,double salary)
    {
        this.name = name;
        setsalary(salary);
    }
    public double getsalary()
    {
        return salary;
    }
    public void setsalary(double pay)
    {
        if(pay>0)
        {
            this.salary = pay;
        }
        else
        System.out.println("Sorry! salary can't be negitive");
    }
    public String getname()
    {
        return name;
    }
    public void setname(String naam)
    {
        this.name = naam;
    }
}
class Manager extends Employee{
    Manager(String name,double salary,double bonus)
    {
        super(name, salary);
        if(bonus<0)
        {
            System.out.println("Bonus can't be negitive!!!");
        }
        this.bonus = bonus;
    } 
    private double bonus;
    public void setbonus(double bonus)
    {
        this.bonus = bonus;
    }
    public double getbonus()
    {
        return bonus;
    }
    
    public void showEarning()
    {
        double total = getsalary()+bonus;
        System.out.println("Name:"+getname());
        System.out.println("Base salary:"+getsalary());
        System.out.println("Bonus:"+bonus);
        System.out.println("Total Earning:"+total);
    }
    
}
public class Day8_inheritance {
    public static void main(String[] args) {
        Manager Nasir = new Manager("Nasir", -500, 10000);
        Nasir.showEarning();
    }
    
}
