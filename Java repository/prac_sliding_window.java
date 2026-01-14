import java.util.Scanner;
public class prac_sliding_window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] sp1 = str1.split(",");
        String[] sp2 = str2.split(",");
        boolean res = false;
        for(int i=0;i<=sp1.length-sp2.length;i++)
        {
            boolean currntMatch = true;
            for(int j=0;j<sp2.length;j++)
                {
                    if(!sp1[i+j].equals(sp2[j]))
                    {
                        currntMatch = false; 
                        break;
                    }
                }
               if(currntMatch) 
               {
                res = true;
                break;
               }
        }
        if(res)
        System.out.println("true");
        else
        System.out.println("False");
            
            
        }
}
