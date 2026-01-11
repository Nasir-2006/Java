import java.util.*;
public class Day4MathClass_Exercices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length(a):");
        double a = sc.nextDouble();
        System.out.println("Enter base(b):");
        double b = sc.nextDouble();
        System.out.println("The Hypotaneous is "+Math.sqrt(Math.pow(a,2)+Math.pow(b,2))+"cm");
        
    }
}
