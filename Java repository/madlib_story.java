import java.util.Scanner;
public class madlib_story {
    public static void main(String[] args) {
        String Adj1;
        String noun1;
        String verb;
        String sign;
        String Place;
        String Adj2;
        String Noun;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Adjective1: ");
        Adj1 = sc.nextLine();
        System.out.println("Enter a noun: ");
        noun1 = sc.nextLine();
        System.out.println("Enter verb(ending with -ing): ");
        verb = sc.nextLine();
        System.out.println("Enter sign(i.e !,^): ");
        sign = sc.nextLine();
        System.out.println("Enter place name: ");
        Place = sc.nextLine();
        System.out.println("Enter Adjective2:");
        Adj2 = sc.nextLine();
        System.out.println("Enter Noun(Plural):");
        Noun = sc.nextLine();
        System.out.println("Enter a number:");
        num = sc.nextInt();
        System.out.println("Yesterday, I was walking through the "+Adj1+" forest when I tripped over a giant "+noun1+". I couldn’t believe my eyes! I started "+verb+" as fast as I could. Suddenly, I yelled "+sign );
        System.out.println("Right in front of me was a secret entrance to "+Place+" . It looked very "+ Adj2+". I went inside and found hundreds of "+Noun+" scattered everywhere. I decided to take "+num+" of them home with me. What a day!");
        sc.close();
    }
}
