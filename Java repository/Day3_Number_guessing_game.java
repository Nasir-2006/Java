import java.util.Random;
import java.util.Scanner;
public class Day3_Number_guessing_game {
    public static void main(String[] args) {
        
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int num = ran.nextInt(1,11);
       
      for(int i=3;i>0;i--){
        System.out.println("Enter a Number: (You have "+i+" chances remaining)");
        int g_num = sc.nextInt();
        if(g_num==num)
        {
            System.out.println("Congratulaion you guessed Right number!");
        }
        else
        {
             System.out.println("Sorry better luck next time (^-^)");
            
        }
    }
  System.out.println("Game Over! *-*");
    }
}
