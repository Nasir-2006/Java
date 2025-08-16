// import java.util.Scanner;
// public class Day1 {
//     public static void main(String[] args) {
//         int rows,col;
//         Scanner sc = new Scanner(System.in);
//         rows = sc.nextInt();sc.nextLine();
//         col = sc.nextInt();
//         for(int i=1;i<=rows;i++)
//         {
//             for(int j=1;j<=col;j++)
//             {
//                 if(i==1||i==rows||j==1||j==col)
//                 {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//--------------------------------------------------------Right angle Triagle-----------------------------------------------
// import java.util.Scanner;
// public class Day1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int n = sc.nextInt();
//         int sum=0;
//         for(int i = 1;i<=n;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//             System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//------------------------------------------------------Right angle Triagle(Descreaing order)-----------------------------
// import java.util.Scanner;
// public class Day1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int n = sc.nextInt();
//         for(int i = 1; i<=n;i++)
//         {
//             for(int k = 1;k<=i-1;k++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j = i;j<=n;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//-------------------------------------------------Half Butterfly--------------------
// import java.util.Scanner;
// public class Day1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 1;i<=n;i++)
//         {
//             for(int j = 1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = 1;i<=n;i++)
//         {
//             for(int j = i ;j<=n;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }
//-------------------------------------------------------Solid Rohombus----------------------------------------------------
// import java.util.Scanner;
// public class Day1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int n = sc.nextInt();
//         for(int i = 1;i<=n;i++)
//         {
//             for(int j = 1;j<=n-i;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int k = 1;k<=n;k++)
//             {
//                 System.out.print("*");
//             }System.out.println();
//         }
//     }
// }
//----------------------------------------------------------Piramid of Number--------------------------------------------
// import java.util.Scanner;
// public class Day1 {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int i=1;i<=n;i++)
//     {
//         for(int k = 1;k<=n-i;k++)
//         {
//             System.out.print(" ");
//         }
//         for(int j = 1;j<=i;j++)
//         {
//             System.out.print(i+" ");
//         }System.out.println();
//     }
// }
    
// }