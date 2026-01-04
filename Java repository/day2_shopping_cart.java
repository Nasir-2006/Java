import java.util.Scanner;
public class day2_shopping_cart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        System.out.println("Enter item name:");
        item=sc.nextLine();
        System.out.println("Enter item price:");
        price = sc.nextDouble();
        System.out.println("Enter item quantity:");
        quantity=sc.nextInt();
        double total=quantity*price;
        System.out.println("Total is "+total+currency);
    }
    
}
