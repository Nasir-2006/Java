class Employee{
    private int ID;
    private String name;
    private int age;
    private int grade;
    private double salary;
    private float Bonus;
    Employee(int ID,String name,int age,double salary)
    {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.salary = salary;
    }
    Employee(Employee e)
    {
        this.age = e.age;
        this.salary = e.salary;
    }
    //getters
    public int getID()
    {
        return ID;
    }
    public String getname()
    {
        return name;
    }
    public double getsalary()
    {
        return salary;
    }
    public int getage()
    {
        return age;
    }
    //setters
    public void setID(int ID)
    {
        this.ID = ID;
    }
    public void setage(int age)
    {
        this.age = age;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public void setsalary(double salary)
    {
        this.salary = salary;
    }
public int findGrade() 
{
        if (this.salary <= 5000) {
            return 5; 
        } else if (this.salary <= 10000) {
            return 10; 
        } else if (this.salary <= 20000) {
            return 16; 
        } else {
            return 22;
        }
    }
public double calculateBonus()
 {
        double bonus = 0;
        int grade = findGrade(); 
        bonus = bonus + (this.age * 1000.4);
        if (grade >= 1 && grade <= 10)
        {
            bonus = bonus + 5000;
        }
        if (grade >= 1 && grade <= 16)
        {
            bonus = bonus + (this.salary * 0.035); 
        } 
        else if (grade == 17) 
        {
            bonus = bonus + (this.salary * 0.047); 
        } 
        else if (grade != 22) 
        { 
           bonus = bonus + (this.salary * 0.053); 
        }
        return bonus;
    }
public void displayInfo()
{
    // double bonus = calculateBonus();
    System.out.println("\nName:"+getname());
    System.out.println("ID:"+getID());
    System.out.println("Age:"+getage());
    System.out.println("Salary:"+getsalary());
    System.out.println("Bonus:"+calculateBonus());
}
public static void  Display_ID_ofMaximumSalariedEmployee(Employee n1,Employee n2)
{
if(n1.getsalary()>n2.getsalary())
{
    System.out.println("1st one salary is greater");
}
else if(n2.getsalary()>n1.getsalary())
{
System.out.println("2nd's salary is greater");
}
else if(n1.getsalary()==n2.getsalary())
{
    System.out.println("Both's slary are equal");
}
}
}
public class Assignment {
    public static void main(String[] args) {
        Employee E1 = new Employee(226789, "Nasir", 20, 17000);
        Employee E2 = new Employee(555145, "Mubasher", 18, 20000);
        Employee E3 = new Employee(E1);
        E1.findGrade();
        E2.findGrade();
        E1.calculateBonus();
        E2.calculateBonus();
        E1.displayInfo();
        E2.displayInfo();
        E3.findGrade();
        E3.calculateBonus();
        E3.displayInfo();
        Employee.Display_ID_ofMaximumSalariedEmployee(E1, E2);
        
    }
    
}
