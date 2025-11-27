import java.util.Scanner;
import java.time.LocalDate;
public class D1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your name:");
        String name = sc.nextLine();
        System.out.printf("Enter your year of birth: ");
        int in = sc.nextInt();
        int age = LocalDate.now().getYear() - in;
        if(age<0)
        {
            System.out.println("you enterd wrong year");
        }
        else
        System.out.println( name + " " + age);
        sc.close();
        
    }
}