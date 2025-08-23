// import java.util.Scanner;
// class Day5{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int num1 = sc.nextInt();sc.nextLine();
//         String bina = Integer.toBinaryString(num1);
//         System.out.println("Binary is "+bina);
//         int dec1=Integer.parseInt(bina,2);
//         System.out.println("Decimal is "+dec1);
//         System.out.println("Enter num2:");
//         int num2 = sc.nextInt();sc.nextLine();
//         String binar = Integer.toBinaryString(num2);
//         System.out.println("Binary is "+binar);
//         int dec2 = Integer.parseInt(binar,2);
//         System.out.println("Decimal is "+dec2);
//         int res = dec1 | dec2;
//         System.out.println("Bitwise AND is "+res);
//     }
// }
// import java.util.Scanner;
// public class Day5 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int num = sc.nextInt();sc.nextLine();
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println(num+"*"+i+" = "+num*i);
//         }
//     }
// }
// import java.util.Scanner;
// public class Day5 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int num = sc.nextInt();sc.nextLine();
//         int sum = 0;
//         for(int i = 1;i <= num;i++)
//         {
//             if(i%2==1)
//             {
//                 sum+=i;
//             }
//         }
//         System.out.println(sum);
//     }
// }
// import java.util.Scanner;
// public class Day5 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int num = sc.nextInt();
//         int fac=1;
//         for(int i =1;i<=num;i++)
//         {
//             fac*=i;
//         }
//         System.out.println(fac);
//     }
// }
// import java.util.Scanner;
// public class Day5 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int num = sc.nextInt();
//         int sum=0,rem =0;
//         while(num!=0)
//         {
//             sum = num%10;
//             rem +=sum;
//             num /= 10;
           
//         }
//         System.out.print(rem);
//     }
// }
// import java.util.Scanner;
// public class Day5 {
//     public static int HCF(int num1,int num2) {
//         while(num1!=0)
//         {
//             int temp = num2;
//             num2 = num1%num2;
//             num1 = temp;
//         }
//         return num1;
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter num1:");int num1 = sc.nextInt();
//     System.out.println("Enter num2:");int num2 = sc.nextInt();
//     int hcf = HCF(num1,num2);
//     System.out.println(hcf);
// }
// }
// import java.util.Scanner;
// public class Day5 {
// public static int HCF(int num1,int num2)
// {
// while(num2!=0)
//         {
//             int temp = num2;
//             num2 = num1%num2;
//             num1 = temp;
//         }
//         return num1;
// } 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num1:");
//         int num1 = sc.nextInt();sc.nextLine();
//         System.out.println("Enter num2:");
//         int num2 = sc.nextInt();sc.nextLine();
//         int div = HCF(num1,num2);
//         int LCM = (num1*num2)/div;
//         System.out.println(LCM);
//     }
// }
// import java.util.Scanner;
// public class Day5 {
// public static int rev(int num) {
//     int rev=0,rem=0;
//     while(num!=0)
//     {
//         rem = num%10;
//         rev = rev*10+rem;
//         num /=10;
//     }
//     System.out.println(rev);
//     return rev;
// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int num = sc.nextInt();
//         int num2 = rev(num);
//         if(num==num2)
//         System.out.println("Number is palindrome");
//     }
// }
// import java.util.Scanner;
// public class Day5 {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter num:");
//        int num = sc.nextInt();
//        int dig = (int)Math.log10(num)+1;
//        System.out.println(dig);
//     }
// }
// import java.util.Scanner;
// public class Day5 {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter num:");
//     int num = sc.nextInt();
//     int count = 1;
//     while(count<=num)
//     {
//         int pri=0,hi=1;
//         while(hi<=count)
//         {
//             if(count%hi==0)
//             pri++;
//             hi++;
//         }
//         if(pri==2)
//         System.out.println(count+" ");
//         count++;
//     }
// }
// }
// import java.util.Scanner;
// public class Day5 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter num:");
//         int num = sc.nextInt();
//         int num1 = 0,num2 = 1;
//         while(num1 <= num)
//         {
//             System.out.print(num1+" ");
//             int temp = num1+num2;
//             num1 = num2;
//             num2 = temp;
            
//         }
//     }
// }
// import java.util.Scanner;
// public class Day5 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num1:");
//         int num1 = sc.nextInt();
//         System.out.println("Enter num2:");
//         int num2 = sc.nextInt();
//         num1 = num1+num2-(num2=num1);
//         System.out.println("Swapped num are "+num1+" "+num2);
//     }
// }
// import java.util.Scanner;
// public class Day5 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int num = sc.nextInt();
//         int num2 = num;
//         int dig = (int)Math.log10(num)+1;
//         int sum=0,digi=0;
//         while(num!=0)
//         {
//             digi = num%10;
//             sum+=Math.pow(digi,dig);
//             num/=10;
//         }
//         if(num2==sum)
//         {
//             System.out.println("Its Armstrong");
//         }
//         else
//         System.out.println("Not its not");
//     }
// }