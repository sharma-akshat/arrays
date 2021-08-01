package array;
import java.util.*;
class SegregateElements
{
    public void segregateElements(long[] array,int size)
        {
            long temp[]=new long[size];
            int j=0;
            for(int i=0;i<size;i++)
            {
                if(array[i]>=0) temp[j++]=array[i];
            }
            if(j==size || j==0) return;
            for(int i=0;i<size;i++)
            {
                if(array[i]<0) temp[j++]=array[i];
            }

            for(int i=0;i<size;i++)
            {
                array[i]=temp[i];
            }
        }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        long array[]=new long[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the element : ");
            array[i]=sc.nextLong();
        }
        SegregateElements se=new SegregateElements();
        se.segregateElements(array,size);
        for(int i=0;i<size;i++)
        {
            System.out.print(" "+array[i]);
        }
        sc.close();
    }
}