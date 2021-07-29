

import java.util.*;
class reverseArray
{
     public static void main(String gg[])
     {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=s.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
          System.out.print("Enter number:");
          x[i]=s.nextInt();
        }
        System.out.println("Reversed array");
        for(int j=n-1;j>=0;j--)System.out.println(x[j]);
     }
}
