package array;

import java.util.*;
class OccurenceOfElement
{
    public int findOccurence(int array[],int size,int x)
    {
        int count=0;
        for(int j=0;j<size;j++)
        {
            if(array[j]==x) count++;
        }
        return count;
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element : ");
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the number to be searched : ");
        int x=sc.nextInt();
        OccurenceOfElement oe=new OccurenceOfElement();
        int occurred=oe.findOccurence(array,size,x);
        if(occurred==0) System.out.println("Element not found");
        else System.out.println("Element occurred "+occurred+" times");        
        sc.close();
    }
}