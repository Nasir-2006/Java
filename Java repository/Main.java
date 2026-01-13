import java.util.Scanner;

public class Main {
    public static void compareStrings(String str1, String str2) {
        // Write your code here
        boolean eq1 = str1.equals(str2);
        boolean eq2 = str1.equalsIgnoreCase(str2);
        int cmp1 = str1.compareTo(str2);
        int cmp2 = str1.compareToIgnoreCase(str2);
        System.out.println(str1+" equals "+str2+": "+eq1);
        System.out.println(str1+" equalsIgnoreCase "+str2+": "+eq2);
        System.out.println(str1+" compareTo "+str2+": "+cmp1);
        System.out.println(str1+" compareToIgnoreCase "+str2+": "+cmp2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);
    }
}