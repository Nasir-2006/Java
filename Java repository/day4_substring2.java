import java.util.Scanner;
import java.util.Arrays;
public class day4_substring2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String delimeter = sc.nextLine();
        String[] word = text.split(" ");
        String result = text.join(delimeter,word);
        System.out.println(result);
        sc.close();
    }

    
}
