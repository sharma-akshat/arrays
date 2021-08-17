package array;
import java.util.*;
class PairSum
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element: ");
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the number: ");
        int sum=sc.nextInt();
        int count=0;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i]+array[j]==sum) count++;
            }
        }
        System.out.println("Pair count with the given sum are : "+count);
        sc.close();
    }
}