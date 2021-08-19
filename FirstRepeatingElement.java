package array;
import java.util.*;
class FirstRepeatingElement
{
    //Approach 1
    int firstRepeated(int[] array, int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(array[i]>max); max=array[i];
        }
        int temp[]=new int[max+1];
        Arrays.fill(temp,0);
        for(int x=0;x<max+1;x++)
        {
            int num=array[x];
            temp[num]++;
        }
        for(int x=0;x<max+1;x++)
        {
            int num=array[x];
            if(temp[num]>1) return x;
        }
        return -1;
    }
    //Time complexity for above code is O(n)

    //Approach 2
    void printRepeatingElement(int[] array, int n)
    {
        int index=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=n-1;i>=0;i--)
        {
            if(set.contains(array[i])) index=i;
            else set.add(array[i]);
        }
        if(index!=-1) System.out.println("The first repeating element is : "+array[index]);
        else System.out.println("There are no repating element");
    }
    //Time complexity for above code is O(n)
    
    public static void main(String gg[])
    {
        int array[]={1,2,5,3,6,3,5,7};
        int array2[]={1,2,5,3,6,3,5,7};
        FirstRepeatingElement fre=new FirstRepeatingElement();    
        int index=fre.firstRepeated(array2,array2.length);
        if(index!=-1) System.out.println("First Repeated element is : "+array[index]);
        else System.out.println("No repeating element");
        fre.printRepeatingElement(array,array.length);
    }
}