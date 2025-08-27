// import java.util.Scanner;
// public class Day4 {
// public static void up(int num)
// {
//     for(int i=1;i<=num;i++)
//     {
//         for(int j=1;j<=i;j++)
//         {
//             System.out.print("*");
//         }
//         for(int k=1;k<=2*(num-i);k++)
//         {
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++)
//         {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// public static void down(int num)
// {
//     for(int i=num;i>=1;i--)
//     {
//         for(int j=1;j<=i;j++)
//         {
//             System.out.print("*");
//         }
//         for(int k=1;k<=2*(num-i);k++)
//         {
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++)
//         {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }

   
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter num:");
//         int num  = sc.nextInt();sc.nextLine();
//         System.out.println();
//         up(num);
//         down(num);
//     }
// }