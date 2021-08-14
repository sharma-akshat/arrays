package array;
import java.util.*;
class IntersectionOfArrays
{
    public void intersection(int[] x,int[] y,int m,int n)
    {
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(x[i]<y[j]) i++;
            else if(y[j]<x[i]) j++;
            else
            {
                System.out.print(x[i]+" ");
                j++;
                i++;
            }
        }
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of 1st array: ");
        int size1=sc.nextInt();
        System.out.println("");
        System.out.print("Enter the size of 2nd array: ");
        int size2=sc.nextInt();
        int array1[]=new int[size1];
        int array2[]=new int[size2];
        for(int i=0;i<size1;i++)
        {
            System.out.print("Enter the element for 1st array: ");
            array1[i]=sc.nextInt();
        }
        int j=0;
        while(j<size2)
        {
            System.out.print("Enter the element for 2nd array: ");
            array2[j]=sc.nextInt();
            j++;
        }
        IntersectionOfArrays in=new IntersectionOfArrays();
        in.intersection(array1,array2,size1,size2);
        sc.close();
    }
}