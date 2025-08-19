import java.util.Scanner;
import java.util.Arrays;

public class Day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arr = text.split(",");
        // Write your code below
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i].length()>5)
            {
               String[] arr2 = arr;
               System.out.print(Arrays.toString(arr2));
            }
           
        }
    }
}