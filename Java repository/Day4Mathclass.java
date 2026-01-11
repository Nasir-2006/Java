import java.util.Scanner;
public class Day4Mathclass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter a number ");
        double num = sc.nextDouble();
        System.out.println("Value of Pi:"+Math.PI);
        System.out.println("Value of Euler Number"+Math.E);
        System.out.println("Square root of "+Math.sqrt(num));
        System.out.println("Floor values of "+Math.floor(8.5));
        System.out.println("Ceiling values of "+Math.ceil(8.5));
        System.out.println("Round values of "+Math.round(8.5));
        System.out.println("Absolute values of "+Math.abs(-8.5));
        System.out.println("Max values of "+Math.max(5,10));
        System.out.println("Min values of "+Math.min(8.5,1));
    }
    
}
