// // import java.util.Arrays;
// // import java.util.Scanner;
// // public class Day2{
// //     public static void main(String[] args) {
// //         int[] nn = {5,3,8,9,1};
// //         int[] wn = {0,3,4,5,6};
// //         int[] newarr = new int[nn.length+wn.length] ;
// //         System.arraycopy(nn,0,newarr,0,nn.length);
// //         System.arraycopy(wn,0,newarr,5,wn.length);
// //         Arrays.sort(newarr);
// //         System.out.print(Arrays.toString(newarr));
// //     }
// // }
// import java.util.Arrays;
// import java.util.Scanner;
// public class Day2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int n = sc.nextInt();sc.nextLine();
//         int[] arr = new int[n];
//         int pro = 1;
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             pro*=arr[i];
//         }
//         System.out.print(pro);
//     }
// }
import java.util.Scanner;
import java.util.Arrays;

public class Day2 {
    public static int[] reverse(int[] arr) {
        // Write your code below
        int[] rev = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            rev[i] = arr[arr.length-i-1];
        }
       return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringArr = text.split(",");
        int[] arr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }
        
        int[] result = reverse(arr);
        System.out.println("The reversed array is: " + Arrays.toString(result));
    }
}