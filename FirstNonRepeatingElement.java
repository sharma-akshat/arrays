package array;
import java.util.*;
class FirstNonRepeatingElement
{
    //Approach 1 (bruteforce approach) using nested loops
    static int firstNonRepeated(int[] array,int size)
    {
        for(int i=0;i<size;i++)
        {
            int j;
            for(j=0;j<size;j++)
            {
                if(i!=j && array[i]==array[j]) break;
            }
            if(j==size) return array[i];
        }
        return -1;
    }
    //Time complexity of above code is O(n^2)

    //Approach 2 using HashMap
    static int firstNonRepeating(int[] array,int size)
    {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<size;i++)
        {
            if(m.containsKey(array[i])) m.put(array[i],m.get(array[i])+1);
            else m.put(array[i],1);
        }
        for(int i=0;i<size;i++)
        {
            if(m.get(array[i])==1) return array[i];
        }
        return -1;
    }
    //time complexity for above code is O(n)

    public static void main(String gg[])
    {
        int array1[]={9,4,9,6,7,4};
        int repeated=firstNonRepeated(array1,array1.length); // calling out the bruteforce approach
        if(repeated!=-1) System.out.println("First non repeating element is : "+repeated);
        else System.out.println("There is no non repeating element");

        int array2[]={1,2,3,1,5,2,6,3};
        int index=firstNonRepeating(array2,array2.length); // calling out the optimized approach
        if(index!=-1) System.out.println("The first non repeated element is : "+index);
        else System.out.println("Ther is no non repeated element");
    }
}