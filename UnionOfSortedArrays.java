package array;
import java.util.*;
class UnionOfSortedArrays
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st array : ");
        int size1=sc.nextInt();
        System.out.println("Enter the size of 2nd array : ");
        int size2=sc.nextInt();
        int array1[]=new int[size1];
        int array2[]=new int[size2];
        for(int i=0;i<size1;i++)
        {
            System.out.print("Enter the element for 1st array : ");
            array1[i]=sc.nextInt();
        }
        for(int j=0;j<size2;j++)
        {
            System.out.print("Enter the element for 2nd array : ");
            array2[j]=sc.nextInt();
        }
        int i=0,j=0;
        while(i<size1 && j<size2)
        {
            if(array1[i]< array2[j]) System.out.print(array1[i++]+" ");
            else if(array2[j]<array1[i]) System.out.print(array2[j++]+" ");
            else
            {
                 System.out.print(array1[i++]+" ");
                 j++;
            }
        }
        while(i<size1) System.out.print(array1[i++]+" ");
        while(j<size2) System.out.print(array2[j++]+" ");
        sc.close();
    }
}
// time complexity is O(size1+size2) = O(m+n) -- assuming size1 and size2 as m and n
