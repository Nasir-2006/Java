import java.util.Scanner;
public class Prac {
    
private String P_Name; 
private int P_ID; 
private int RoadLength; 
private double RoadCost; 
private int NOTP; 
private int PDIM;
private double RPT;

public void setNAME(String Name)
{
P_Name = Name;
}

public String getName()
{
    return P_Name;
}

public void setid(int ID)
{
P_ID = ID;
}

public int getid()
{
    return P_ID;
}

public void setRL(int Length)
{
RoadLength = Length;
}

public int getroadlength()
{
    return RoadLength;
}

public void calRoadCost()
{
RoadCost = RoadLength*2.5; 
}

public double getRoadCost()
{
    return RoadCost;
}

public void calTP()
{
NOTP = RoadLength/100;
}

public int getTP()
{
    return NOTP;
}

public void caltime()
{
    int temp = RoadLength*1000;
    int days = temp/10;
    PDIM = days/30;
}

public double gettime()
{
    return RPT;
}
public void calTax()
{
    if(RoadCost<20)
    {
        RPT = RoadCost*0.02;
    }
    else if(RoadCost>20)
    RPT = RoadCost*0.03;
}

public double getTax()
{
    return RPT;
}

public void Display()
{
    System.out.println("Project Name is "+P_Name);
    System.out.println("Project Id is "+P_ID);
    System.out.println("Road Length in Km is: "+RoadLength);
    System.out.println("Road cost is "+RoadCost+"Millions");
    System.out.println("Number of Toll plazaas are "+NOTP);
    System.out.println("Project Duration is "+PDIM+"Months");
    System.out.println("Tax is "+RPT);
}
public static void main(String[] args) {
    
    Prac P1 = new Prac();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Project name:");
    String Name = sc.nextLine();
    P1.setNAME(Name);
    System.out.println("Enter Project ID:");
    int id = sc.nextInt();
    P1.setid(id);
    System.out.println("Length in Km:");
    int Length = sc.nextInt();
    P1.setRL(Length);
    P1.calRoadCost(); 
    P1.calTP(); 
    P1.caltime(); 
    P1.calTax(); 
    P1. Display();
    sc.close();

}
}

