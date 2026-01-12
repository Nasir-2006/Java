import java.util.Scanner;
import java.util.Arrays;
public class String_Project {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the text:");
       String text = sc.nextLine();
    
       System.out.println("Enter The format: ");
       System.out.println("1 for Snake(a_b_c)");
       System.out.println("2 for kebab(a-b-c)");
       System.out.println("3 for ShortCase(A_B_C)");
        int format = sc.nextInt();
       String[] words = text.split(" ");
       
       switch (format) {
        case 1:
            
            String result1 = String.join("_",words);
            System.out.println(result1);
            break;
        case 2:
          
            String result2 = String.join("-",words);
            System.out.println(result2);
            break;
        case 3:
           
            String result3 = String.join("_",words);
            System.out.println(result3.toUpperCase());

       
        default:
            
            break;
       }
    }
    
}
