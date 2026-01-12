import java.util.Scanner;
public class Day4_coddy {
    public static String createFormattedString(String productName, int quantity, double unitPrice)
    {
        String formattedString = String.format("Product: %s, Quantity: %.1f, Unit Price: %.5f",productName,(double)quantity,unitPrice);
        return formattedString;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int qty = scanner.nextInt();
        double price = scanner.nextDouble();
        String formattedString = createFormattedString(product, qty, price);
        System.out.println(formattedString);
        scanner.close();
    }
    
}
