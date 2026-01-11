import java.util.Scanner;

public class Day4_substring1 {
    public static void analyzeString(String str) {
        // Write your code here
        int length = str.length();
        char c_at = str.charAt(4);
        String sub_string_7=str.substring(7);
        String sub_string_not=str.substring(3,6);
        boolean end=str.endsWith(".");
        String UC =str.toUpperCase();
        System.out.println("Length: "+length);
        System.out.println("Char at 4: "+c_at);
        System.out.println("Substring: "+sub_string_7);
        System.out.println("Substring 2: "+sub_string_not);
        System.out.println("Ends with dot: "+end);
        System.out.println("Uppercase:"+UC);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        analyzeString(message);
    }
}